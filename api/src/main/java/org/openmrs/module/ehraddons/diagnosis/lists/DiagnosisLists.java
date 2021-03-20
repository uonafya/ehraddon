package org.openmrs.module.ehraddons.diagnosis.lists;

import org.openmrs.module.ehraddons.EhrAddonsConstants;

import java.util.Arrays;
import java.util.List;

import static org.openmrs.module.ehraddons.EhrAddonsConstants.getConcept;

public class DiagnosisLists {
	
	public static List<Integer> getDiarrheaDiagnosisList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRONIC_DIARRHOEA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_DIARRHEA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.DIARRHEA_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FUNCTIONAL_DIARRHOEA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Hemorrhagic_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Bacterial_Gastroenteritis).getConceptId());
	}
}
