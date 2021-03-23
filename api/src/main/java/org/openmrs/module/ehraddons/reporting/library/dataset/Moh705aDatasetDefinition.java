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

	private void getMeasles(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("MS1", "Measles-Day 1", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 1), indParam), "");
		dsd.addColumn("MS2", "Measles-Day 2", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 2), indParam), "");
		dsd.addColumn("MS3", "Measles-Day 3", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 3), indParam), "");
		dsd.addColumn("MS4", "Measles-Day 4", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 4), indParam), "");
		dsd.addColumn("MS5", "Measles-Day 5", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 5), indParam), "");
		dsd.addColumn("MS6", "Measles-Day 6", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 6), indParam), "");
		dsd.addColumn("MS7", "Measles-Day 7", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 7), indParam), "");
		dsd.addColumn("MS8", "Measles-Day 8", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 8), indParam), "");
		dsd.addColumn("MS9", "Measles-Day 9", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 9), indParam), "");
		dsd.addColumn("MS10", "Measles-Day 10", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 10), indParam), "");
		dsd.addColumn("MS11", "Measles-Day 11", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 11), indParam), "");
		dsd.addColumn("MS12", "Measles-Day 12", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 12), indParam), "");
		dsd.addColumn("MS13", "Measles-Day 13", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 13), indParam), "");
		dsd.addColumn("MS14", "Measles-Day 14", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 14), indParam), "");
		dsd.addColumn("MS15", "Measles-Day 15", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 15), indParam), "");
		dsd.addColumn("MS16", "Measles-Day 16", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 16), indParam), "");
		dsd.addColumn("MS17", "Measles-Day 17", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 17), indParam), "");
		dsd.addColumn("MS18", "Measles-Day 18", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 18), indParam), "");
		dsd.addColumn("MS19", "Measles-Day 19", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 19), indParam), "");
		dsd.addColumn("MS20", "Measles-Day 20", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 20), indParam), "");
		dsd.addColumn("MS21", "Measles-Day 21", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 21), indParam), "");
		dsd.addColumn("MS22", "Measles-Day 22", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 22), indParam), "");
		dsd.addColumn("MS23", "Measles-Day 23", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 23), indParam), "");
		dsd.addColumn("MS24", "Measles-Day 24", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 24), indParam), "");
		dsd.addColumn("MS25", "Measles-Day 25", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 25), indParam), "");
		dsd.addColumn("MS26", "Measles-Day 26", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 26), indParam), "");
		dsd.addColumn("MS27", "Measles-Day 27", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 27), indParam), "");
		dsd.addColumn("MS28", "Measles-Day 28", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 28), indParam), "");
		dsd.addColumn("MS29", "Measles-Day 29", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 29), indParam), "");
		dsd.addColumn("MS30", "Measles-Day 30", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 30), indParam), "");
		dsd.addColumn("MS31", "Measles-Day 31", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), 31), indParam), "");
		
	}

	private void getHepatitis(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("HP1", "Hepatitis-Day 1", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 1), indParam), "");
		dsd.addColumn("HP2", "Hepatitis-Day 2", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 2), indParam), "");
		dsd.addColumn("HP3", "Hepatitis-Day 3", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 3), indParam), "");
		dsd.addColumn("HP4", "Hepatitis-Day 4", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 4), indParam), "");
		dsd.addColumn("HP5", "Hepatitis-Day 5", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 5), indParam), "");
		dsd.addColumn("HP6", "Hepatitis-Day 6", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 6), indParam), "");
		dsd.addColumn("HP7", "Hepatitis-Day 7", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 7), indParam), "");
		dsd.addColumn("HP8", "Hepatitis-Day 8", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 8), indParam), "");
		dsd.addColumn("HP9", "Hepatitis-Day 9", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 9), indParam), "");
		dsd.addColumn("HP10", "Hepatitis-Day 10", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 10), indParam), "");
		dsd.addColumn("HP11", "Hepatitis-Day 11", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 11), indParam), "");
		dsd.addColumn("HP12", "Hepatitis-Day 12", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 12), indParam), "");
		dsd.addColumn("HP13", "Hepatitis-Day 13", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 13), indParam), "");
		dsd.addColumn("HP14", "Hepatitis-Day 14", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 14), indParam), "");
		dsd.addColumn("HP15", "Hepatitis-Day 15", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 15), indParam), "");
		dsd.addColumn("HP16", "Hepatitis-Day 16", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 16), indParam), "");
		dsd.addColumn("HP17", "Hepatitis-Day 17", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 17), indParam), "");
		dsd.addColumn("HP18", "Hepatitis-Day 18", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 18), indParam), "");
		dsd.addColumn("HP19", "Hepatitis-Day 19", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 19), indParam), "");
		dsd.addColumn("HP20", "Hepatitis-Day 20", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 20), indParam), "");
		dsd.addColumn("HP21", "Hepatitis-Day 21", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 21), indParam), "");
		dsd.addColumn("HP22", "Hepatitis-Day 22", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 22), indParam), "");
		dsd.addColumn("HP23", "Hepatitis-Day 23", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 23), indParam), "");
		dsd.addColumn("HP24", "Hepatitis-Day 24", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 24), indParam), "");
		dsd.addColumn("HP25", "Hepatitis-Day 25", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 25), indParam), "");
		dsd.addColumn("HP26", "Hepatitis-Day 26", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 26), indParam), "");
		dsd.addColumn("HP27", "Hepatitis-Day 27", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 27), indParam), "");
		dsd.addColumn("HP28", "Hepatitis-Day 28", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 28), indParam), "");
		dsd.addColumn("HP29", "Hepatitis-Day 29", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 29), indParam), "");
		dsd.addColumn("HP30", "Hepatitis-Day 30", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 30), indParam), "");
		dsd.addColumn("HP31", "Hepatitis-Day 31", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), 31), indParam), "");
		
	}

	private void getMumps(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("MP1", "Mumps-Day 1", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 1), indParam), "");
		dsd.addColumn("MP2", "Mumps-Day 2", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 2), indParam), "");
		dsd.addColumn("MP3", "Mumps-Day 3", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 3), indParam), "");
		dsd.addColumn("MP4", "Mumps-Day 4", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 4), indParam), "");
		dsd.addColumn("MP5", "Mumps-Day 5", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 5), indParam), "");
		dsd.addColumn("MP6", "Mumps-Day 6", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 6), indParam), "");
		dsd.addColumn("MP7", "Mumps-Day 7", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 7), indParam), "");
		dsd.addColumn("MP8", "Mumps-Day 8", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 8), indParam), "");
		dsd.addColumn("MP9", "Mumps-Day 9", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 9), indParam), "");
		dsd.addColumn("MP10", "Mumps-Day 10", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 10), indParam), "");
		dsd.addColumn("MP11", "Mumps-Day 11", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 11), indParam), "");
		dsd.addColumn("MP12", "Mumps-Day 12", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 12), indParam), "");
		dsd.addColumn("MP13", "Mumps-Day 13", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 13), indParam), "");
		dsd.addColumn("MP14", "Mumps-Day 14", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 14), indParam), "");
		dsd.addColumn("MP15", "Mumps-Day 15", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 15), indParam), "");
		dsd.addColumn("MP16", "Mumps-Day 16", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 16), indParam), "");
		dsd.addColumn("MP17", "Mumps-Day 17", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 17), indParam), "");
		dsd.addColumn("MP18", "Mumps-Day 18", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 18), indParam), "");
		dsd.addColumn("MP19", "Mumps-Day 19", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 19), indParam), "");
		dsd.addColumn("MP20", "Mumps-Day 20", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 20), indParam), "");
		dsd.addColumn("MP21", "Mumps-Day 21", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 21), indParam), "");
		dsd.addColumn("MP22", "Mumps-Day 22", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 22), indParam), "");
		dsd.addColumn("MP23", "Mumps-Day 23", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 23), indParam), "");
		dsd.addColumn("MP24", "Mumps-Day 24", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 24), indParam), "");
		dsd.addColumn("MP25", "Mumps-Day 25", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 25), indParam), "");
		dsd.addColumn("MP26", "Mumps-Day 26", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 26), indParam), "");
		dsd.addColumn("MP27", "Mumps-Day 27", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 27), indParam), "");
		dsd.addColumn("MP28", "Mumps-Day 28", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 28), indParam), "");
		dsd.addColumn("MP29", "Mumps-Day 29", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 29), indParam), "");
		dsd.addColumn("MP30", "Mumps-Day 30", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 30), indParam), "");
		dsd.addColumn("MP31", "Mumps-Day 31", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), 31), indParam), "");
		
	}

	private void getFevers(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("F1", "Fevers-Day 1", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 1), indParam), "");
		dsd.addColumn("F2", "Fevers-Day 2", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 2), indParam), "");
		dsd.addColumn("F3", "Fevers-Day 3", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 3), indParam), "");
		dsd.addColumn("F4", "Fevers-Day 4", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 4), indParam), "");
		dsd.addColumn("F5", "Fevers-Day 5", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 5), indParam), "");
		dsd.addColumn("F6", "Fevers-Day 6", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 6), indParam), "");
		dsd.addColumn("F7", "Fevers-Day 7", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 7), indParam), "");
		dsd.addColumn("F8", "Fevers-Day 8", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 8), indParam), "");
		dsd.addColumn("F9", "Fevers-Day 9", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 9), indParam), "");
		dsd.addColumn("F10", "Fevers-Day 10", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 10), indParam), "");
		dsd.addColumn("F11", "Fevers-Day 11", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 11), indParam), "");
		dsd.addColumn("F12", "Fevers-Day 12", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 12), indParam), "");
		dsd.addColumn("F13", "Fevers-Day 13", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 13), indParam), "");
		dsd.addColumn("F14", "Fevers-Day 14", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 14), indParam), "");
		dsd.addColumn("F15", "Fevers-Day 15", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 15), indParam), "");
		dsd.addColumn("F16", "Fevers-Day 16", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 16), indParam), "");
		dsd.addColumn("F17", "Fevers-Day 17", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 17), indParam), "");
		dsd.addColumn("F18", "Fevers-Day 18", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 18), indParam), "");
		dsd.addColumn("F19", "Fevers-Day 19", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 19), indParam), "");
		dsd.addColumn("F20", "Fevers-Day 20", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 20), indParam), "");
		dsd.addColumn("F21", "Fevers-Day 21", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 21), indParam), "");
		dsd.addColumn("F22", "Fevers-Day 22", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 22), indParam), "");
		dsd.addColumn("F23", "Fevers-Day 23", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 23), indParam), "");
		dsd.addColumn("F24", "Fevers-Day 24", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 24), indParam), "");
		dsd.addColumn("F25", "Fevers-Day 25", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 25), indParam), "");
		dsd.addColumn("F26", "Fevers-Day 26", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 26), indParam), "");
		dsd.addColumn("F27", "Fevers-Day 27", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 27), indParam), "");
		dsd.addColumn("F28", "Fevers-Day 28", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 28), indParam), "");
		dsd.addColumn("F29", "Fevers-Day 29", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 29), indParam), "");
		dsd.addColumn("F30", "Fevers-Day 30", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 30), indParam), "");
		dsd.addColumn("F31", "Fevers-Day 31", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), 31), indParam), "");
		
	}

	private void getSuspectedMalaria(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("SM1", "SuspectedMalaria-Day 1", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 1), indParam), "");
		dsd.addColumn("SM2", "SuspectedMalaria-Day 2", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 2), indParam), "");
		dsd.addColumn("SM3", "SuspectedMalaria-Day 3", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 3), indParam), "");
		dsd.addColumn("SM4", "SuspectedMalaria-Day 4", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 4), indParam), "");
		dsd.addColumn("SM5", "SuspectedMalaria-Day 5", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 5), indParam), "");
		dsd.addColumn("SM6", "SuspectedMalaria-Day 6", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 6), indParam), "");
		dsd.addColumn("SM7", "SuspectedMalaria-Day 7", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 7), indParam), "");
		dsd.addColumn("SM8", "SuspectedMalaria-Day 8", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 8), indParam), "");
		dsd.addColumn("SM9", "SuspectedMalaria-Day 9", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 9), indParam), "");
		dsd.addColumn("SM10", "SuspectedMalaria-Day 10", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 10), indParam), "");
		dsd.addColumn("SM11", "SuspectedMalaria-Day 11", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 11), indParam), "");
		dsd.addColumn("SM12", "SuspectedMalaria-Day 12", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 12), indParam), "");
		dsd.addColumn("SM13", "SuspectedMalaria-Day 13", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 13), indParam), "");
		dsd.addColumn("SM14", "SuspectedMalaria-Day 14", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 14), indParam), "");
		dsd.addColumn("SM15", "SuspectedMalaria-Day 15", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 15), indParam), "");
		dsd.addColumn("SM16", "SuspectedMalaria-Day 16", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 16), indParam), "");
		dsd.addColumn("SM17", "SuspectedMalaria-Day 17", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 17), indParam), "");
		dsd.addColumn("SM18", "SuspectedMalaria-Day 18", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 18), indParam), "");
		dsd.addColumn("SM19", "SuspectedMalaria-Day 19", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 19), indParam), "");
		dsd.addColumn("SM20", "SuspectedMalaria-Day 20", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 20), indParam), "");
		dsd.addColumn("SM21", "SuspectedMalaria-Day 21", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 21), indParam), "");
		dsd.addColumn("SM22", "SuspectedMalaria-Day 22", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 22), indParam), "");
		dsd.addColumn("SM23", "SuspectedMalaria-Day 23", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 23), indParam), "");
		dsd.addColumn("SM24", "SuspectedMalaria-Day 24", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 24), indParam), "");
		dsd.addColumn("SM25", "SuspectedMalaria-Day 25", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 25), indParam), "");
		dsd.addColumn("SM26", "SuspectedMalaria-Day 26", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 26), indParam), "");
		dsd.addColumn("SM27", "SuspectedMalaria-Day 27", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 27), indParam), "");
		dsd.addColumn("SM28", "SuspectedMalaria-Day 28", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 28), indParam), "");
		dsd.addColumn("SM29", "SuspectedMalaria-Day 29", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 29), indParam), "");
		dsd.addColumn("SM30", "SuspectedMalaria-Day 30", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 30), indParam), "");
		dsd.addColumn("SM31", "SuspectedMalaria-Day 31", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), 31), indParam), "");
		
	}

	private void getConfirmedMalaria(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("CM1", "ConfirmedMalaria-Day 1", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 1), indParam), "");
		dsd.addColumn("CM2", "ConfirmedMalaria-Day 2", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 2), indParam), "");
		dsd.addColumn("CM3", "ConfirmedMalaria-Day 3", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 3), indParam), "");
		dsd.addColumn("CM4", "ConfirmedMalaria-Day 4", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 4), indParam), "");
		dsd.addColumn("CM5", "ConfirmedMalaria-Day 5", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 5), indParam), "");
		dsd.addColumn("CM6", "ConfirmedMalaria-Day 6", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 6), indParam), "");
		dsd.addColumn("CM7", "ConfirmedMalaria-Day 7", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 7), indParam), "");
		dsd.addColumn("CM8", "ConfirmedMalaria-Day 8", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 8), indParam), "");
		dsd.addColumn("CM9", "ConfirmedMalaria-Day 9", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 9), indParam), "");
		dsd.addColumn("CM10", "ConfirmedMalaria-Day 10", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 10), indParam), "");
		dsd.addColumn("CM11", "ConfirmedMalaria-Day 11", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 11), indParam), "");
		dsd.addColumn("CM12", "ConfirmedMalaria-Day 12", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 12), indParam), "");
		dsd.addColumn("CM13", "ConfirmedMalaria-Day 13", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 13), indParam), "");
		dsd.addColumn("CM14", "ConfirmedMalaria-Day 14", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 14), indParam), "");
		dsd.addColumn("CM15", "ConfirmedMalaria-Day 15", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 15), indParam), "");
		dsd.addColumn("CM16", "ConfirmedMalaria-Day 16", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 16), indParam), "");
		dsd.addColumn("CM17", "ConfirmedMalaria-Day 17", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 17), indParam), "");
		dsd.addColumn("CM18", "ConfirmedMalaria-Day 18", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 18), indParam), "");
		dsd.addColumn("CM19", "ConfirmedMalaria-Day 19", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 19), indParam), "");
		dsd.addColumn("CM20", "ConfirmedMalaria-Day 20", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 20), indParam), "");
		dsd.addColumn("CM21", "ConfirmedMalaria-Day 21", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 21), indParam), "");
		dsd.addColumn("CM22", "ConfirmedMalaria-Day 22", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 22), indParam), "");
		dsd.addColumn("CM23", "ConfirmedMalaria-Day 23", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 23), indParam), "");
		dsd.addColumn("CM24", "ConfirmedMalaria-Day 24", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 24), indParam), "");
		dsd.addColumn("CM25", "ConfirmedMalaria-Day 25", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 25), indParam), "");
		dsd.addColumn("CM26", "ConfirmedMalaria-Day 26", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 26), indParam), "");
		dsd.addColumn("CM27", "ConfirmedMalaria-Day 27", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 27), indParam), "");
		dsd.addColumn("CM28", "ConfirmedMalaria-Day 28", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 28), indParam), "");
		dsd.addColumn("CM29", "ConfirmedMalaria-Day 29", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 29), indParam), "");
		dsd.addColumn("CM30", "ConfirmedMalaria-Day 30", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 30), indParam), "");
		dsd.addColumn("CM31", "ConfirmedMalaria-Day 31", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), 31), indParam), "");
		
	}

	private void getUrinaryTractInfection(CohortIndicatorDataSetDefinition dsd, String indParam) {
		//String indParam = "startDate=${startDate},endDate=${endDate}";
		dsd.addColumn("UTI1", "UrinaryTractInfection-Day 1", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 1), indParam), "");
		dsd.addColumn("UTI2", "UrinaryTractInfection-Day 2", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 2), indParam), "");
		dsd.addColumn("UTI3", "UrinaryTractInfection-Day 3", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 3), indParam), "");
		dsd.addColumn("UTI4", "UrinaryTractInfection-Day 4", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 4), indParam), "");
		dsd.addColumn("UTI5", "UrinaryTractInfection-Day 5", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 5), indParam), "");
		dsd.addColumn("UTI6", "UrinaryTractInfection-Day 6", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 6), indParam), "");
		dsd.addColumn("UTI7", "UrinaryTractInfection-Day 7", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 7), indParam), "");
		dsd.addColumn("UTI8", "UrinaryTractInfection-Day 8", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 8), indParam), "");
		dsd.addColumn("UTI9", "UrinaryTractInfection-Day 9", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 9), indParam), "");
		dsd.addColumn("UTI10", "UrinaryTractInfection-Day 10", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 10), indParam), "");
		dsd.addColumn("UTI11", "UrinaryTractInfection-Day 11", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 11), indParam), "");
		dsd.addColumn("UTI12", "UrinaryTractInfection-Day 12", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 12), indParam), "");
		dsd.addColumn("UTI13", "UrinaryTractInfection-Day 13", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 13), indParam), "");
		dsd.addColumn("UTI14", "UrinaryTractInfection-Day 14", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 14), indParam), "");
		dsd.addColumn("UTI15", "UrinaryTractInfection-Day 15", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 15), indParam), "");
		dsd.addColumn("UTI16", "UrinaryTractInfection-Day 16", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 16), indParam), "");
		dsd.addColumn("UTI17", "UrinaryTractInfection-Day 17", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 17), indParam), "");
		dsd.addColumn("UTI18", "UrinaryTractInfection-Day 18", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 18), indParam), "");
		dsd.addColumn("UTI19", "UrinaryTractInfection-Day 19", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 19), indParam), "");
		dsd.addColumn("UTI20", "UrinaryTractInfection-Day 20", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 20), indParam), "");
		dsd.addColumn("UTI21", "UrinaryTractInfection-Day 21", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 21), indParam), "");
		dsd.addColumn("UTI22", "UrinaryTractInfection-Day 22", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 22), indParam), "");
		dsd.addColumn("UTI23", "UrinaryTractInfection-Day 23", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 23), indParam), "");
		dsd.addColumn("UTI24", "UrinaryTractInfection-Day 24", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 24), indParam), "");
		dsd.addColumn("UTI25", "UrinaryTractInfection-Day 25", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 25), indParam), "");
		dsd.addColumn("UTI26", "UrinaryTractInfection-Day 26", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 26), indParam), "");
		dsd.addColumn("UTI27", "UrinaryTractInfection-Day 27", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 27), indParam), "");
		dsd.addColumn("UTI28", "UrinaryTractInfection-Day 28", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 28), indParam), "");
		dsd.addColumn("UTI29", "UrinaryTractInfection-Day 29", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 29), indParam), "");
		dsd.addColumn("UTI30", "UrinaryTractInfection-Day 30", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 30), indParam), "");
		dsd.addColumn("UTI31", "UrinaryTractInfection-Day 31", ReportUtils.map(
			moh705aIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), 31), indParam), "");
		
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
