package org.openmrs.module.ehraddons.reporting.library.dataset;

import org.openmrs.module.ehraddons.diagnosis.lists.DiagnosisLists;
import org.openmrs.module.ehraddons.reporting.library.dimesions.EhrAddonDimesion;
import org.openmrs.module.ehraddons.reporting.library.indicator.Moh705IndicatorDefinitions;
import org.openmrs.module.ehraddons.reporting.utils.EhrAddonUtils;
import org.openmrs.module.ehraddons.utils.EhrReportingUtils;
import org.openmrs.module.kenyacore.report.ReportUtils;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.DataSetDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Moh705bDatasetDefinition {
	
	private Moh705IndicatorDefinitions moh705aIndicator;
	
	private EhrAddonDimesion ehrAddonDimesion;
	
	@Autowired
	public Moh705bDatasetDefinition(Moh705IndicatorDefinitions moh705aIndicator, EhrAddonDimesion ehrAddonDimesion) {
		this.moh705aIndicator = moh705aIndicator;
		this.ehrAddonDimesion = ehrAddonDimesion;
	}
	
	/**
	 * Get moh 705 a dataset
	 * 
	 * @return @{@link DataSetDefinition}
	 */
	public DataSetDefinition getMoh705bDataset() {
		CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
		String indParam = "startDate=${startDate},endDate=${endDate}";
		//dsd.addDimension("days", ReportUtils.map(ehrAddonDimesion.encountersOfMonthPerDay(), "endDate=${endDate}"));
		dsd.setName("MOH705B");
		dsd.addParameter(new Parameter("startDate", "Start Date", Date.class));
		dsd.addParameter(new Parameter("endDate", "End Date", Date.class));
		dsd.addDimension("day", ReportUtils.map(ehrAddonDimesion.encountersOfMonthPerDay(), "endDate=${endDate}"));
		;
		// populate datasets
		//getDiarrhoea(dsd, indParam);
		EhrReportingUtils.addRow(dsd, "DA", "Diarrhoea", ReportUtils.map(
		    moh705aIndicator.getAllAdultPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList()), indParam),
		    EhrAddonUtils.getAdultChildrenColumns());
		
		//getTuberculosis(dsd, indParam);
		//getDysentery(dsd, "DYA", "Dysentery", indParam);
		//getCholera(dsd, "CHA", "Cholera", indParam);
		//getMeningococcalMeningitis(dsd, "MMA", "Meningitis", indParam);
		
		//getOtherMeningitis(dsd, "MOA", "OtherMeningitis", indParam);
		//getNeonatalTetanus(dsd, "NTA", "Neonatal Tetanus", indParam);
		//getPoliomyelitis(dsd, "PMA", "Poliomyelitis", indParam);
		//getChickenPox(dsd, "CPA", "Chicken pox", indParam);
		//getMeasles(dsd, "MEA", "Measles", indParam);
		//getHepatitis(dsd, "HEA", "Hepatitis", indParam);
		//getMumps(dsd, "MUA", "Mumps", indParam);
		//getFevers(dsd, "FEA", "Fevers", indParam);
		
		//		getSuspectedMalaria(dsd, "SUA", "Suspected malaria", indParam);
		//		getConfirmedMalaria(dsd, "COA", "Malaria positive", indParam);
		//		getMalariaInPregnancy(dsd, "MPA", "Malaria In Pregnancy", indParam);//
		//		getTyphoidFever(dsd, "TYA", "Typhoid Fever", indParam);
		//		getSexuallyTransmittedInfections(dsd, "STIA", "STI", indParam);
		//		getUrinaryTractInfection(dsd, "URA", "Urinary tract infection", indParam);
		//		getBilharzia(dsd, "BIA", "Bilharzia", indParam);
		//		getIntestinalWorms(dsd, "INA", "Intestinal worms", indParam);
		//		getMalnutrition(dsd, "MLA", "Malnutrition", indParam);//
		//		getAneamia(dsd, "ANA", "Aneamia", indParam);
		//		getEyeInfections(dsd, "EYA", "Eye Infections", indParam);
		//		getOtherEyeConditions(dsd, "OTA", "Other Eye Conditions", indParam);
		//		getEarInfectionConditions(dsd, "EAA", "Ear Infection or Conditions", indParam);
		//		getUpperRespiratoryTractInfections(dsd, "UPA", "URTI", indParam);
		//		getAsthma(dsd, "ASA", "Asthma", indParam);
		//		getPneumonia(dsd, "PNA", "Pneumonia", indParam);
		//		getOtherDisOfRespiratorySystem(dsd, "ORA", "Other Dis Of Resp System", indParam);//
		//		getAbortion(dsd, "ABA", "Abortion", indParam);//
		//		getDisOfPuerperiumChildbath(dsd, "DPC", "Puerperium  Childbath", indParam);//
		//		getHypertension(dsd, "HYA", "Hypertension", indParam);
		//		getDentalDisorders(dsd, "DEA", "Dental Disorders", indParam);
		//		getJiggersInfestation(dsd, "JIA", "Jiggers Infestation", indParam);
		//		getDiseaseOfTheSkin(dsd, "DSA", "Disease Of The Skin", indParam);//
		//		getAnthritisJointPains(dsd, "AJA", "Anthritis, joint pains", indParam);//
		//		getPoisoning(dsd, "POA", "Poisoning", indParam);//
		//		getRoadTrafficInjuries(dsd, "ROA", "Road Traffic Injuries", indParam);
		//		getOtherInjuries(dsd, "OIA", "Other Injuries", indParam);//
		//		getSexualAssault(dsd, "SEA", "Sexual Assault", indParam);
		//		getViolenceRelatedInjuries(dsd, "VIA", "Violence Related Injuries", indParam);
		//		getBurns(dsd, "BUA", "Burns", indParam);
		//		getSnakeBites(dsd, "SNA", "Snake bites", indParam);
		//		getDogBites(dsd, "DOA", "Dog Bites", indParam);
		//		getOtherBites(dsd, "OBA", "Other Bites", indParam);//
		//		getDiabetes(dsd, "DTA", "Diabetes", indParam);//
		//		getEpilepsy(dsd, "EPA", "Epilepsy", indParam);
		//		getNewlyDiagnosedHiv(dsd, "NHA", "Newly Diagnosed Hiv", indParam);//
		//		getBrucellosis(dsd, "BRA", "Brucellosis", indParam);//
		//		getCardiovascularConditions(dsd, "CAA", "Cardiovascular Conditions", indParam);
		//		getOvrerweight(dsd, "OVA", "Ovrerweight", indParam);
		//		getMuscularSkeletalConditions(dsd, "MSA", "Muscular Skeletal Conditions", indParam);
		//		getFistulaBirthRelated(dsd, "FIA", "Fistula Birth Related", indParam);
		//		getNeoplams(dsd, "NSA", "Neoplams)", indParam);
		//		getPhysicalDisability(dsd, "PHA", "Physical Disability", indParam);//
		//		getTryponomiasis(dsd, "TRA", "Tryponomiasis", indParam);
		//		getKalazarLeishmaniasis(dsd, "KAA", "Kalazar leishmaniasis", indParam);
		//		getDaracuncolosisGuineaWorm(dsd, "SAA", "Daracuncolosis guinea worm", indParam);
		//		getYellowFever(dsd, "YEA", "Yellow Fever", indParam);
		//		getViralHaemorrhagicFever(dsd, "VHA", "Viral Haemorrhagic Fever", indParam);//
		//		getPlague(dsd, "PLA", "Plague", indParam);//
		//		getDeathDueToRoadTrafficInjuries(dsd, "DRA", "Death due to road traffic injuries", indParam);//
		//		getAllOtherDiseases(dsd, "ALA", "All other diseases", indParam);//
		//		getNoOfFirstAttendances(dsd, "NOA", "No Of first attendances", indParam);//
		//		getReAttendances(dsd, "RAA", "No. Of first attendances", indParam);//
		//		getReferralsFromOtherHealthFacility(dsd, "RHA", "Health facility Referrals", indParam);
		//		getReferralsFromOtherCommunityUnit(dsd, "RCA", "Referrals from community unit", indParam);
		//		getReferralsToCommunityUnit(dsd, "RCTA", "Referrals to community unit", indParam);//
		//		
		return dsd;
		
	}
}
