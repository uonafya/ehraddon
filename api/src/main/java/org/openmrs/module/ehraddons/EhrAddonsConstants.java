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
		
		//		public static final String DIARRHEA_UNSPECIFIED = "91e4a7f4-f3d1-455e-991e-eb64a4df415b";
		
		public static final String FUNCTIONAL_DIARRHOEA = "139753AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		
		public static final String CHRONIC_DIARRHOEA = "5018AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		
		//		public static final String DIARRHOEA_AND_GASTROENTERITIS_OF_PRESUMED_INFECTIOUS_ORIGIN =
		//				"882643b0-55aa-4385-9aee-9a017bc8c6a4";
		public static final String Hemorrhagic_Diarrhea = "138868AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		
		public static final String Bacterial_Gastroenteritis = "148023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		
		// TUBERCULORSIS
		public static final String TUBERCULOSIS = "112141AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; //
		
		public static final String TUBERCULOSIS_OF_OTHER_ORGANS = "d7224d92-0127-4d3c-a12b-93109a25ceaf"; //	1752
		
		public static final String TUBERCULOSIS_IN_PREGNANCY = "112058AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 4592
		
		//public static final String TUBERCULOSIS_AFFECTING_CENTRAL_NERVOUS_SYSTEM = "6033961c-e8a2-4311-a89e-7b69b8a87a63"; // 1707
		
		//public static final String TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM = "bfcc9a7d-e8ff-48a1-8426-e3a216bfc7f8"; // 3860
		
		public static final String MILIARY_TUBERCULOSIS = "115753AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 1708
		
		public static final String PULMONARY_TUBERCULOSIS = "9ef76020-1a6e-4cfe-9f62-677ad7fac39a"; // 1010
		
		public static final String SEQUELAE_OF_TUBERCULOSIS = "e933d281-3c45-46b9-8578-7cee326f37cc"; // 4542
		
		public static final String RESPIRATORY_TUBERCULOSIS = "c2e4d884-479c-47dd-9c4e-4bd19f9d3710"; // 4298
		
		public static final String RESPIRATORY_TUBERCULOSIS_UNSPECIFIED = "d21e4073-6108-466d-b8b4-c7d1159cfdd5"; // 4061
		
		public static final String TUBERCULOSIS_HISTOLOGICALLY_CONFIRMED = "90436397-d5cf-436a-88f7-d085f345a932"; // 4059
		
		public static final String RESPIRATORY_TUBERCULOSIS_NOT_CONFIRMED_BACTERIOLOGICALLY_AND_HISTOLOGICALLY = "8bc742a3-79c6-45ba-b08f-63e5bb3435a6"; // 4060
		
		public static final String EXTRAPULMONARY_TUBERCULOSIS = "d4abcfe0-220b-4705-919e-e56da47ed457"; // 1470
		
		public static final String ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED = "11357e6d-b1e0-4baf-a3f3-9d834e898e13"; // 4148
		
		public static final String OTHER_RESPIRATORY_TUBERCULOSIS = "790d94a5-125a-4876-8982-12d38745bfb6"; // 4316
		
		public static final String MULTI_DRUG_RESISTANT_TUBERCULOSIS = "790d94a5-125a-4876-8982-12d38745bfb6"; // 1213
		
		public static final String SPUTUM_POSITIVE_PULMONARY_TUBERCULOSIS = "c2f51eb4-620e-467b-b320-869a03c480b1"; // 1527
		
		public static final String SPUTUM_NEGATIVE_PULMONARY_TUBERCULOSIS = "ee870d08-9086-4f22-93a7-bfcf61dc3f36"; // 1525
		
		public static final String CONTACT_WITH_AND_SUSPECTED_EXPOSURE_TO_TUBERCULOSIS = "ab9510a4-ec6e-412f-b541-3b86e07ea7d8"; // 4047
		
		public static final String ENCOUNTER_FOR_SCREENING_FOR_RESPIRATORY_TUBERCULOSIS = "645188a4-4348-406f-a91d-f90e723359fb"; // 4366
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