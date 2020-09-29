package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGlobalStandardSpecificationRetrieveInputModelGlobalStandardSpecificationInstanceReportRecord
 */
public class CRGlobalStandardSpecificationRetrieveInputModelGlobalStandardSpecificationInstanceReportRecord   {
  private String globalStandardSpecificationInstanceReportReference = null;

  private String globalStandardSpecificationInstanceReportType = null;

  private String globalStandardSpecificationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return globalStandardSpecificationInstanceReportReference
  **/

  public String getGlobalStandardSpecificationInstanceReportReference() {
    return globalStandardSpecificationInstanceReportReference;
  }

  public void setGlobalStandardSpecificationInstanceReportReference(String globalStandardSpecificationInstanceReportReference) {
    this.globalStandardSpecificationInstanceReportReference = globalStandardSpecificationInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return globalStandardSpecificationInstanceReportType
  **/

  public String getGlobalStandardSpecificationInstanceReportType() {
    return globalStandardSpecificationInstanceReportType;
  }

  public void setGlobalStandardSpecificationInstanceReportType(String globalStandardSpecificationInstanceReportType) {
    this.globalStandardSpecificationInstanceReportType = globalStandardSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return globalStandardSpecificationInstanceReportParameters
  **/

  public String getGlobalStandardSpecificationInstanceReportParameters() {
    return globalStandardSpecificationInstanceReportParameters;
  }

  public void setGlobalStandardSpecificationInstanceReportParameters(String globalStandardSpecificationInstanceReportParameters) {
    this.globalStandardSpecificationInstanceReportParameters = globalStandardSpecificationInstanceReportParameters;
  }


}

