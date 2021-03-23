package org.openmrs.module.ehraddons.reporting.library.dataset;

import org.openmrs.module.ehraddons.diagnosis.lists.DiagnosisLists;
import org.openmrs.module.ehraddons.reporting.library.indicator.Moh705bIndicatorDefinition;
import org.openmrs.module.kenyacore.report.ReportUtils;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.DataSetDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Moh705bDatasetDefinition extends EhrAddOnBaseDataSet {
	
	private Moh705bIndicatorDefinition moh705bIndicator;
	
	@Autowired
	public Moh705bDatasetDefinition(Moh705bIndicatorDefinition moh705bIndicator) {
		this.moh705bIndicator = moh705bIndicator;
	}
	
	private void getTuberculosis(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("TBA1", "Tuberculosis-T1", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 1), indParam), "");
		dsd.addColumn("TBA2", "Tuberculosis-T2", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 2), indParam), "");
		dsd.addColumn("TBA3", "Tuberculosis-T3", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 3), indParam), "");
		dsd.addColumn("TBA4", "Tuberculosis-T4", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 4), indParam), "");
		dsd.addColumn("TBA5", "Tuberculosis-T5", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 5), indParam), "");
		dsd.addColumn("TBA6", "Tuberculosis-T6", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 6), indParam), "");
		dsd.addColumn("TBA7", "Tuberculosis-T7", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 7), indParam), "");
		dsd.addColumn("TBA8", "Tuberculosis-T8", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 8), indParam), "");
		dsd.addColumn("TBA9", "Tuberculosis-T9", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 9), indParam), "");
		dsd.addColumn("TBA10", "Tuberculosis-T10", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 10), indParam), "");
		dsd.addColumn("TBA11", "Tuberculosis-T11", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 11), indParam), "");
		dsd.addColumn("TBA12", "Tuberculosis-T12", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 12), indParam), "");
		dsd.addColumn("TBA13", "Tuberculosis-T13", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 13), indParam), "");
		dsd.addColumn("TBA14", "Tuberculosis-T14", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 14), indParam), "");
		dsd.addColumn("TBA15", "Tuberculosis-T15", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 15), indParam), "");
		dsd.addColumn("TBA16", "Tuberculosis-T16", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 16), indParam), "");
		dsd.addColumn("TBA17", "Tuberculosis-T17", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 17), indParam), "");
		dsd.addColumn("TBA18", "Tuberculosis-T18", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 18), indParam), "");
		dsd.addColumn("TBA19", "Tuberculosis-T19", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 19), indParam), "");
		dsd.addColumn("TBA20", "Tuberculosis-T20", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 20), indParam), "");
		dsd.addColumn("TBA21", "Tuberculosis-T21", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 21), indParam), "");
		dsd.addColumn("TBA22", "Tuberculosis-T22", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 22), indParam), "");
		dsd.addColumn("TBA23", "Tuberculosis-T23", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 23), indParam), "");
		dsd.addColumn("TBA24", "Tuberculosis-T24", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 24), indParam), "");
		dsd.addColumn("TBA25", "Tuberculosis-T25", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 25), indParam), "");
		dsd.addColumn("TBA26", "Tuberculosis-T26", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 26), indParam), "");
		dsd.addColumn("TBA27", "Tuberculosis-T27", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 27), indParam), "");
		dsd.addColumn("TBA28", "Tuberculosis-T28", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 28), indParam), "");
		dsd.addColumn("TBA29", "Tuberculosis-T29", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 29), indParam), "");
		dsd.addColumn("TBA30", "Tuberculosis-T30", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 30), indParam), "");
		dsd.addColumn("TBA31", "Tuberculosis-T31", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 31), indParam), "");
		
	}
	
	private void getDiarrhoea(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("DIA1", "Diarrhoea-D1", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 1), indParam), "");
		dsd.addColumn("DIA2", "Diarrhoea-D2", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 2), indParam), "");
		dsd.addColumn("DIA3", "Diarrhoea-D3", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 3), indParam), "");
		dsd.addColumn("DIA4", "Diarrhoea-D4", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 4), indParam), "");
		dsd.addColumn("DIA5", "Diarrhoea-D5", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 5), indParam), "");
		dsd.addColumn("DIA6", "Diarrhoea-D6", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 6), indParam), "");
		dsd.addColumn("DIA7", "Diarrhoea-D7", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 7), indParam), "");
		dsd.addColumn("DIA8", "Diarrhoea-D8", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 8), indParam), "");
		dsd.addColumn("DIA9", "Diarrhoea-D9", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 9), indParam), "");
		dsd.addColumn("DIA10", "Diarrhoea-D10", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 10), indParam), "");
		dsd.addColumn("DIA11", "Diarrhoea-D11", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 11), indParam), "");
		dsd.addColumn("DIA12", "Diarrhoea-D12", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 12), indParam), "");
		dsd.addColumn("DIA13", "Diarrhoea-D13", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 13), indParam), "");
		dsd.addColumn("DIA14", "Diarrhoea-D14", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 14), indParam), "");
		dsd.addColumn("DIA15", "Diarrhoea-D15", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 15), indParam), "");
		dsd.addColumn("DIA16", "Diarrhoea-D16", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 16), indParam), "");
		dsd.addColumn("DIA17", "Diarrhoea-D17", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 17), indParam), "");
		dsd.addColumn("DIA18", "Diarrhoea-D18", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 18), indParam), "");
		dsd.addColumn("DIA19", "Diarrhoea-D19", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 19), indParam), "");
		dsd.addColumn("DIA20", "Diarrhoea-D20", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 20), indParam), "");
		dsd.addColumn("DIA21", "Diarrhoea-D21", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 21), indParam), "");
		dsd.addColumn("DIA22", "Diarrhoea-D22", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 22), indParam), "");
		dsd.addColumn("DIA23", "Diarrhoea-D23", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 23), indParam), "");
		dsd.addColumn("DIA24", "Diarrhoea-D24", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 24), indParam), "");
		dsd.addColumn("DIA25", "Diarrhoea-D25", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 25), indParam), "");
		dsd.addColumn("DIA26", "Diarrhoea-D26", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 26), indParam), "");
		dsd.addColumn("DIA27", "Diarrhoea-D27", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 27), indParam), "");
		dsd.addColumn("DIA28", "Diarrhoea-D28", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 28), indParam), "");
		dsd.addColumn("DIA29", "Diarrhoea-D29", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 29), indParam), "");
		dsd.addColumn("DIA30", "Diarrhoea-D30", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 30), indParam), "");
		dsd.addColumn("DIA31", "Diarrhoea-D31", ReportUtils.map(
		    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 31), indParam), "");
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
		dsd.addParameters(getParameters());
		// populate datasets
		getDiarrhoea(dsd, indParam);
		getTuberculosis(dsd, indParam);
		
		return dsd;
		
	}
	
}
