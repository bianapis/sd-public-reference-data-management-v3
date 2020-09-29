package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGlobalStandardSpecificationRetrieveInputModelGlobalStandardSpecificationInstanceAnalysis
 */
public class CRGlobalStandardSpecificationRetrieveInputModelGlobalStandardSpecificationInstanceAnalysis   {
  private String globalStandardSpecificationInstanceAnalysisReference = null;

  private String globalStandardSpecificationInstanceAnalysisReportType = null;

  private String globalStandardSpecificationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return globalStandardSpecificationInstanceAnalysisReference
  **/

  public String getGlobalStandardSpecificationInstanceAnalysisReference() {
    return globalStandardSpecificationInstanceAnalysisReference;
  }

  public void setGlobalStandardSpecificationInstanceAnalysisReference(String globalStandardSpecificationInstanceAnalysisReference) {
    this.globalStandardSpecificationInstanceAnalysisReference = globalStandardSpecificationInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return globalStandardSpecificationInstanceAnalysisParameters
  **/

  public String getGlobalStandardSpecificationInstanceAnalysisParameters() {
    return globalStandardSpecificationInstanceAnalysisParameters;
  }

  public void setGlobalStandardSpecificationInstanceAnalysisParameters(String globalStandardSpecificationInstanceAnalysisParameters) {
    this.globalStandardSpecificationInstanceAnalysisParameters = globalStandardSpecificationInstanceAnalysisParameters;
  }


}

