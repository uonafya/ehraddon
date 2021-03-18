package org.openmrs.module.ehraddons.reports;

import org.openmrs.module.kenyacore.report.HybridReportDescriptor;
import org.openmrs.module.kenyacore.report.ReportDescriptor;
import org.openmrs.module.kenyacore.report.ReportUtils;
import org.openmrs.module.kenyacore.report.builder.AbstractHybridReportBuilder;
import org.openmrs.module.kenyacore.report.builder.Builds;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.dataset.definition.DataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.PatientDataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.SqlDataSetDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Mapped;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.openmrs.module.reporting.report.definition.ReportDefinition;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
@Builds({ "ehraddons.common.report.labchildren" })
public class SetupChildrenLabResultsReport extends AbstractHybridReportBuilder {
	
	@Override
	protected Mapped<CohortDefinition> buildCohort(HybridReportDescriptor hybridReportDescriptor,
	        PatientDataSetDefinition patientDataSetDefinition) {
		return null;
	}
	
	@Override
	protected List<Mapped<DataSetDefinition>> buildDataSets(ReportDescriptor descriptor, ReportDefinition report) {
		SqlDataSetDefinition dsd = new SqlDataSetDefinition();
		dsd.setName("children");
		String sql = "SELECT * FROM (" + "SELECT person_id, " + "       identifier," + "       given_name, "
		        + "       family_name, " + "       birthdate, " + "       age, " + "       investigation, "
		        + "       encounter_datetime, " + "       value_numeric, " + "       value_text, " + "       comments, "
		        + "       name, " + "       result_text " + " FROM   (SELECT * " + "        FROM   (SELECT t1.given_name, "
		        + "                       t1.person_id, " + "                       t1.encounter_id, "
		        + "                       t1.family_name, " + "                       t1.identifier, "
		        + "                       t1.birthdate, " + "                       t1.age, "
		        + "                       t1.investigation, " + "                       t1.encounter_datetime, "
		        + "                       t1.value_numeric, " + "                       t1.value_text, "
		        + "                       t1.comments " + "                FROM   (SELECT pn.given_name, "
		        + "                               pn.person_id, " + "                               pn.family_name, "
		        + "                               pe.birthdate, "
		        + "                               TIMESTAMPDIFF(YEAR, birthdate, :endDate) AS age, "
		        + "                               pi.identifier, "
		        + "                               cn.name AS Investigation, "
		        + "                               e.encounter_datetime, "
		        + "                               o.value_numeric, " + "                               o.value_text, "
		        + "                               o.value_coded, " + "                               o.comments, "
		        + "                               e.encounter_id " + "                        FROM   obs o "
		        + "                               INNER JOIN encounter e "
		        + "                                       ON o.encounter_id = e.encounter_id "
		        + "                               INNER JOIN concept_name cn "
		        + "                                       ON cn.concept_id = o.concept_id "
		        + "                               INNER JOIN person_name pn "
		        + "                                       ON pn.person_id = o.person_id "
		        + "                               INNER JOIN person pe ON pn.person_id = pe.person_id "
		        + "                               INNER JOIN patient_identifier pi "
		        + "                                       ON pi.patient_id = pn.person_id "
		        + "                               INNER JOIN simplelabentry_labtest sl "
		        + "                                       ON o.encounter_id = sl.encounter_id "
		        + "                                          AND sl.concept_id = o.concept_id "
		        + "                                          AND cn.locale = 'en' "
		        + "                                          AND cn.locale_preferred = 1) t1)tn "
		        + "               INNER JOIN (SELECT encounter_id AS enc_id, "
		        + "                                  value_coded  AS result_value, "
		        + "                                  value_text   AS result_text "
		        + "                           FROM   obs)r1 " + "                       ON tn.encounter_id = r1.enc_id "
		        + "        WHERE  encounter_datetime BETWEEN :startDate AND :endDate "
		        + "               AND ( result_value <> '' " + "                      OR result_text <> '' "
		        + "                      OR value_numeric <> '' " + "                      OR value_text <> '' "
		        + "                      OR comments <> '' ))fn " + "       LEFT JOIN concept_name t2 "
		        + "              ON t2.concept_id = fn.result_value " + "                 AND t2.locale = 'en' "
		        + "                 AND t2.locale_preferred " + ") children " + " WHERE children.person_id IN ("
		        + "SELECT person_id FROM person  WHERE TIMESTAMPDIFF(YEAR, birthdate, :endDate) < 15)";
		
		String childSQL = "SELECT " + "  pn.given_name, " + "  pn.person_id, " + "  pn.family_name, " + "  birthdate, "
		        + "  10 AS age, " + "  pn.person_id asidentifier, " + "  cn.name AS Investigation, "
		        + "  e.encounter_datetime, " + "  o.value_numeric, " + "  o.value_text, " + "  o.value_coded, "
		        + "  o.comments, " + "  e.encounter_id " + "FROM  " + "  obs o "
		        + "  inner join encounter e on e.encounter_id = o.encounter_id "
		        + "  inner join concept_name cn on cn.concept_id = o.concept_id "
		        + "  inner join person_name pn on pn.person_id = o.person_id  "
		        + "  inner join person p on p.person_id = o.person_id  " + "WHERE  " + "  ( " + "    value_text <> '' "
		        + "    or value_numeric <> '' " + "    or value_coded <> '' " + "  ) limit   10 ";
		
		dsd.setSqlQuery(childSQL);
		
		String indParams = "startDate=${startDate},endDate=${endDate}";
		return Arrays.asList(ReportUtils.map((DataSetDefinition) dsd, ""));
	}
}
