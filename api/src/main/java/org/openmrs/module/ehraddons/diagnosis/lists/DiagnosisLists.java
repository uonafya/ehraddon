package org.openmrs.module.ehraddons.diagnosis.lists;

import org.openmrs.module.ehraddons.EhrAddonsConstants;

import java.util.Arrays;
import java.util.List;

import static org.openmrs.module.ehraddons.EhrAddonsConstants.getConcept;

public class DiagnosisLists {
	
	public static List<Integer> getDiarrheaDiagnosisList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRONIC_DIARRHOEA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Protozoal_Diarrhoea).getConceptId());
	}
}
