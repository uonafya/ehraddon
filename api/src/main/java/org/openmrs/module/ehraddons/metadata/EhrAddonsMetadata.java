package org.openmrs.module.ehraddons.metadata;

import org.openmrs.ConceptClass;
import org.openmrs.api.context.Context;
import org.openmrs.module.ehraddons.EhrAddonsConstants;
import org.springframework.stereotype.Component;

public class EhrAddonsMetadata {
	
	/**
	 * Diagnosis class ID 4
	 * 
	 * @return ConceptClass
	 */
	public static ConceptClass getDiagnosisConceptClass() {
		return Context.getConceptService().getConceptClassByUuid(EhrAddonsConstants._EhrAddOnConceptClasses.DIAGNOSIS_CLASS);
	}
	
}
