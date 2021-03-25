package org.openmrs.module.ehraddons.reporting.library.common;

import org.openmrs.api.context.Context;
import org.openmrs.module.ehraddons.reporting.calculation.EncountersBasedOnDaySuppliedCalculation;
import org.openmrs.module.ehraddons.reporting.calculation.NewAndRevisitPatientCalculation;
import org.openmrs.module.kenyacore.report.cohort.definition.CalculationCohortDefinition;
import org.openmrs.module.reporting.cohort.definition.AgeCohortDefinition;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.GenderCohortDefinition;
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
		CalculationCohortDefinition cd = new CalculationCohortDefinition("Encounters per day",
		        new EncountersBasedOnDaySuppliedCalculation());
		cd.addParameter(new Parameter("endDate", "End Date", Date.class));
		cd.addCalculationParameter("day", day);
		return cd;
	}

	/**
	 * Patients who have encounters on date
	 *
	 * @return @{@link CohortDefinition}
	 */
	public CohortDefinition getPatientsWhoAreNewOrRevisits(String state) {
		CalculationCohortDefinition cd = new CalculationCohortDefinition("state",
				new NewAndRevisitPatientCalculation());
		cd.addParameter(new Parameter("endDate", "End Date", Date.class));
		cd.addCalculationParameter("state", state);
		return cd;
	}

	/**
	 * Get patients dimesion age
	 * @param minAge
	 * @param maxAge
	 * @return
	 */
	public CohortDefinition createXtoYAgeCohort(Integer minAge, Integer maxAge) {
		AgeCohortDefinition xToYCohort = new AgeCohortDefinition();
		xToYCohort.setName("age");
		if (minAge != null) {
			xToYCohort.setMinAge(minAge);
		}
		if (maxAge != null) {
			xToYCohort.setMaxAge(maxAge);
		}
		xToYCohort.addParameter(new Parameter("effectiveDate", "effectiveDate", Date.class));
		return xToYCohort;
	}

	/**
	 * Patients who are female
	 *
	 * @return the cohort definition
	 */
	public CohortDefinition femaleCohort() {
		GenderCohortDefinition cohort = new GenderCohortDefinition();
		cohort.setName("femaleCohort");
		cohort.setFemaleIncluded(true);
		cohort.setMaleIncluded(false);
		return cohort;
	}

	/**
	 * Patients who are male
	 *
	 * @return the cohort definition
	 */
	public CohortDefinition maleCohort() {
		GenderCohortDefinition cohort = new GenderCohortDefinition();
		cohort.setName("maleCohort");
		cohort.setMaleIncluded(true);
		cohort.setFemaleIncluded(false);
		return cohort;
	}
}
