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
public class Moh705aDatasetDefinition {
	
	private Moh705IndicatorDefinitions moh705aIndicator;
	
	private EhrAddonDimesion ehrAddonDimesion;
	
	@Autowired
	public Moh705aDatasetDefinition(Moh705IndicatorDefinitions moh705aIndicator, EhrAddonDimesion ehrAddonDimesion) {
		this.moh705aIndicator = moh705aIndicator;
		this.ehrAddonDimesion = ehrAddonDimesion;
	}
	
	/**
	 * Get moh 705 a dataset
	 * 
	 * @return @{@link org.openmrs.module.reporting.dataset.definition.DataSetDefinition}
	 */
	public DataSetDefinition getMoh705aDataset() {
		CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
		String indParam = "startDate=${startDate},endDate=${endDate}";
		//dsd.addDimension("days", ReportUtils.map(ehrAddonDimesion.encountersOfMonthPerDay(), "endDate=${endDate}"));
		dsd.setName("MOH705A");
		dsd.addParameter(new Parameter("startDate", "Start Date", Date.class));
		dsd.addParameter(new Parameter("endDate", "End Date", Date.class));
		dsd.addDimension("day", ReportUtils.map(ehrAddonDimesion.encountersOfMonthPerDay(), "endDate=${endDate}"));
		// populate datasets
		//getDiarrhoea(dsd, indParam);
		EhrReportingUtils.addRow(dsd, "DC", "Diarrhoea", ReportUtils.map(
		    moh705aIndicator.getAllChildrenPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList()), indParam),
		    EhrAddonUtils.getAdultChildrenColumns());
		EhrReportingUtils.addRow(dsd, "TC", "Tuberculosis", ReportUtils.map(
		    moh705aIndicator.getAllChildrenPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList()), indParam),
		    EhrAddonUtils.getAdultChildrenColumns());
		EhrReportingUtils.addRow(dsd, "DYC", "Dysentery", ReportUtils.map(
		    moh705aIndicator.getAllChildrenPatientsWithDiagnosis(DiagnosisLists.getDysenteryList()), indParam),
		    EhrAddonUtils.getAdultChildrenColumns());
		/*getCholera(dsd, indParam);
		getMeningococcalMeningitis(dsd, indParam);
		getOtherMenigitis(dsd, indParam);
		getPoliomyelitis(dsd, indParam);
		getNeonatalTetanus(dsd, indParam);
		getChickenPox(dsd, indParam);
		getMeasles(dsd, indParam);
		getHepatitis(dsd, indParam);
		getMumps(dsd, indParam);
		getFevers(dsd, indParam);
		getSuspectedMalaria(dsd, indParam);
		getConfirmedMalaria(dsd, indParam);
		getUrinaryTractInfection(dsd, indParam);
		getTyphoid(dsd, indParam);
		getBilharzia(dsd, indParam);
		getInterstinalworms(dsd, indParam);
		getMalnutrition(dsd, indParam);
		getAnaemia(dsd, indParam);
		getEyeInfections(dsd, indParam);
		getOtherEyeConditions(dsd, indParam);
		getEarInfectionsConditions(dsd, indParam);
		getUpperRespiratoryTractInfections(dsd, indParam);
		getAsthma(dsd, indParam);*/
		
		return dsd;
		
	}
	
}
