package org.openmrs.module.ehraddons.reporting.library.cohorts;

import org.openmrs.module.ehraddons.reporting.calculation.EncountersBasedOnDaySuppliedCalculation;
import org.openmrs.module.ehraddons.reporting.calculation.NewAndRevisitPatientCalculation;
import org.openmrs.module.kenyacore.report.cohort.definition.CalculationCohortDefinition;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.SqlCohortDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Moh717CohortDefinition {

    public CohortDefinition getAllPatients() {
        SqlCohortDefinition sqlCohortDefinition = new SqlCohortDefinition();
        sqlCohortDefinition.setName("All patients for 717 report");
        sqlCohortDefinition.addParameter(new Parameter("startDate", "Start Date", Date.class));
        sqlCohortDefinition.addParameter(new Parameter("endDate", "End Date", Date.class));
        sqlCohortDefinition.setQuery("SELECT p.patient_id FROM patient p INNER JOIN encounter e ON p.patient_id=e.patient_id WHERE e.encounter_datetime BETWEEN :startDate AND :endDate");
        return sqlCohortDefinition;
    }
}
