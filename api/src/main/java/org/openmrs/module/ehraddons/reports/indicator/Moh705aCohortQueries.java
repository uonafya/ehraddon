package org.openmrs.module.ehraddons.reports.indicator;

import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.SqlCohortDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Moh705aCohortQueries {
	
	/**
	 * Get all patients in the facility as a count
	 * 
	 * @return CohortDefinition
	 */
	public CohortDefinition getAllPatients() {
		SqlCohortDefinition sql = new SqlCohortDefinition();
		sql.setName("All patients");
		sql.addParameter(new Parameter("startDate", "Start date", Date.class));
		sql.addParameter(new Parameter("endDate", "End date", Date.class));
		sql.setQuery("SELECT p.patient_id FROM patient p INNER JOIN encounter e ON p.patient_id=e.patient_id "
		        + "WHERE e.encounter_datetime BETWEEN :startDate AND :endDate");
		return sql;
	}
}
