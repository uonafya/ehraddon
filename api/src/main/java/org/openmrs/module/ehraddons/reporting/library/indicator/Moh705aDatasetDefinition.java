package org.openmrs.module.ehraddons.reporting.library.indicator;

import org.openmrs.module.ehraddons.EhrAddonsConstants;
import org.openmrs.module.ehraddons.diagnosis.lists.DiagnosisLists;
import org.openmrs.module.ehraddons.reporting.library.dataset.EhrAddOnBaseDataSet;
import org.openmrs.module.ehraddons.reporting.library.dimesions.EhrAddonDimesion;
import org.openmrs.module.ehraddons.reporting.library.indicator.Moh705aIndicatorDefinition;
import org.openmrs.module.ehraddons.reporting.utils.EhrAddonUtils;
import org.openmrs.module.kenyacore.report.ReportUtils;
import org.openmrs.module.kenyaemr.reporting.ColumnParameters;
import org.openmrs.module.kenyaemr.reporting.EmrReportingUtils;
import org.openmrs.module.kenyaemr.reporting.library.shared.common.CommonDimensionLibrary;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.DataSetDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.openmrs.module.ehraddons.EhrAddonsConstants.getConcept;

@Component
public class Moh705aDatasetDefinition extends EhrAddOnBaseDataSet {
	
	private Moh705aIndicatorDefinition moh705aIndicator;
	
	private EhrAddonDimesion ehrAddonDimesion;
	
	@Autowired
	public Moh705aDatasetDefinition(Moh705aIndicatorDefinition moh705aIndicator, EhrAddonDimesion ehrAddonDimesion) {
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
		dsd.addParameters(getParameters());
		dsd.addColumn("D1", "Diarrhoea-D1", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 1), indParam), "");
		dsd.addColumn("D2", "Diarrhoea-D2", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 2), indParam), "");
		dsd.addColumn("D3", "Diarrhoea-D3", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 3), indParam), "");
		dsd.addColumn("D4", "Diarrhoea-D4", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 4), indParam), "");
		dsd.addColumn("D5", "Diarrhoea-D5", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 5), indParam), "");
		dsd.addColumn("D6", "Diarrhoea-D6", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 6), indParam), "");
		dsd.addColumn("D7", "Diarrhoea-D7", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 7), indParam), "");
		dsd.addColumn("D8", "Diarrhoea-D8", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 8), indParam), "");
		dsd.addColumn("D9", "Diarrhoea-D9", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 9), indParam), "");
		dsd.addColumn("D10", "Diarrhoea-D10", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 10), indParam), "");
		dsd.addColumn("D11", "Diarrhoea-D11", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 11), indParam), "");
		dsd.addColumn("D12", "Diarrhoea-D12", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 12), indParam), "");
		dsd.addColumn("D13", "Diarrhoea-D13", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 13), indParam), "");
		dsd.addColumn("D14", "Diarrhoea-D14", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 14), indParam), "");
		dsd.addColumn("D15", "Diarrhoea-D15", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 15), indParam), "");
		dsd.addColumn("D16", "Diarrhoea-D16", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 16), indParam), "");
		dsd.addColumn("D17", "Diarrhoea-D17", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 17), indParam), "");
		dsd.addColumn("D18", "Diarrhoea-D18", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 18), indParam), "");
		dsd.addColumn("D19", "Diarrhoea-D19", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 19), indParam), "");
		dsd.addColumn("D20", "Diarrhoea-D20", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 20), indParam), "");
		dsd.addColumn("D21", "Diarrhoea-D21", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 21), indParam), "");
		dsd.addColumn("D22", "Diarrhoea-D22", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 22), indParam), "");
		dsd.addColumn("D23", "Diarrhoea-D23", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 23), indParam), "");
		dsd.addColumn("D24", "Diarrhoea-D24", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 24), indParam), "");
		dsd.addColumn("D25", "Diarrhoea-D25", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 25), indParam), "");
		dsd.addColumn("D26", "Diarrhoea-D26", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 26), indParam), "");
		dsd.addColumn("D27", "Diarrhoea-D27", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 27), indParam), "");
		dsd.addColumn("D28", "Diarrhoea-D28", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 28), indParam), "");
		dsd.addColumn("D29", "Diarrhoea-D29", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 29), indParam), "");
		dsd.addColumn("D30", "Diarrhoea-D30", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 30), indParam), "");
		dsd.addColumn("D31", "Diarrhoea-D31", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(DiagnosisLists.getDiarrheaDiagnosisList(), 31), indParam), "");
		return dsd;
		
	}
	
}
