package org.openmrs.module.ehraddons.reporting.calculation;

import org.openmrs.Visit;
import org.openmrs.calculation.patient.PatientCalculationContext;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.calculation.result.ListResult;
import org.openmrs.module.kenyacore.calculation.AbstractPatientCalculation;
import org.openmrs.module.kenyacore.calculation.BooleanResult;
import org.openmrs.module.kenyacore.calculation.CalculationUtils;
import org.openmrs.module.kenyacore.report.data.patient.definition.VisitsForPatientDataDefinition;
import org.openmrs.module.reporting.common.TimeQualifier;

import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class NewAndRevisitPatientCalculation extends AbstractPatientCalculation {
    @Override
    public CalculationResultMap evaluate(Collection<Integer> cohort, Map<String, Object> map, PatientCalculationContext context) {
        CalculationResultMap resultMap = new CalculationResultMap();
        String state = (String) map.get("state");
        Calendar amonthAgo = Calendar.getInstance();
        amonthAgo.setTime(context.getNow());
        amonthAgo.add(Calendar.MONTH, -1);

        VisitsForPatientDataDefinition visitsDef = new VisitsForPatientDataDefinition();
        visitsDef.setWhich(TimeQualifier.ANY);
        visitsDef.setStartedOnOrAfter(amonthAgo.getTime());
        visitsDef.setStartedOnOrBefore(context.getNow());

        CalculationResultMap visitData = CalculationUtils.evaluateWithReporting(visitsDef, cohort, map, null,
                context);

        for (Integer pId : cohort) {
            boolean revisit = false;
            ListResult listResult = (ListResult) visitData.get(pId);
            List<Visit> visitList = CalculationUtils.extractResultValues(listResult);
            for (Visit visit : visitList) {
                if ("NEW".equals(state) && visit.getStartDatetime().compareTo(context.getNow()) <= 0)
                {
                    revisit = true;
                }
                else if ("RVT".equals(state) && visit.getStartDatetime().compareTo(context.getNow()) > 0)
                {
                    revisit = false;
                }
            }
            resultMap.put(pId, new BooleanResult(revisit, this));
        }

        return resultMap;
    }
}
