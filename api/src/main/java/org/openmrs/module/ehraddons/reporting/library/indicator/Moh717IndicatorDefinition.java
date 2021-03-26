package org.openmrs.module.ehraddons.reporting.library.indicator;

import org.openmrs.module.ehraddons.EhrAddonsConstants;
import org.openmrs.module.ehraddons.reporting.library.cohorts.Moh717CohortDefinition;
import org.openmrs.module.kenyacore.report.ReportUtils;
import org.openmrs.module.reporting.indicator.CohortIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.openmrs.module.ehraddons.utils.EhrReportingUtils.cohortIndicator;

@Component
public class Moh717IndicatorDefinition {

	private Moh717CohortDefinition moh717CohortDefinition;

	@Autowired
	public Moh717IndicatorDefinition(Moh717CohortDefinition moh717CohortDefinition) {
		this.moh717CohortDefinition = moh717CohortDefinition;
	}

	public CohortIndicator getAllPatients() {
		return cohortIndicator("All patients for 717 report", ReportUtils.map(moh717CohortDefinition.getAllPatients(), "startDate=${startDate},endDate=${endDate}"));
	}

//use mch_clinic for test
	public CohortIndicator getSpecialClinicPatients(int name) {
		return cohortIndicator("Special clinics report",
				ReportUtils.map(moh717CohortDefinition.getSpecialClinicPatients(name)));
	}


}
