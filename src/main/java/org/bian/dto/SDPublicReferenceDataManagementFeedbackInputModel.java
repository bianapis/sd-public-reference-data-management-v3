package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPublicReferenceDataManagementFeedbackInputModelPublicReferenceDataManagementFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementFeedbackInputModel
 */
public class SDPublicReferenceDataManagementFeedbackInputModel   {
  private Object publicReferenceDataManagementFeedbackActionTaskRecord = null;

  private SDPublicReferenceDataManagementFeedbackInputModelPublicReferenceDataManagementFeedbackActionRecord publicReferenceDataManagementFeedbackActionRecord = null;


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

  public SDPublicReferenceDataManagementFeedbackInputModelPublicReferenceDataManagementFeedbackActionRecord getPublicReferenceDataManagementFeedbackActionRecord() {
    return publicReferenceDataManagementFeedbackActionRecord;
  }

  public void setPublicReferenceDataManagementFeedbackActionRecord(SDPublicReferenceDataManagementFeedbackInputModelPublicReferenceDataManagementFeedbackActionRecord publicReferenceDataManagementFeedbackActionRecord) {
    this.publicReferenceDataManagementFeedbackActionRecord = publicReferenceDataManagementFeedbackActionRecord;
  }


}

