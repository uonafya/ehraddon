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
		
		public static final String TUBERCULOSIS_OF_OTHER_ORGANS = "112058AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; //	1752
		
		public static final String TUBERCULOSIS_IN_PREGNANCY = "124065AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 4592
				
		public static final String TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM = "136054AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 3860
		
		public static final String MILIARY_TUBERCULOSIS = "115753AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 1708
		
		public static final String PULMONARY_TUBERCULOSIS = "42AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 1010
				
		public static final String RESPIRATORY_TUBERCULOSIS = "113303AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 4298
		
		public static final String EXTRAPULMONARY_TUBERCULOSIS = "156204AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 1470
		
		public static final String ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED = "121986AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 4148
		
		
		public static final String MULTI_DRUG_RESISTANT_TUBERCULOSIS = "159345AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 1213

		public static final String MUMPS = '133671AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		//fever
		public static final String FEVERS = '140238AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String YELLOW_FEVER = '122759AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		public static final String EPHEMERAL_FEVER = '121039AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String MALARIAL_FEVER = '116125AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String PUERPERAL_FEVER = '113511AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		public static final String CONFIRMED_MALARIA = '160148AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String URINARY_TRACT_INFECTION = '111633AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String TYPHOID_FEVER = '1141AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		public static final String BILHARZIA_SCHISTOSOMIASIS = '117152AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String INTERSTINAL_WORMS = '116699AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String MALNUTRITION = '115122AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		public static final String ANAEMIA = '121629AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String EYE_INFECTIONS = '140832AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		public static final String GONOCOCCAL_INFECTIONOFEYE = '117770AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		// Chronic Ear Infection


		public static final String CHRONIC_EAR_INFECTION = '117087AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String VIRAL_EAR_INFECTION = '123119AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String CHRONIC_EXTERNAL_EAR_INFECTION = '110889AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		//Respiratory Tract Infections

		public static final String ACUTE_UPPER_RESPIRATORY_INFECTION='149478AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String VIRAL_UPPER_RESPIRATORY_TRACT_INFECTION = '123093AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String RECURRENT_UPPER_RESPIRATORY_TRACT_INFECTION = '127784AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		public static final String ASTHMA='121375AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String TONSILLITIS = '112AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String PNEUMONIA = '114100AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		public static final String CHRONIC_DISEASE_OF_RESPIRATORY_SYSTEM='145437AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String DISORDER_OF_UPPER_RESPIRATORY_SYSTEM = '141964AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';



		public static final String MENTAL_DISORDER='134337AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String DENTAL_DISORDERS = '151733AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String DISEASES_OF_THE_SKIN = '119022AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		public static final String DISEASE_OF_RESPIRATORY_SYSTEM = '119051AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		public static final String CHROMOSOMAL_ABNORMALITIES = "145521AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		public static final String CONGENITAL_ANOMALIES = "144025AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";

		public static final String POISONING = "114088AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 1026

		public static final String DEATHS_DUE_TO_ROAD_TRAFFIC_INJURIES ="86AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; 

		public static final String FOOT_INJURIES = '116860AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String FOOT_INJURIES_WRIST_INJURIES = '116767AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';



		public static final String SEXUAL_ASSAULT = "126582AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 1026

		public static final String BURNS ="146623AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; 

		public static final String SNAKE_BITE = '126323AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String DOG_BITE = '166AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String OTHER_BITE = '116757AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		public static final String DIABETES = '119481AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		public static final String EPILEPSY ="155AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; 

		public static final String CONVULSIVE_DISORDERS = '116757AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		public static final String NEWLY_DIAGNOSED_HIV = '160170AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		public static final String  BRUCELLOSIS = '121005AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		public static final String RICKETS = '127394AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';

		public static final String CARDIOVASCULAR_CONDITIONS = '119270AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';
		public static final String VIOLENCE_RELATED_INJURIES = '141814AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';



		

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
			catch (Exception e) {
				throw new RuntimeException(e.toString());
			}
		}
		return c;
	}
}
