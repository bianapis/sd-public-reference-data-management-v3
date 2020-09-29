package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQGlobalReferenceDataRetrieveOutputModelGlobalReferenceDataInstanceAnalysis
 */
public class BQGlobalReferenceDataRetrieveOutputModelGlobalReferenceDataInstanceAnalysis   {
  private Object globalReferenceDataInstanceAnalysisRecord = null;

  private String globalReferenceDataInstanceAnalysisReportType = null;

  private String globalReferenceDataInstanceAnalysisParameters = null;

  private Object globalReferenceDataInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return globalReferenceDataInstanceAnalysisRecord
  **/

  public Object getGlobalReferenceDataInstanceAnalysisRecord() {
    return globalReferenceDataInstanceAnalysisRecord;
  }

  public void setGlobalReferenceDataInstanceAnalysisRecord(Object globalReferenceDataInstanceAnalysisRecord) {
    this.globalReferenceDataInstanceAnalysisRecord = globalReferenceDataInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return globalReferenceDataInstanceAnalysisReportType
  **/

  public String getGlobalReferenceDataInstanceAnalysisReportType() {
    return globalReferenceDataInstanceAnalysisReportType;
  }

  public void setGlobalReferenceDataInstanceAnalysisReportType(String globalReferenceDataInstanceAnalysisReportType) {
    this.globalReferenceDataInstanceAnalysisReportType = globalReferenceDataInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return globalReferenceDataInstanceAnalysisParameters
  **/

  public String getGlobalReferenceDataInstanceAnalysisParameters() {
    return globalReferenceDataInstanceAnalysisParameters;
  }

  public void setGlobalReferenceDataInstanceAnalysisParameters(String globalReferenceDataInstanceAnalysisParameters) {
    this.globalReferenceDataInstanceAnalysisParameters = globalReferenceDataInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return globalReferenceDataInstanceAnalysisReport
  **/

  public Object getGlobalReferenceDataInstanceAnalysisReport() {
    return globalReferenceDataInstanceAnalysisReport;
  }

  public void setGlobalReferenceDataInstanceAnalysisReport(Object globalReferenceDataInstanceAnalysisReport) {
    this.globalReferenceDataInstanceAnalysisReport = globalReferenceDataInstanceAnalysisReport;
  }


}

