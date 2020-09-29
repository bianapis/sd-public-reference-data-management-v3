package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGlobalStandardSpecificationRetrieveOutputModelGlobalStandardSpecificationInstanceAnalysis
 */
public class CRGlobalStandardSpecificationRetrieveOutputModelGlobalStandardSpecificationInstanceAnalysis   {
  private String globalStandardSpecificationInstanceAnalysisData = null;

  private String globalStandardSpecificationInstanceAnalysisReportType = null;

  private Object globalStandardSpecificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return globalStandardSpecificationInstanceAnalysisData
  **/

  public String getGlobalStandardSpecificationInstanceAnalysisData() {
    return globalStandardSpecificationInstanceAnalysisData;
  }

  public void setGlobalStandardSpecificationInstanceAnalysisData(String globalStandardSpecificationInstanceAnalysisData) {
    this.globalStandardSpecificationInstanceAnalysisData = globalStandardSpecificationInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return globalStandardSpecificationInstanceAnalysisReportType
  **/

  public String getGlobalStandardSpecificationInstanceAnalysisReportType() {
    return globalStandardSpecificationInstanceAnalysisReportType;
  }

  public void setGlobalStandardSpecificationInstanceAnalysisReportType(String globalStandardSpecificationInstanceAnalysisReportType) {
    this.globalStandardSpecificationInstanceAnalysisReportType = globalStandardSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return globalStandardSpecificationInstanceAnalysisReport
  **/

  public Object getGlobalStandardSpecificationInstanceAnalysisReport() {
    return globalStandardSpecificationInstanceAnalysisReport;
  }

  public void setGlobalStandardSpecificationInstanceAnalysisReport(Object globalStandardSpecificationInstanceAnalysisReport) {
    this.globalStandardSpecificationInstanceAnalysisReport = globalStandardSpecificationInstanceAnalysisReport;
  }


}

