package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPublicReferenceDataManagementActivateInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceConfigurationSetup;
import org.bian.dto.SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceAgreement;
import org.bian.dto.SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecord
 */
public class SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecord   {
  private String publicReferenceDataManagementServiceConfigurationSettingReference = null;

  private String publicReferenceDataManagementServiceConfigurationSettingDescription = null;

  private SDPublicReferenceDataManagementActivateInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceConfigurationSetup publicReferenceDataManagementServiceConfigurationSetup = null;

  private SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceSubscription publicReferenceDataManagementServiceSubscription = null;

  private SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceAgreement publicReferenceDataManagementServiceAgreement = null;

  private String publicReferenceDataManagementServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return publicReferenceDataManagementServiceConfigurationSettingReference
  **/

  public String getPublicReferenceDataManagementServiceConfigurationSettingReference() {
    return publicReferenceDataManagementServiceConfigurationSettingReference;
  }

  public void setPublicReferenceDataManagementServiceConfigurationSettingReference(String publicReferenceDataManagementServiceConfigurationSettingReference) {
    this.publicReferenceDataManagementServiceConfigurationSettingReference = publicReferenceDataManagementServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return publicReferenceDataManagementServiceConfigurationSettingDescription
  **/

  public String getPublicReferenceDataManagementServiceConfigurationSettingDescription() {
    return publicReferenceDataManagementServiceConfigurationSettingDescription;
  }

  public void setPublicReferenceDataManagementServiceConfigurationSettingDescription(String publicReferenceDataManagementServiceConfigurationSettingDescription) {
    this.publicReferenceDataManagementServiceConfigurationSettingDescription = publicReferenceDataManagementServiceConfigurationSettingDescription;
  }


  /**
   * Get publicReferenceDataManagementServiceConfigurationSetup
   * @return publicReferenceDataManagementServiceConfigurationSetup
  **/

  public SDPublicReferenceDataManagementActivateInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceConfigurationSetup getPublicReferenceDataManagementServiceConfigurationSetup() {
    return publicReferenceDataManagementServiceConfigurationSetup;
  }

  public void setPublicReferenceDataManagementServiceConfigurationSetup(SDPublicReferenceDataManagementActivateInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceConfigurationSetup publicReferenceDataManagementServiceConfigurationSetup) {
    this.publicReferenceDataManagementServiceConfigurationSetup = publicReferenceDataManagementServiceConfigurationSetup;
  }


  /**
   * Get publicReferenceDataManagementServiceSubscription
   * @return publicReferenceDataManagementServiceSubscription
  **/

  public SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceSubscription getPublicReferenceDataManagementServiceSubscription() {
    return publicReferenceDataManagementServiceSubscription;
  }

  public void setPublicReferenceDataManagementServiceSubscription(SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceSubscription publicReferenceDataManagementServiceSubscription) {
    this.publicReferenceDataManagementServiceSubscription = publicReferenceDataManagementServiceSubscription;
  }


  /**
   * Get publicReferenceDataManagementServiceAgreement
   * @return publicReferenceDataManagementServiceAgreement
  **/

  public SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceAgreement getPublicReferenceDataManagementServiceAgreement() {
    return publicReferenceDataManagementServiceAgreement;
  }

  public void setPublicReferenceDataManagementServiceAgreement(SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceAgreement publicReferenceDataManagementServiceAgreement) {
    this.publicReferenceDataManagementServiceAgreement = publicReferenceDataManagementServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return publicReferenceDataManagementServiceStatus
  **/

  public String getPublicReferenceDataManagementServiceStatus() {
    return publicReferenceDataManagementServiceStatus;
  }

  public void setPublicReferenceDataManagementServiceStatus(String publicReferenceDataManagementServiceStatus) {
    this.publicReferenceDataManagementServiceStatus = publicReferenceDataManagementServiceStatus;
  }


}

