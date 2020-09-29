package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPublicReferenceDataManagementRetrieveInputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecord;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementRetrieveInputModelPublicReferenceDataManagementOfferedService
 */
public class SDPublicReferenceDataManagementRetrieveInputModelPublicReferenceDataManagementOfferedService   {
  private String publicReferenceDataManagementServiceReference = null;

  private SDPublicReferenceDataManagementRetrieveInputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecord publicReferenceDataManagementServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return publicReferenceDataManagementServiceReference
  **/

  public String getPublicReferenceDataManagementServiceReference() {
    return publicReferenceDataManagementServiceReference;
  }

  public void setPublicReferenceDataManagementServiceReference(String publicReferenceDataManagementServiceReference) {
    this.publicReferenceDataManagementServiceReference = publicReferenceDataManagementServiceReference;
  }


  /**
   * Get publicReferenceDataManagementServiceRecord
   * @return publicReferenceDataManagementServiceRecord
  **/

  public SDPublicReferenceDataManagementRetrieveInputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecord getPublicReferenceDataManagementServiceRecord() {
    return publicReferenceDataManagementServiceRecord;
  }

  public void setPublicReferenceDataManagementServiceRecord(SDPublicReferenceDataManagementRetrieveInputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecord publicReferenceDataManagementServiceRecord) {
    this.publicReferenceDataManagementServiceRecord = publicReferenceDataManagementServiceRecord;
  }


}

