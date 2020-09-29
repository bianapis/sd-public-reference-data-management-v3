package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQGlobalReferenceDataRetrieveInputModelGlobalReferenceDataInstanceReport
 */
public class BQGlobalReferenceDataRetrieveInputModelGlobalReferenceDataInstanceReport   {
  private String globalReferenceDataInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return globalReferenceDataInstanceReportReference
  **/

  public String getGlobalReferenceDataInstanceReportReference() {
    return globalReferenceDataInstanceReportReference;
  }

  public void setGlobalReferenceDataInstanceReportReference(String globalReferenceDataInstanceReportReference) {
    this.globalReferenceDataInstanceReportReference = globalReferenceDataInstanceReportReference;
  }


}

