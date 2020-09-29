package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecordPublicReferenceDataManagementServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecord
 */
public class SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecord   {
  private String publicReferenceDataManagementServiceType = null;

  private String publicReferenceDataManagementServiceVersion = null;

  private String publicReferenceDataManagementServiceDescription = null;

  private SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecordPublicReferenceDataManagementServicePoliciesandGuidelines publicReferenceDataManagementServicePoliciesandGuidelines = null;

  private String publicReferenceDataManagementServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return publicReferenceDataManagementServiceType
  **/

  public String getPublicReferenceDataManagementServiceType() {
    return publicReferenceDataManagementServiceType;
  }

  public void setPublicReferenceDataManagementServiceType(String publicReferenceDataManagementServiceType) {
    this.publicReferenceDataManagementServiceType = publicReferenceDataManagementServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return publicReferenceDataManagementServiceVersion
  **/

  public String getPublicReferenceDataManagementServiceVersion() {
    return publicReferenceDataManagementServiceVersion;
  }

  public void setPublicReferenceDataManagementServiceVersion(String publicReferenceDataManagementServiceVersion) {
    this.publicReferenceDataManagementServiceVersion = publicReferenceDataManagementServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return publicReferenceDataManagementServiceDescription
  **/

  public String getPublicReferenceDataManagementServiceDescription() {
    return publicReferenceDataManagementServiceDescription;
  }

  public void setPublicReferenceDataManagementServiceDescription(String publicReferenceDataManagementServiceDescription) {
    this.publicReferenceDataManagementServiceDescription = publicReferenceDataManagementServiceDescription;
  }


  /**
   * Get publicReferenceDataManagementServicePoliciesandGuidelines
   * @return publicReferenceDataManagementServicePoliciesandGuidelines
  **/

  public SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecordPublicReferenceDataManagementServicePoliciesandGuidelines getPublicReferenceDataManagementServicePoliciesandGuidelines() {
    return publicReferenceDataManagementServicePoliciesandGuidelines;
  }

  public void setPublicReferenceDataManagementServicePoliciesandGuidelines(SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecordPublicReferenceDataManagementServicePoliciesandGuidelines publicReferenceDataManagementServicePoliciesandGuidelines) {
    this.publicReferenceDataManagementServicePoliciesandGuidelines = publicReferenceDataManagementServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return publicReferenceDataManagementServiceSchedule
  **/

  public String getPublicReferenceDataManagementServiceSchedule() {
    return publicReferenceDataManagementServiceSchedule;
  }

  public void setPublicReferenceDataManagementServiceSchedule(String publicReferenceDataManagementServiceSchedule) {
    this.publicReferenceDataManagementServiceSchedule = publicReferenceDataManagementServiceSchedule;
  }


}

