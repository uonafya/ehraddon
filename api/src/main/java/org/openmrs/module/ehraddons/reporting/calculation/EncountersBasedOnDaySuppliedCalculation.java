package org.openmrs.module.ehraddons.reporting.calculation;

import org.openmrs.Encounter;
import org.openmrs.calculation.patient.PatientCalculationContext;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.calculation.result.ListResult;
import org.openmrs.module.kenyacore.calculation.AbstractPatientCalculation;
import org.openmrs.module.kenyacore.calculation.BooleanResult;
import org.openmrs.module.kenyacore.calculation.CalculationUtils;
import org.openmrs.module.kenyacore.calculation.Calculations;
import org.springframework.stereotype.Component;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class EncountersBasedOnDaySuppliedCalculation extends AbstractPatientCalculation {
	
	@Override
	public CalculationResultMap evaluate(Collection<Integer> cohort, Map<String, Object> parameterValues,
	        PatientCalculationContext context) {
		CalculationResultMap resultMap = new CalculationResultMap();
		Integer day = (Integer) parameterValues.get("day");
		Date startDate = null;
		Date endDate = (Date) context.getFromCache("onOrBefore");
		if (endDate != null) {
			startDate = getDateAdayEarlier(getDateBasedOnValue(endDate, 1), -1);
		}
		CalculationResultMap allEncounters = Calculations.allEncounters(null, cohort, context);
		for (Integer pId : cohort) {
			boolean found = false;
			ListResult listResult = (ListResult) allEncounters.get(pId);
			List<Encounter> encounterList = CalculationUtils.extractResultValues(listResult);
			for (Encounter encounter : encounterList) {
				if (day != null
				        && endDate != null
				        && formatDate(encounter.getEncounterDatetime())
				                .equals(formatDate(getDateBasedOnValue(endDate, day)))) {
					found = true;
					break;
				}
			}
			resultMap.put(pId, new BooleanResult(found, this));
		}
		return resultMap;
	}
	
	private Date getDateBasedOnValue(Date date, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		
		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(year, month, day);
		
		return calendar1.getTime();
	}
	
	private Date getDateAdayEarlier(Date date, int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, days);
		return calendar.getTime();
	}
	
	private String formatDateWithTime(Date date) {
		
		Format formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		return formatter.format(date);
	}
	
	private String formatDate(Date date) {
		
		Format formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		return formatter.format(date);
	}
}
