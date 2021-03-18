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
		
		public static final String CHRONIC_DIARRHOEA = "5018AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 5018
		
		public static final String Protozoal_Diarrhoea = "113585AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; // 113585
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
