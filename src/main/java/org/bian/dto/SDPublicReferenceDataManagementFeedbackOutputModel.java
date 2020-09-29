package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPublicReferenceDataManagementFeedbackOutputModelPublicReferenceDataManagementFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementFeedbackOutputModel
 */
public class SDPublicReferenceDataManagementFeedbackOutputModel   {
  private String publicReferenceDataManagementFeedbackActionTaskReference = null;

  private Object publicReferenceDataManagementFeedbackActionTaskRecord = null;

  private SDPublicReferenceDataManagementFeedbackOutputModelPublicReferenceDataManagementFeedbackActionRecord publicReferenceDataManagementFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return publicReferenceDataManagementFeedbackActionTaskReference
  **/

  public String getPublicReferenceDataManagementFeedbackActionTaskReference() {
    return publicReferenceDataManagementFeedbackActionTaskReference;
  }

  public void setPublicReferenceDataManagementFeedbackActionTaskReference(String publicReferenceDataManagementFeedbackActionTaskReference) {
    this.publicReferenceDataManagementFeedbackActionTaskReference = publicReferenceDataManagementFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return publicReferenceDataManagementFeedbackActionTaskRecord
  **/

  public Object getPublicReferenceDataManagementFeedbackActionTaskRecord() {
    return publicReferenceDataManagementFeedbackActionTaskRecord;
  }

  public void setPublicReferenceDataManagementFeedbackActionTaskRecord(Object publicReferenceDataManagementFeedbackActionTaskRecord) {
    this.publicReferenceDataManagementFeedbackActionTaskRecord = publicReferenceDataManagementFeedbackActionTaskRecord;
  }


  /**
   * Get publicReferenceDataManagementFeedbackActionRecord
   * @return publicReferenceDataManagementFeedbackActionRecord
  **/

  public SDPublicReferenceDataManagementFeedbackOutputModelPublicReferenceDataManagementFeedbackActionRecord getPublicReferenceDataManagementFeedbackActionRecord() {
    return publicReferenceDataManagementFeedbackActionRecord;
  }

  public void setPublicReferenceDataManagementFeedbackActionRecord(SDPublicReferenceDataManagementFeedbackOutputModelPublicReferenceDataManagementFeedbackActionRecord publicReferenceDataManagementFeedbackActionRecord) {
    this.publicReferenceDataManagementFeedbackActionRecord = publicReferenceDataManagementFeedbackActionRecord;
  }


}

