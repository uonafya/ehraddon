package org.openmrs.module.ehraddons.reporting.library.dimesions;

import org.openmrs.module.ehraddons.reporting.library.common.EhrAddonCommons;
import org.openmrs.module.kenyacore.report.ReportUtils;
import org.openmrs.module.reporting.indicator.dimension.CohortDefinitionDimension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;

import java.util.Date;

@Component
public class EhrAddonDimesion {
	
	@Autowired
	private EhrAddonCommons commonLibrary;
	
	/**
	 * Patients with encounters on a given date
	 * 
	 * @return @{@link org.openmrs.module.reporting.indicator.dimension.CohortDimension}
	 */
	public CohortDefinitionDimension encountersOfMonthPerDay() {
		CohortDefinitionDimension dim = new CohortDefinitionDimension();
		dim.setName("Patient with encounters on date of day");
		dim.addParameter(new Parameter("endDate", "End Date", Date.class));
		dim.addCohortDefinition("1",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(1), "endDate=${endDate}"));
		dim.addCohortDefinition("2",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(2), "endDate=${endDate}"));
		dim.addCohortDefinition("3",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(3), "endDate=${endDate}"));
		dim.addCohortDefinition("4",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(4), "endDate=${endDate}"));
		dim.addCohortDefinition("5",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(5), "endDate=${endDate}"));
		dim.addCohortDefinition("6",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(6), "endDate=${endDate}"));
		dim.addCohortDefinition("7",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(7), "endDate=${endDate}"));
		dim.addCohortDefinition("8",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(8), "endDate=${endDate}"));
		dim.addCohortDefinition("9",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(9), "endDate=${endDate}"));
		dim.addCohortDefinition("10",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(10), "endDate=${endDate}"));
		dim.addCohortDefinition("11",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(11), "endDate=${endDate}"));
		dim.addCohortDefinition("12",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(12), "endDate=${endDate}"));
		dim.addCohortDefinition("13",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(13), "endDate=${endDate}"));
		dim.addCohortDefinition("14",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(14), "endDate=${endDate}"));
		dim.addCohortDefinition("15",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(15), "endDate=${endDate}"));
		dim.addCohortDefinition("16",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(16), "endDate=${endDate}"));
		dim.addCohortDefinition("17",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(17), "endDate=${endDate}"));
		dim.addCohortDefinition("18",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(18), "endDate=${endDate}"));
		dim.addCohortDefinition("19",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(19), "endDate=${endDate}"));
		dim.addCohortDefinition("20",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(20), "endDate=${endDate}"));
		dim.addCohortDefinition("21",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(21), "endDate=${endDate}"));
		dim.addCohortDefinition("22",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(22), "endDate=${endDate}"));
		dim.addCohortDefinition("23",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(23), "endDate=${endDate}"));
		dim.addCohortDefinition("24",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(24), "endDate=${endDate}"));
		dim.addCohortDefinition("25",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(25), "endDate=${endDate}"));
		dim.addCohortDefinition("26",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(26), "endDate=${endDate}"));
		dim.addCohortDefinition("27",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(27), "endDate=${endDate}"));
		dim.addCohortDefinition("28",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(28), "endDate=${endDate}"));
		dim.addCohortDefinition("29",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(29), "endDate=${endDate}"));
		dim.addCohortDefinition("30",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(30), "endDate=${endDate}"));
		dim.addCohortDefinition("31",
		    ReportUtils.map(commonLibrary.getPatientsHavingEncountersOnDate(31), "endDate=${endDate}"));
		
		return dim;
	}
}
