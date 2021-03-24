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
	
	private void getDysentery(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDysenteryList(), i), indParam), "");
			
		}
		
	}
	
	private void getCholera(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i,
			    ReportUtils.map(moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCholeraList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getMeningococcalMeningitis(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeningococcalMeningitisList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getOtherMeningitis(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherMenigitisList(), i), indParam), "");
			
		}
		
	}
	
	private void getNeonatalTetanus(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeonatalTetanusList(), i), indParam), "");
			
		}
		
	}
	
	private void getPoliomyelitis(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoliomyelitisList(), i), indParam), "");
			
		}
		
	}
	
	private void getChickenPox(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getChickenPoxList(), i), indParam), "");
			
		}
		
	}
	
	private void getMeasles(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i,
			    ReportUtils.map(moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMeaslesList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getHepatitis(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHepatitisList(), i), indParam), "");
			
		}
		
	}
	
	private void getMumps(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i,
			    ReportUtils.map(moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMumpsList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getFevers(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i,
			    ReportUtils.map(moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFeversList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getSuspectedMalaria(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSuspectedMalariaList(), i), indParam), "");
			
		}
		
	}
	
	private void getConfirmedMalaria(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getConfirmedMalariaList(), i), indParam), "");
			
		}
		
	}
	
	private void getMalariaInPregnancy(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), i), indParam), "");
			
		}
		
	}
	
	private void getTyphoidFever(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i,
			    ReportUtils.map(moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTyphoidList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getSexuallyTransmittedInfections(CohortIndicatorDataSetDefinition dsd, String columnData,
	        String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), i), indParam), "");
			
		}
		
	}
	
	private void getUrinaryTractInfection(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUrinaryTractInfectionList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getBilharzia(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBilharziaList(), i), indParam), "");
			
		}
		
	}
	
	private void getIntestinalWorms(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getInterstinalwormsList(), i), indParam), "");
			
		}
		
	}
	
	private void getMalnutrition(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMalnutritionList(), i), indParam), "");
			
		}
		
	}
	
	private void getAneamia(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i,
			    ReportUtils.map(moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnaemiaList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getEyeInfections(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEyeInfectionsList(), i), indParam), "");
			
		}
		
	}
	
	private void getOtherEyeConditions(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherEyeConditionsList(), i), indParam), "");
			
		}
		
	}
	
	private void getEarInfectionConditions(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEarInfectionsConditionsList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getUpperRespiratoryTractInfections(CohortIndicatorDataSetDefinition dsd, String columnData,
	        String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getUpperRespiratoryTractInfectionsList(), i),
			    indParam), "");
			
		}
		
	}
	
	private void getAsthma(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i,
			    ReportUtils.map(moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAsthmaList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getPneumonia(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPneumoniaList(), i), indParam), "");
			
		}
		
	}
	
	private void getOtherDisOfRespiratorySystem(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherDisOfRespiratorySystemList(), i),
			    indParam), "");
			
		}
		
	}
	
	private void getAbortion(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(
			    columnData + i,
			    columnLabel + '-' + i,
			    ReportUtils.map(moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAbortionList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getDisOfPuerperiumChildbath(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i,
			    ReportUtils.map(
			        moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDisOfPuerperiumChildbathList(), i),
			        indParam), "");
			
		}
		
	}
	
	private void getHypertension(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getHypertensionList(), i), indParam), "");
			
		}
		
	}
	
	private void getMentalDisorders(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMentalDisordersList(), i), indParam), "");
			
		}
		
	}
	
	private void getDentalDisorders(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDentalDisordersList(), i), indParam), "");
			
		}
		
	}
	
	private void getJiggersInfestation(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getJiggersInfestationList(), i), indParam), "");
			
		}
		
	}
	
	private void getDiseaseOfTheSkin(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiseaseOfTheSkinList(), i), indParam), "");
			
		}
		
	}
	
	private void getAnthritisJointPains(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getAnthritisJointPainsList(), i), indParam), "");
			
		}
		
	}
	
	private void getPoisoning(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPoisoningList(), i), indParam), "");
			
		}
		
	}
	
	private void getRoadTrafficInjuries(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getRoadTrafficInjuriesList(), i), indParam), "");
			
		}
		
	}
	
	private void getOtherInjuries(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherInjuriesList(), i), indParam), "");
			
		}
		
	}
	
	private void getSexualAssault(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSexualAssaultList(), i), indParam), "");
			
		}
		
	}
	
	private void getViolenceRelatedInjuries(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getViolenceRelatedInjuriesList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getBurns(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i,
			    ReportUtils.map(moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBurnsList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getSnakeBites(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getSnakeBitesList(), i), indParam), "");
			
		}
		
	}
	
	private void getDogBites(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(
			    columnData + i,
			    columnLabel + '-' + i,
			    ReportUtils.map(moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDogBitesList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getOtherBites(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOtherBitesList(), i), indParam), "");
			
		}
		
	}
	
	private void getEpilepsy(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(
			    columnData + i,
			    columnLabel + '-' + i,
			    ReportUtils.map(moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getEpilepsyList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getNewlyDiagnosedHiv(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNewlyDiagnosedHivList(), i), indParam), "");
			
		}
		
	}
	
	private void getDiabetes(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(
			    columnData + i,
			    columnLabel + '-' + i,
			    ReportUtils.map(moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiabetesList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getBrucellosis(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getBrucellosisList(), i), indParam), "");
			
		}
		
	}
	
	private void getCardiovascularConditions(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i,
			    ReportUtils.map(
			        moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCardiovascularConditionsList(), i),
			        indParam), "");
			
		}
		
	}
	
	private void getCentralNervousSystemConditions(CohortIndicatorDataSetDefinition dsd, String columnData,
	        String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getCentralNervousSystemConditionsList(), i),
			    indParam), "");
			
		}
		
	}
	
	private void getOvrerweight(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getOvrerweightList(), i), indParam), "");
			
		}
		
	}
	
	private void getMuscularSkeletalConditions(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getMuscularSkeletalConditionsList(), i),
			    indParam), "");
			
		}
		
	}
	
	private void getFistulaBirthRelated(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getFistulaBirthRelatedList(), i), indParam), "");
			
		}
		
	}
	
	private void getNeoplams(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(
			    columnData + i,
			    columnLabel + '-' + i,
			    ReportUtils.map(moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNeoplamsList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getPhysicalDisability(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPhysicalDisabilityList(), i), indParam), "");
			
		}
		
	}
	
	private void getTryponomiasis(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getTryponomiasisList(), i), indParam), "");
			
		}
		
	}
	
	private void getKalazarLeishmaniasis(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(
			    columnData + i,
			    columnLabel + '-' + i,
			    ReportUtils.map(
			        moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getKalazarLeishmaniasisList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getDaracuncolosisGuineaWorm(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i,
			    ReportUtils.map(
			        moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDaracuncolosisGuineaWormList(), i),
			        indParam), "");
			
		}
		
	}
	
	private void getYellowFever(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getYellowFeverList(), i), indParam), "");
			
		}
		
	}
	
	private void getViralHaemorrhagicFever(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getViralHaemorrhagicFeverList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getPlague(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i,
			    ReportUtils.map(moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getPlagueList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getDeathDueToRoadTrafficInjuries(CohortIndicatorDataSetDefinition dsd, String columnData,
	        String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDeathDueToRoadTrafficInjuriesList(), i),
			    indParam), "");
			
		}
		
	}
	
	private void getAllOtherDiseases(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(
			    columnData + i,
			    columnLabel + '-' + i,
			    ReportUtils.map(
			        moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getNoOfFirstAttendancesList(), i), indParam),
			    "");
			
		}
		
	}
	
	private void getNoOfFirstAttendances(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), i), indParam), "");
			
		}
		
	}
	
	private void getReAttendances(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), i), indParam), "");
			
		}
		
	}
	
	private void getReferralsFromOtherHealthFacility(CohortIndicatorDataSetDefinition dsd, String columnData,
	        String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), i), indParam), "");
			
		}
		
	}
	
	private void getReferralsFromOtherCommunityUnit(CohortIndicatorDataSetDefinition dsd, String columnData,
	        String columnLabel, String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), i), indParam), "");
			
		}
		
	}
	
	private void getReferralsToCommunityUnit(CohortIndicatorDataSetDefinition dsd, String columnData, String columnLabel,
	        String indParam) {
		
		for (int i = 1; i <= 31; i++) {
			dsd.addColumn(columnData + i, columnLabel + '-' + i, ReportUtils.map(
			    moh705bIndicator.getAllPatientsWithDiagnosis(DiagnosisLists.getDiarrheaDiagnosisList(), i), indParam), "");
			
		}
		
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
		getDysentery(dsd, "DYA", "Dysentery", indParam);
		getCholera(dsd, "CHA", "Cholera", indParam);
		getMeningococcalMeningitis(dsd, "MMA", "Meningitis", indParam);
		getOtherMeningitis(dsd, "MOA", "OtherMeningitis", indParam);
		getNeonatalTetanus(dsd, "NTA", "NeonatalTetanus", indParam);
		getPoliomyelitis(dsd, "PMA", "Poliomyelitis", indParam);
		getChickenPox(dsd, "CPA", "Chickenpox", indParam);
		getMeasles(dsd, "MEA", "Measles", indParam);
		getHepatitis(dsd, "HEA", "Hepatitis", indParam);
		getMumps(dsd, "MUA", "Mumps", indParam);
		getFevers(dsd, "FEA", "Fevers", indParam);
		getSuspectedMalaria(dsd, "SUA", "SuspectedMalaria", indParam);
		getConfirmedMalaria(dsd, "COA", "MalariaPositive", indParam);
		getMalariaInPregnancy(dsd, "MPA", "MalariaInPregnancy", indParam);//
		getTyphoidFever(dsd, "TYA", "TyphoidFever", indParam);
		getSexuallyTransmittedInfections(dsd, "STIA", "STI", indParam);
		getUrinaryTractInfection(dsd, "URA", "UTI", indParam);
		getBilharzia(dsd, "BIA", "Bilharzia", indParam);
		getIntestinalWorms(dsd, "INA", "IntestinalWorms", indParam);
		getMalnutrition(dsd, "MLA", "Malnutrition", indParam);//
		getAneamia(dsd, "ANA", "Aneamia", indParam);
		getEyeInfections(dsd, "EYA", "EyeInfections", indParam);
		getOtherEyeConditions(dsd, "OTA", "OtherEyeConditions", indParam);
		getEarInfectionConditions(dsd, "EAA", "EarInfectionConditions", indParam);
		getUpperRespiratoryTractInfections(dsd, "UPA", "URTI", indParam);
		getAsthma(dsd, "ASA", "Asthma", indParam);
		getPneumonia(dsd, "PNA", "Pneumonia", indParam);
		getOtherDisOfRespiratorySystem(dsd, "ORA", "OtherDisOfRespSystem", indParam);//
		getAbortion(dsd, "ABA", "Abortion", indParam);//
		getDisOfPuerperiumChildbath(dsd, "DPC", "PuerperiumChildbath", indParam);//
		getHypertension(dsd, "HYA", "Hypertension", indParam);
		getDentalDisorders(dsd, "DEA", "DentalDisorders", indParam);
		getJiggersInfestation(dsd, "JIA", "JiggersInfestation", indParam);
		getDiseaseOfTheSkin(dsd, "DSA", "DiseaseOfTheSkin", indParam);//
		getAnthritisJointPains(dsd, "AJA", "Anthritisjointpains", indParam);//
		getPoisoning(dsd, "POA", "Poisoning", indParam);//
		getRoadTrafficInjuries(dsd, "ROA", "RoadTrafficInjuries", indParam);
		getOtherInjuries(dsd, "OIA", "OtherInjuries", indParam);//
		getSexualAssault(dsd, "SEA", "SexualAssault", indParam);
		getViolenceRelatedInjuries(dsd, "VIA", "ViolenceRelatedInjuries", indParam);
		getBurns(dsd, "BUA", "Burns", indParam);
		getSnakeBites(dsd, "SNA", "Snakebites", indParam);
		getDogBites(dsd, "DOA", "DogBites", indParam);
		getOtherBites(dsd, "OBA", "OtherBites", indParam);//
		getDiabetes(dsd, "DTA", "Diabetes", indParam);//
		getEpilepsy(dsd, "EPA", "Epilepsy", indParam);
		getNewlyDiagnosedHiv(dsd, "NHA", "NewlyDiagnosedHiv", indParam);//
		getBrucellosis(dsd, "BRA", "Brucellosis", indParam);//
		getCardiovascularConditions(dsd, "CAA", "CardiovascularConditions", indParam);
		getOvrerweight(dsd, "OVA", "Ovrerweight", indParam);
		getMuscularSkeletalConditions(dsd, "MSA", "SkeletalConditions", indParam);
		getFistulaBirthRelated(dsd, "FIA", "FistulaBirthRelated", indParam);
		getNeoplams(dsd, "NSA", "Neoplams)", indParam);
		getPhysicalDisability(dsd, "PHA", "PhysicalDisability", indParam);//
		getTryponomiasis(dsd, "TRA", "Tryponomiasis", indParam);
		getKalazarLeishmaniasis(dsd, "KAA", "KalazarLeishmaniasis", indParam);
		getDaracuncolosisGuineaWorm(dsd, "SAA", "Daracuncolosis", indParam);
		getYellowFever(dsd, "YEA", "YellowFever", indParam);
		getViralHaemorrhagicFever(dsd, "VHA", "ViralHaemorrhagicFever", indParam);//
		getPlague(dsd, "PLA", "Plague", indParam);//
		getDeathDueToRoadTrafficInjuries(dsd, "DRA", "DeathDuetrafficinjuries", indParam);//
		getAllOtherDiseases(dsd, "ALA", "otherdiseases", indParam);//
		getNoOfFirstAttendances(dsd, "NOA", "FirstAttendances", indParam);//
		getReAttendances(dsd, "RAA", "REAttendances", indParam);//
		getReferralsFromOtherHealthFacility(dsd, "RHA", "HfacilityReferrals", indParam);
		getReferralsFromOtherCommunityUnit(dsd, "RCA", "CommunityunitReferrrals", indParam);
		getReferralsToCommunityUnit(dsd, "RCTA", "ReferralsTocommunity", indParam);
		
		return dsd;
		
	}
}
