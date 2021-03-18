package org.openmrs.module.ehraddons.reporting.library.dataset;

import org.openmrs.module.ehraddons.EhrAddonsConstants;
import org.openmrs.module.ehraddons.reporting.library.indicator.Moh705aIndicatorDefinition;
import org.openmrs.module.kenyacore.report.ReportUtils;
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
	
	@Autowired
	public Moh705aDatasetDefinition(Moh705aIndicatorDefinition moh705aIndicator) {
		this.moh705aIndicator = moh705aIndicator;
	}
	
	/**
	 * Get moh 705 a dataset
	 * 
	 * @return @{@link org.openmrs.module.reporting.dataset.definition.DataSetDefinition}
	 */
	public DataSetDefinition getMoh705aDataset() {
		CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();
		dsd.setName("MOH705A");
		dsd.setParameters(getParameters());
		
		String indParam = "startDate=${startDate},endDate=${endDate}";
		
		dsd.addColumn(
		    "D1",
		    "Diahhrea",
		    ReportUtils.map(
		        moh705aIndicator.getAllPatientsWithDiarrhoea(Arrays.asList(
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRONIC_DIARRHOEA).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.Protozoal_Diarrhoea).getConceptId()
		        
		        )), indParam), "");
		
		return dsd;
		
	}
	
	private List<Parameter> getParameters() {
		return Arrays.asList(new Parameter("startDate", "Start date", Date.class), new Parameter("endDate", "End Date",
		        Date.class));
	}
	
}
