package org.openmrs.module.ehraddons.reporting.library.cohorts;

import org.openmrs.annotation.Authorized;
import org.openmrs.module.ehraddons.metadata.EhrAddonsMetadata;
import org.openmrs.module.ehraddons.reporting.library.queries.Moh705Queries;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.SqlCohortDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;

import java.util.Date;
import java.util.List;

@Component
public class Moh705aCohortDefinition {
	
	private EhrAddonsMetadata ehrAddonsMetadata;
	
	@Autowired
	public Moh705aCohortDefinition(EhrAddonsMetadata ehrAddonsMetadata) {
		this.ehrAddonsMetadata = ehrAddonsMetadata;
	}
	
	/**
	 * Get adult patients who have given diagnosis - MOH705A
	 * 
	 * @return @{@link org.openmrs.module.reporting.cohort.definition.CohortDefinition}
	 */
	public CohortDefinition getChildrenPatientsWhoHaveDiagnosis(List<Integer> list) {
		SqlCohortDefinition cd = new SqlCohortDefinition();
		cd.setName("Get children patients who have diagnosis based on list of concepts");
		cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
		cd.addParameter(new Parameter("endDate", "End Date", Date.class));
		cd.setQuery(Moh705Queries.getChildrenPatientsWhoMatchDiagnosisBasedOnConcepts(ehrAddonsMetadata
		        .getDiagnosisConceptClass().getConceptClassId(), list));
		return cd;
	}
}
