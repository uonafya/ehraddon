package org.openmrs.module.ehraddons;

import org.openmrs.Concept;
import org.openmrs.api.context.Context;

public class EhrAddonsConstants {
	
	public final class _EhrAddOnConceptClasses {
		
		public static final String DIAGNOSIS_CLASS = "8d4918b0-c2cc-11de-8d13-0010c6dffd0f"; // 4
		
		public static final String FINDING_CLASS = "8d491a9a-c2cc-11de-8d13-0010c6dffd0f"; // 5
		
		public static final String SYMPTOMS_CLASS = "8d492954-c2cc-11de-8d13-0010c6dffd0f"; // 12
		
		public static final String SYMPTOMS_FINDING_CLASS = "8d492b2a-c2cc-11de-8d13-0010c6dffd0f"; // 13
		
	}
	
	public final class _EhrAddOnConcepts {
		
		// Diarrhoe
		public static final String ACUTE_DIARRHEA = "149856AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		
		public static final String DIARRHEA_UNSPECIFIED = "91e4a7f4-f3d1-455e-991e-eb64a4df415b";
		
		public static final String FUNCTIONAL_DIARRHOEA = "139753AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		
		public static final String CHRONIC_DIARRHOEA = "5018AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		
		//		public static final String DIARRHOEA_AND_GASTROENTERITIS_OF_PRESUMED_INFECTIOUS_ORIGIN =
		//				"882643b0-55aa-4385-9aee-9a017bc8c6a4";
		public static final String Hemorrhagic_Diarrhea = "138868AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		
		public static final String Bacterial_Gastroenteritis = " 148023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
	}
	
	/**
	 * @return the Concept that matches the passed uuid, name, source:code mapping, or primary key
	 *         id
	 */
	public static Concept getConcept(String lookup) {
		Concept c = Context.getConceptService().getConceptByUuid(lookup);
		if (c == null) {
			c = Context.getConceptService().getConceptByName(lookup);
		}
		if (c == null) {
			try {
				String[] split = lookup.split("\\:");
				if (split.length == 2) {
					c = Context.getConceptService().getConceptByMapping(split[1], split[0]);
				}
			}
			catch (Exception e) {}
		}
		if (c == null) {
			try {
				c = Context.getConceptService().getConcept(Integer.parseInt(lookup));
			}
			catch (Exception e) {}
		}
		return c;
	}
}
