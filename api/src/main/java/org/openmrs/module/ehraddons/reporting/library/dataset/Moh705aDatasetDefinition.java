package org.openmrs.module.ehraddons.reporting.library.dataset;

import org.openmrs.module.ehraddons.diagnosis.lists.DiagnosisLists;
import org.openmrs.module.ehraddons.reporting.library.indicator.Moh705aIndicatorDefinition;
import org.openmrs.module.kenyacore.report.ReportUtils;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.DataSetDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Moh705aDatasetDefinition extends EhrAddOnBaseDataSet {
	
	private Moh705aIndicatorDefinition moh705aIndicator;
	
	@Autowired
	public Moh705aDatasetDefinition(Moh705aIndicatorDefinition moh705aIndicator) {
		this.moh705aIndicator = moh705aIndicator;
	}
	
	private void getTuberculosis(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("T1", "Tuberculosis-T1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 1), indParam), "");
		dsd.addColumn("T2", "Tuberculosis-T2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 2), indParam), "");
		dsd.addColumn("T3", "Tuberculosis-T3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 3), indParam), "");
		dsd.addColumn("T4", "Tuberculosis-T4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 4), indParam), "");
		dsd.addColumn("T5", "Tuberculosis-T5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 5), indParam), "");
		dsd.addColumn("T6", "Tuberculosis-T6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 6), indParam), "");
		dsd.addColumn("T7", "Tuberculosis-T7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 7), indParam), "");
		dsd.addColumn("T8", "Tuberculosis-T8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 8), indParam), "");
		dsd.addColumn("T9", "Tuberculosis-T9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 9), indParam), "");
		dsd.addColumn("T10", "Tuberculosis-T10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 10), indParam), "");
		dsd.addColumn("T11", "Tuberculosis-T11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 11), indParam), "");
		dsd.addColumn("T12", "Tuberculosis-T12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 12), indParam), "");
		dsd.addColumn("T13", "Tuberculosis-T13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 13), indParam), "");
		dsd.addColumn("T14", "Tuberculosis-T14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 14), indParam), "");
		dsd.addColumn("T15", "Tuberculosis-T15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 15), indParam), "");
		dsd.addColumn("T16", "Tuberculosis-T16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 16), indParam), "");
		dsd.addColumn("T17", "Tuberculosis-T17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 17), indParam), "");
		dsd.addColumn("T18", "Tuberculosis-T18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 18), indParam), "");
		dsd.addColumn("T19", "Tuberculosis-T19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 19), indParam), "");
		dsd.addColumn("T20", "Tuberculosis-T20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 20), indParam), "");
		dsd.addColumn("T21", "Tuberculosis-T21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 21), indParam), "");
		dsd.addColumn("T22", "Tuberculosis-T22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 22), indParam), "");
		dsd.addColumn("T23", "Tuberculosis-T23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 23), indParam), "");
		dsd.addColumn("T24", "Tuberculosis-T24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 24), indParam), "");
		dsd.addColumn("T25", "Tuberculosis-T25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 25), indParam), "");
		dsd.addColumn("T26", "Tuberculosis-T26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 26), indParam), "");
		dsd.addColumn("T27", "Tuberculosis-T27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 27), indParam), "");
		dsd.addColumn("T28", "Tuberculosis-T28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 28), indParam), "");
		dsd.addColumn("T29", "Tuberculosis-T29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 29), indParam), "");
		dsd.addColumn("T30", "Tuberculosis-T30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 30), indParam), "");
		dsd.addColumn("T31", "Tuberculosis-T31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTuberculosisDiagnosisList(), 31), indParam), "");
		
	}
	
	private void getDiarrhoea(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("D1", "Diarrhoea-D1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 1), indParam), "");
		dsd.addColumn("D2", "Diarrhoea-D2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 2), indParam), "");
		dsd.addColumn("D3", "Diarrhoea-D3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 3), indParam), "");
		dsd.addColumn("D4", "Diarrhoea-D4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 4), indParam), "");
		dsd.addColumn("D5", "Diarrhoea-D5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 5), indParam), "");
		dsd.addColumn("D6", "Diarrhoea-D6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 6), indParam), "");
		dsd.addColumn("D7", "Diarrhoea-D7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 7), indParam), "");
		dsd.addColumn("D8", "Diarrhoea-D8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 8), indParam), "");
		dsd.addColumn("D9", "Diarrhoea-D9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 9), indParam), "");
		dsd.addColumn("D10", "Diarrhoea-D10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 10), indParam), "");
		dsd.addColumn("D11", "Diarrhoea-D11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 11), indParam), "");
		dsd.addColumn("D12", "Diarrhoea-D12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 12), indParam), "");
		dsd.addColumn("D13", "Diarrhoea-D13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 13), indParam), "");
		dsd.addColumn("D14", "Diarrhoea-D14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 14), indParam), "");
		dsd.addColumn("D15", "Diarrhoea-D15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 15), indParam), "");
		dsd.addColumn("D16", "Diarrhoea-D16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 16), indParam), "");
		dsd.addColumn("D17", "Diarrhoea-D17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 17), indParam), "");
		dsd.addColumn("D18", "Diarrhoea-D18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 18), indParam), "");
		dsd.addColumn("D19", "Diarrhoea-D19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 19), indParam), "");
		dsd.addColumn("D20", "Diarrhoea-D20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 20), indParam), "");
		dsd.addColumn("D21", "Diarrhoea-D21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 21), indParam), "");
		dsd.addColumn("D22", "Diarrhoea-D22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 22), indParam), "");
		dsd.addColumn("D23", "Diarrhoea-D23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 23), indParam), "");
		dsd.addColumn("D24", "Diarrhoea-D24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 24), indParam), "");
		dsd.addColumn("D25", "Diarrhoea-D25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 25), indParam), "");
		dsd.addColumn("D26", "Diarrhoea-D26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 26), indParam), "");
		dsd.addColumn("D27", "Diarrhoea-D27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 27), indParam), "");
		dsd.addColumn("D28", "Diarrhoea-D28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 28), indParam), "");
		dsd.addColumn("D29", "Diarrhoea-D29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 29), indParam), "");
		dsd.addColumn("D30", "Diarrhoea-D30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 30), indParam), "");
		dsd.addColumn("D31", "Diarrhoea-D31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), 31), indParam), "");
	}

	private void getDysentery(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("DY1", "Dysentery-Day 1", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 1), indParam), "");
		dsd.addColumn("DY2", "Dysentery-Day 2", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 2), indParam), "");
		dsd.addColumn("DY3", "Dysentery-Day 3", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 3), indParam), "");
		dsd.addColumn("DY4", "Dysentery-Day 4", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 4), indParam), "");
		dsd.addColumn("DY5", "Dysentery-Day 5", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 5), indParam), "");
		dsd.addColumn("DY6", "Dysentery-Day 6", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 6), indParam), "");
		dsd.addColumn("DY7", "Dysentery-Day 7", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 7), indParam), "");
		dsd.addColumn("DY8", "Dysentery-Day 8", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 8), indParam), "");
		dsd.addColumn("DY9", "Dysentery-Day 9", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 9), indParam), "");
		dsd.addColumn("DY10", "Dysentery-Day 10", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 10), indParam), "");
		dsd.addColumn("DY11", "Dysentery-Day 11", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 11), indParam), "");
		dsd.addColumn("DY12", "Dysentery-Day 12", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 12), indParam), "");
		dsd.addColumn("DY13", "Dysentery-Day 13", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 13), indParam), "");
		dsd.addColumn("DY14", "Dysentery-Day 14", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 14), indParam), "");
		dsd.addColumn("DY15", "Dysentery-Day 15", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 15), indParam), "");
		dsd.addColumn("DY16", "Dysentery-Day 16", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 16), indParam), "");
		dsd.addColumn("DY17", "Dysentery-Day 17", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 17), indParam), "");
		dsd.addColumn("DY18", "Dysentery-Day 18", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 18), indParam), "");
		dsd.addColumn("DY19", "Dysentery-Day 19", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 19), indParam), "");
		dsd.addColumn("DY20", "Dysentery-Day 20", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 20), indParam), "");
		dsd.addColumn("DY21", "Dysentery-Day 21", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 21), indParam), "");
		dsd.addColumn("DY22", "Dysentery-Day 22", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 22), indParam), "");
		dsd.addColumn("DY23", "Dysentery-Day 23", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 23), indParam), "");
		dsd.addColumn("DY24", "Dysentery-Day 24", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 24), indParam), "");
		dsd.addColumn("DY25", "Dysentery-Day 25", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 25), indParam), "");
		dsd.addColumn("DY26", "Dysentery-Day 26", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 26), indParam), "");
		dsd.addColumn("DY27", "Dysentery-Day 27", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 27), indParam), "");
		dsd.addColumn("DY28", "Dysentery-Day 28", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 28), indParam), "");
		dsd.addColumn("DY29", "Dysentery-Day 29", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 29), indParam), "");
		dsd.addColumn("DY30", "Dysentery-Day 30", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 30), indParam), "");
		dsd.addColumn("DY31", "Dysentery-Day 31", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), 31), indParam), "");
		
	}

	private void getCholera(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("CH1", "Cholera-Day 1", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 1), indParam), "");
		dsd.addColumn("CH2", "Cholera-Day 2", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 2), indParam), "");
		dsd.addColumn("CH3", "Cholera-Day 3", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 3), indParam), "");
		dsd.addColumn("CH4", "Cholera-Day 4", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 4), indParam), "");
		dsd.addColumn("CH5", "Cholera-Day 5", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 5), indParam), "");
		dsd.addColumn("CH6", "Cholera-Day 6", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 6), indParam), "");
		dsd.addColumn("CH7", "Cholera-Day 7", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 7), indParam), "");
		dsd.addColumn("CH8", "Cholera-Day 8", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 8), indParam), "");
		dsd.addColumn("CH9", "Cholera-Day 9", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 9), indParam), "");
		dsd.addColumn("CH10", "Cholera-Day 10", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 10), indParam), "");
		dsd.addColumn("CH11", "Cholera-Day 11", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 11), indParam), "");
		dsd.addColumn("CH12", "Cholera-Day 12", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 12), indParam), "");
		dsd.addColumn("CH13", "Cholera-Day 13", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 13), indParam), "");
		dsd.addColumn("CH14", "Cholera-Day 14", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 14), indParam), "");
		dsd.addColumn("CH15", "Cholera-Day 15", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 15), indParam), "");
		dsd.addColumn("CH16", "Cholera-Day 16", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 16), indParam), "");
		dsd.addColumn("CH17", "Cholera-Day 17", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 17), indParam), "");
		dsd.addColumn("CH18", "Cholera-Day 18", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 18), indParam), "");
		dsd.addColumn("CH19", "Cholera-Day 19", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 19), indParam), "");
		dsd.addColumn("CH20", "Cholera-Day 20", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 20), indParam), "");
		dsd.addColumn("CH21", "Cholera-Day 21", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 21), indParam), "");
		dsd.addColumn("CH22", "Cholera-Day 22", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 22), indParam), "");
		dsd.addColumn("CH23", "Cholera-Day 23", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 23), indParam), "");
		dsd.addColumn("CH24", "Cholera-Day 24", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 24), indParam), "");
		dsd.addColumn("CH25", "Cholera-Day 25", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 25), indParam), "");
		dsd.addColumn("CH26", "Cholera-Day 26", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 26), indParam), "");
		dsd.addColumn("CH27", "Cholera-Day 27", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 27), indParam), "");
		dsd.addColumn("CH28", "Cholera-Day 28", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 28), indParam), "");
		dsd.addColumn("CH29", "Cholera-Day 29", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 29), indParam), "");
		dsd.addColumn("CH30", "Cholera-Day 30", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 30), indParam), "");
		dsd.addColumn("CH31", "Cholera-Day 31", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), 31), indParam), "");
		
	}

	private void getMeningococcalMeningitis(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("CH1", "MeningococcalMeningitis-Day 1", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 1), indParam), "");
		dsd.addColumn("CH2", "MeningococcalMeningitis-Day 2", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 2), indParam), "");
		dsd.addColumn("CH3", "MeningococcalMeningitis-Day 3", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 3), indParam), "");
		dsd.addColumn("CH4", "MeningococcalMeningitis-Day 4", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 4), indParam), "");
		dsd.addColumn("CH5", "MeningococcalMeningitis-Day 5", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 5), indParam), "");
		dsd.addColumn("CH6", "MeningococcalMeningitis-Day 6", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 6), indParam), "");
		dsd.addColumn("CH7", "MeningococcalMeningitis-Day 7", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 7), indParam), "");
		dsd.addColumn("CH8", "MeningococcalMeningitis-Day 8", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 8), indParam), "");
		dsd.addColumn("CH9", "MeningococcalMeningitis-Day 9", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 9), indParam), "");
		dsd.addColumn("CH10", "MeningococcalMeningitis-Day 10", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 10), indParam), "");
		dsd.addColumn("CH11", "MeningococcalMeningitis-Day 11", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 11), indParam), "");
		dsd.addColumn("CH12", "MeningococcalMeningitis-Day 12", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 12), indParam), "");
		dsd.addColumn("CH13", "MeningococcalMeningitis-Day 13", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 13), indParam), "");
		dsd.addColumn("CH14", "MeningococcalMeningitis-Day 14", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 14), indParam), "");
		dsd.addColumn("CH15", "MeningococcalMeningitis-Day 15", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 15), indParam), "");
		dsd.addColumn("CH16", "MeningococcalMeningitis-Day 16", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 16), indParam), "");
		dsd.addColumn("CH17", "MeningococcalMeningitis-Day 17", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 17), indParam), "");
		dsd.addColumn("CH18", "MeningococcalMeningitis-Day 18", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 18), indParam), "");
		dsd.addColumn("CH19", "MeningococcalMeningitis-Day 19", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 19), indParam), "");
		dsd.addColumn("CH20", "MeningococcalMeningitis-Day 20", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 20), indParam), "");
		dsd.addColumn("CH21", "MeningococcalMeningitis-Day 21", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 21), indParam), "");
		dsd.addColumn("CH22", "MeningococcalMeningitis-Day 22", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 22), indParam), "");
		dsd.addColumn("CH23", "MeningococcalMeningitis-Day 23", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 23), indParam), "");
		dsd.addColumn("CH24", "MeningococcalMeningitis-Day 24", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 24), indParam), "");
		dsd.addColumn("CH25", "MeningococcalMeningitis-Day 25", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 25), indParam), "");
		dsd.addColumn("CH26", "MeningococcalMeningitis-Day 26", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 26), indParam), "");
		dsd.addColumn("CH27", "MeningococcalMeningitis-Day 27", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 27), indParam), "");
		dsd.addColumn("CH28", "MeningococcalMeningitis-Day 28", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 28), indParam), "");
		dsd.addColumn("CH29", "MeningococcalMeningitis-Day 29", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 29), indParam), "");
		dsd.addColumn("CH30", "MeningococcalMeningitis-Day 30", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 30), indParam), "");
		dsd.addColumn("CH31", "MeningococcalMeningitis-Day 31", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), 31), indParam), "");
		
	}

	private void getOtherMenigitis(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("OM1", "OtherMenigitis-Day 1", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 1), indParam), "");
		dsd.addColumn("OM2", "OtherMenigitis-Day 2", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 2), indParam), "");
		dsd.addColumn("OM3", "OtherMenigitis-Day 3", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 3), indParam), "");
		dsd.addColumn("OM4", "OtherMenigitis-Day 4", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 4), indParam), "");
		dsd.addColumn("OM5", "OtherMenigitis-Day 5", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 5), indParam), "");
		dsd.addColumn("OM6", "OtherMenigitis-Day 6", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 6), indParam), "");
		dsd.addColumn("OM7", "OtherMenigitis-Day 7", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 7), indParam), "");
		dsd.addColumn("OM8", "OtherMenigitis-Day 8", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 8), indParam), "");
		dsd.addColumn("OM9", "OtherMenigitis-Day 9", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 9), indParam), "");
		dsd.addColumn("OM10", "OtherMenigitis-Day 10", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 10), indParam), "");
		dsd.addColumn("OM11", "OtherMenigitis-Day 11", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 11), indParam), "");
		dsd.addColumn("OM12", "OtherMenigitis-Day 12", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 12), indParam), "");
		dsd.addColumn("OM13", "OtherMenigitis-Day 13", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 13), indParam), "");
		dsd.addColumn("OM14", "OtherMenigitis-Day 14", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 14), indParam), "");
		dsd.addColumn("OM15", "OtherMenigitis-Day 15", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 15), indParam), "");
		dsd.addColumn("OM16", "OtherMenigitis-Day 16", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 16), indParam), "");
		dsd.addColumn("OM17", "OtherMenigitis-Day 17", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 17), indParam), "");
		dsd.addColumn("OM18", "OtherMenigitis-Day 18", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 18), indParam), "");
		dsd.addColumn("OM19", "OtherMenigitis-Day 19", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 19), indParam), "");
		dsd.addColumn("OM20", "OtherMenigitis-Day 20", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 20), indParam), "");
		dsd.addColumn("OM21", "OtherMenigitis-Day 21", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 21), indParam), "");
		dsd.addColumn("OM22", "OtherMenigitis-Day 22", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 22), indParam), "");
		dsd.addColumn("OM23", "OtherMenigitis-Day 23", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 23), indParam), "");
		dsd.addColumn("OM24", "OtherMenigitis-Day 24", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 24), indParam), "");
		dsd.addColumn("OM25", "OtherMenigitis-Day 25", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 25), indParam), "");
		dsd.addColumn("OM26", "OtherMenigitis-Day 26", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 26), indParam), "");
		dsd.addColumn("OM27", "OtherMenigitis-Day 27", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 27), indParam), "");
		dsd.addColumn("OM28", "OtherMenigitis-Day 28", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 28), indParam), "");
		dsd.addColumn("OM29", "OtherMenigitis-Day 29", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 29), indParam), "");
		dsd.addColumn("OM30", "OtherMenigitis-Day 30", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 30), indParam), "");
		dsd.addColumn("OM31", "OtherMenigitis-Day 31", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), 31), indParam), "");
		
	}

	private void getPoliomyelitis(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("P1", "Poliomyelitis-Day 1", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 1), indParam), "");
		dsd.addColumn("P2", "Poliomyelitis-Day 2", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 2), indParam), "");
		dsd.addColumn("P3", "Poliomyelitis-Day 3", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 3), indParam), "");
		dsd.addColumn("P4", "Poliomyelitis-Day 4", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 4), indParam), "");
		dsd.addColumn("P5", "Poliomyelitis-Day 5", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 5), indParam), "");
		dsd.addColumn("P6", "Poliomyelitis-Day 6", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 6), indParam), "");
		dsd.addColumn("P7", "Poliomyelitis-Day 7", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 7), indParam), "");
		dsd.addColumn("P8", "Poliomyelitis-Day 8", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 8), indParam), "");
		dsd.addColumn("P9", "Poliomyelitis-Day 9", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 9), indParam), "");
		dsd.addColumn("P10", "Poliomyelitis-Day 10", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 10), indParam), "");
		dsd.addColumn("P11", "Poliomyelitis-Day 11", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 11), indParam), "");
		dsd.addColumn("P12", "Poliomyelitis-Day 12", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 12), indParam), "");
		dsd.addColumn("P13", "Poliomyelitis-Day 13", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 13), indParam), "");
		dsd.addColumn("P14", "Poliomyelitis-Day 14", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 14), indParam), "");
		dsd.addColumn("P15", "Poliomyelitis-Day 15", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 15), indParam), "");
		dsd.addColumn("P16", "Poliomyelitis-Day 16", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 16), indParam), "");
		dsd.addColumn("P17", "Poliomyelitis-Day 17", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 17), indParam), "");
		dsd.addColumn("P18", "Poliomyelitis-Day 18", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 18), indParam), "");
		dsd.addColumn("P19", "Poliomyelitis-Day 19", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 19), indParam), "");
		dsd.addColumn("P20", "Poliomyelitis-Day 20", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 20), indParam), "");
		dsd.addColumn("P21", "Poliomyelitis-Day 21", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 21), indParam), "");
		dsd.addColumn("P22", "Poliomyelitis-Day 22", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 22), indParam), "");
		dsd.addColumn("P23", "Poliomyelitis-Day 23", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 23), indParam), "");
		dsd.addColumn("P24", "Poliomyelitis-Day 24", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 24), indParam), "");
		dsd.addColumn("P25", "Poliomyelitis-Day 25", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 25), indParam), "");
		dsd.addColumn("P26", "Poliomyelitis-Day 26", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 26), indParam), "");
		dsd.addColumn("P27", "Poliomyelitis-Day 27", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 27), indParam), "");
		dsd.addColumn("P28", "Poliomyelitis-Day 28", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 28), indParam), "");
		dsd.addColumn("P29", "Poliomyelitis-Day 29", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 29), indParam), "");
		dsd.addColumn("P30", "Poliomyelitis-Day 30", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 30), indParam), "");
		dsd.addColumn("P31", "Poliomyelitis-Day 31", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), 31), indParam), "");
		
	}

	private void getNeonatalTetanus(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("NT1", "NeonatalTetanus-Day 1", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 1), indParam), "");
		dsd.addColumn("NT2", "NeonatalTetanus-Day 2", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 2), indParam), "");
		dsd.addColumn("NT3", "NeonatalTetanus-Day 3", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 3), indParam), "");
		dsd.addColumn("NT4", "NeonatalTetanus-Day 4", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 4), indParam), "");
		dsd.addColumn("NT5", "NeonatalTetanus-Day 5", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 5), indParam), "");
		dsd.addColumn("NT6", "NeonatalTetanus-Day 6", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 6), indParam), "");
		dsd.addColumn("NT7", "NeonatalTetanus-Day 7", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 7), indParam), "");
		dsd.addColumn("NT8", "NeonatalTetanus-Day 8", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 8), indParam), "");
		dsd.addColumn("NT9", "NeonatalTetanus-Day 9", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 9), indParam), "");
		dsd.addColumn("NT10", "NeonatalTetanus-Day 10", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 10), indParam), "");
		dsd.addColumn("NT11", "NeonatalTetanus-Day 11", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 11), indParam), "");
		dsd.addColumn("NT12", "NeonatalTetanus-Day 12", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 12), indParam), "");
		dsd.addColumn("NT13", "NeonatalTetanus-Day 13", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 13), indParam), "");
		dsd.addColumn("NT14", "NeonatalTetanus-Day 14", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 14), indParam), "");
		dsd.addColumn("NT15", "NeonatalTetanus-Day 15", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 15), indParam), "");
		dsd.addColumn("NT16", "NeonatalTetanus-Day 16", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 16), indParam), "");
		dsd.addColumn("NT17", "NeonatalTetanus-Day 17", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 17), indParam), "");
		dsd.addColumn("NT18", "NeonatalTetanus-Day 18", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 18), indParam), "");
		dsd.addColumn("NT19", "NeonatalTetanus-Day 19", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 19), indParam), "");
		dsd.addColumn("NT20", "NeonatalTetanus-Day 20", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 20), indParam), "");
		dsd.addColumn("NT21", "NeonatalTetanus-Day 21", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 21), indParam), "");
		dsd.addColumn("NT22", "NeonatalTetanus-Day 22", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 22), indParam), "");
		dsd.addColumn("NT23", "NeonatalTetanus-Day 23", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 23), indParam), "");
		dsd.addColumn("NT24", "NeonatalTetanus-Day 24", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 24), indParam), "");
		dsd.addColumn("NT25", "NeonatalTetanus-Day 25", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 25), indParam), "");
		dsd.addColumn("NT26", "NeonatalTetanus-Day 26", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 26), indParam), "");
		dsd.addColumn("NT27", "NeonatalTetanus-Day 27", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 27), indParam), "");
		dsd.addColumn("NT28", "NeonatalTetanus-Day 28", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 28), indParam), "");
		dsd.addColumn("NT29", "NeonatalTetanus-Day 29", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 29), indParam), "");
		dsd.addColumn("NT30", "NeonatalTetanus-Day 30", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 30), indParam), "");
		dsd.addColumn("NT31", "NeonatalTetanus-Day 31", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), 31), indParam), "");
		
	}


	private void getChickenPox(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("CP1", "ChickenPox-Day 1", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 1), indParam), "");
		dsd.addColumn("CP2", "ChickenPox-Day 2", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 2), indParam), "");
		dsd.addColumn("CP3", "ChickenPox-Day 3", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 3), indParam), "");
		dsd.addColumn("CP4", "ChickenPox-Day 4", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 4), indParam), "");
		dsd.addColumn("CP5", "ChickenPox-Day 5", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 5), indParam), "");
		dsd.addColumn("CP6", "ChickenPox-Day 6", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 6), indParam), "");
		dsd.addColumn("CP7", "ChickenPox-Day 7", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 7), indParam), "");
		dsd.addColumn("CP8", "ChickenPox-Day 8", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 8), indParam), "");
		dsd.addColumn("CP9", "ChickenPox-Day 9", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 9), indParam), "");
		dsd.addColumn("CP10", "ChickenPox-Day 10", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 10), indParam), "");
		dsd.addColumn("CP11", "ChickenPox-Day 11", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 11), indParam), "");
		dsd.addColumn("CP12", "ChickenPox-Day 12", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 12), indParam), "");
		dsd.addColumn("CP13", "ChickenPox-Day 13", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 13), indParam), "");
		dsd.addColumn("CP14", "ChickenPox-Day 14", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 14), indParam), "");
		dsd.addColumn("CP15", "ChickenPox-Day 15", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 15), indParam), "");
		dsd.addColumn("CP16", "ChickenPox-Day 16", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 16), indParam), "");
		dsd.addColumn("CP17", "ChickenPox-Day 17", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 17), indParam), "");
		dsd.addColumn("CP18", "ChickenPox-Day 18", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 18), indParam), "");
		dsd.addColumn("CP19", "ChickenPox-Day 19", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 19), indParam), "");
		dsd.addColumn("CP20", "ChickenPox-Day 20", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 20), indParam), "");
		dsd.addColumn("CP21", "ChickenPox-Day 21", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 21), indParam), "");
		dsd.addColumn("CP22", "ChickenPox-Day 22", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 22), indParam), "");
		dsd.addColumn("CP23", "ChickenPox-Day 23", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 23), indParam), "");
		dsd.addColumn("CP24", "ChickenPox-Day 24", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 24), indParam), "");
		dsd.addColumn("CP25", "ChickenPox-Day 25", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 25), indParam), "");
		dsd.addColumn("CP26", "ChickenPox-Day 26", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 26), indParam), "");
		dsd.addColumn("CP27", "ChickenPox-Day 27", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 27), indParam), "");
		dsd.addColumn("CP28", "ChickenPox-Day 28", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 28), indParam), "");
		dsd.addColumn("CP29", "ChickenPox-Day 29", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 29), indParam), "");
		dsd.addColumn("CP30", "ChickenPox-Day 30", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 30), indParam), "");
		dsd.addColumn("CP31", "ChickenPox-Day 31", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), 31), indParam), "");
		
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
		dsd.addParameters(getParameters());
		// populate datasets
		getDiarrhoea(dsd, indParam);
		getTuberculosis(dsd, indParam);
		
		return dsd;
		
	}
	
}
