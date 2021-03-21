package org.openmrs.module.ehraddons.reporting.library.common;

import org.openmrs.api.context.Context;
import org.openmrs.module.ehraddons.reporting.calculation.EncountersBasedOnDaySuppliedCalculation;
import org.openmrs.module.kenyacore.report.cohort.definition.CalculationCohortDefinition;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.springframework.stereotype.Component;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;

import java.util.Date;

@Component
public class EhrAddonCommons {
	
	/**
	 * Patients who have encounters on date
	 * 
	 * @return @{@link CohortDefinition}
	 */
	public CohortDefinition getPatientsHavingEncountersOnDate(int day) {
		CalculationCohortDefinition cd = new CalculationCohortDefinition("Encounters per day", Context
		        .getRegisteredComponents(EncountersBasedOnDaySuppliedCalculation.class).get(0));
		cd.addParameter(new Parameter("onOrBefore", "On or before Date", Date.class));
		cd.addParameter(new Parameter("onOrAfter", "On or After Date", Date.class));
		cd.addCalculationParameter("day", day);
		return cd;
	}
}
