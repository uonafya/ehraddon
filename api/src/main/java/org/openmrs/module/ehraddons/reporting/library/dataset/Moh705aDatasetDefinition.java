package org.openmrs.module.ehraddons.reporting.library.dataset;

import org.openmrs.module.ehraddons.EhrAddonsConstants;
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
public class Moh705aDatasetDefinition {
	
	private Moh705aIndicatorDefinition moh705aIndicator;
	
	private CommonDimensionLibrary commonDimensionLibrary;
	
	private EhrAddonDimesion ehrAddonDimesion;
	
	@Autowired
	public Moh705aDatasetDefinition(Moh705aIndicatorDefinition moh705aIndicator,
	    CommonDimensionLibrary commonDimensionLibrary, EhrAddonDimesion ehrAddonDimesion) {
		this.moh705aIndicator = moh705aIndicator;
		this.commonDimensionLibrary = commonDimensionLibrary;
		this.ehrAddonDimesion = ehrAddonDimesion;
	}
	
	/**
	 * Get moh 705 a dataset
	 * 
	 * @return @{@link org.openmrs.module.reporting.dataset.definition.DataSetDefinition}
	 */
	public DataSetDefinition getMoh705aDataset() {
		CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
		dsd.addDimension("gender", ReportUtils.map(commonDimensionLibrary.gender(), ""));
		dsd.addDimension("days", ReportUtils.map(ehrAddonDimesion.encountersOfMonthPerDay(), ""));
		dsd.setName("MOH705A");
		dsd.setParameters(getParameters());
		
		String indParam = "startDate=${startDate},endDate=${endDate}";
		
		EmrReportingUtils.addRow(dsd, "D", "Diahrrhoa", ReportUtils.map(
		    moh705aIndicator.getAllPatientsWithDiarrhoea(Arrays.asList(
		        getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRONIC_DIARRHOEA).getConceptId(),
		        getConcept(EhrAddonsConstants._EhrAddOnConcepts.Protozoal_Diarrhoea).getConceptId()
		    
		    )), indParam), EhrAddonUtils.getAdultChildrenColumns(), Arrays.asList("01", "02", "03", "04", "05", "06", "07",
		    "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
		    "26", "27", "28", "29", "30", "31"));
		
		return dsd;
		
	}
	
	private List<Parameter> getParameters() {
		return Arrays.asList(new Parameter("startDate", "Start date", Date.class), new Parameter("endDate", "End Date",
		        Date.class));
	}
	
	private List<ColumnParameters> getGenderColumns() {
		ColumnParameters female = new ColumnParameters("female", "Female", "gender=F");
		ColumnParameters male = new ColumnParameters("male", "Male", "gender=M");
		
		return Arrays.asList(female, male);
	}
	
}
