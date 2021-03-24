package org.openmrs.module.ehraddons.reporting.library.cohorts;

import org.openmrs.module.ehraddons.metadata.EhrAddonsMetadata;
import org.openmrs.module.ehraddons.reporting.calculation.EncountersBasedOnDaySuppliedCalculation;
import org.openmrs.module.ehraddons.reporting.library.queries.Moh705Queries;
import org.openmrs.module.kenyacore.report.ReportUtils;
import org.openmrs.module.kenyacore.report.cohort.definition.CalculationCohortDefinition;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.CompositionCohortDefinition;
import org.openmrs.module.reporting.cohort.definition.SqlCohortDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class Moh705aCohortDefinition {
	
	/**
	 * Get adult patients who have given diagnosis - MOH705A
	 * 
	 * @return @{@link org.openmrs.module.reporting.cohort.definition.CohortDefinition}
	 */
	public CohortDefinition getPatientsWhoHaveDiagnosis705A(List<Integer> list) {
		SqlCohortDefinition cd = new SqlCohortDefinition();
		cd.setName("Get children patients who have diagnosis based on list of concepts");
		cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
		cd.addParameter(new Parameter("endDate", "End Date", Date.class));
		cd.setQuery(Moh705Queries.getChildrenPatientsWhoMatchDiagnosisBasedOnConcepts(EhrAddonsMetadata
		        .getDiagnosisConceptClass().getConceptClassId(), list));
		return cd;
	}
	
	public CohortDefinition getPatientsWhoHaveDiagnosis705B(List<Integer> list) {
		SqlCohortDefinition cd = new SqlCohortDefinition();
		cd.setName("Get adults patients who have diagnosis based on list of concepts");
		cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
		cd.addParameter(new Parameter("endDate", "End Date", Date.class));
		cd.setQuery(Moh705Queries.getChildrenPatientsWhoMatchDiagnosisBasedOnConcepts(EhrAddonsMetadata
		        .getDiagnosisConceptClass().getConceptClassId(), list));
		return cd;
	}
	
}
