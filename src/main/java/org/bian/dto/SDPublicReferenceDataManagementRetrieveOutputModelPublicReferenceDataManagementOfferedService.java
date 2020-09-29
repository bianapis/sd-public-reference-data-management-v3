package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecord;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedService
 */
public class SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedService   {
  private String publicReferenceDataManagementServiceReference = null;

  private SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecord publicReferenceDataManagementServiceRecord = null;


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

  public SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecord getPublicReferenceDataManagementServiceRecord() {
    return publicReferenceDataManagementServiceRecord;
  }

  public void setPublicReferenceDataManagementServiceRecord(SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecord publicReferenceDataManagementServiceRecord) {
    this.publicReferenceDataManagementServiceRecord = publicReferenceDataManagementServiceRecord;
  }


}

