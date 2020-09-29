package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceSubscription
 */
public class SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceSubscription   {
  private String publicReferenceDataManagementServiceSubscriberReference = null;

  private String publicReferenceDataManagementServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return publicReferenceDataManagementServiceSubscriberReference
  **/

  public String getPublicReferenceDataManagementServiceSubscriberReference() {
    return publicReferenceDataManagementServiceSubscriberReference;
  }

  public void setPublicReferenceDataManagementServiceSubscriberReference(String publicReferenceDataManagementServiceSubscriberReference) {
    this.publicReferenceDataManagementServiceSubscriberReference = publicReferenceDataManagementServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return publicReferenceDataManagementServiceSubscriberAccessProfile
  **/

  public String getPublicReferenceDataManagementServiceSubscriberAccessProfile() {
    return publicReferenceDataManagementServiceSubscriberAccessProfile;
  }

  public void setPublicReferenceDataManagementServiceSubscriberAccessProfile(String publicReferenceDataManagementServiceSubscriberAccessProfile) {
    this.publicReferenceDataManagementServiceSubscriberAccessProfile = publicReferenceDataManagementServiceSubscriberAccessProfile;
  }


}

