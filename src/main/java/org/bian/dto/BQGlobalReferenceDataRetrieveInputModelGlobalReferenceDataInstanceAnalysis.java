package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQGlobalReferenceDataRetrieveInputModelGlobalReferenceDataInstanceAnalysis
 */
public class BQGlobalReferenceDataRetrieveInputModelGlobalReferenceDataInstanceAnalysis   {
  private String globalReferenceDataInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return globalReferenceDataInstanceAnalysisReference
  **/

  public String getGlobalReferenceDataInstanceAnalysisReference() {
    return globalReferenceDataInstanceAnalysisReference;
  }

  public void setGlobalReferenceDataInstanceAnalysisReference(String globalReferenceDataInstanceAnalysisReference) {
    this.globalReferenceDataInstanceAnalysisReference = globalReferenceDataInstanceAnalysisReference;
  }


}

