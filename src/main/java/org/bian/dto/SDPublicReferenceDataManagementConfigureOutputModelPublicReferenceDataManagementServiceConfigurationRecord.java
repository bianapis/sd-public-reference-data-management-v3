package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceAgreement;
import org.bian.dto.SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceConfigurationSetup;
import org.bian.dto.SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementConfigureOutputModelPublicReferenceDataManagementServiceConfigurationRecord
 */
public class SDPublicReferenceDataManagementConfigureOutputModelPublicReferenceDataManagementServiceConfigurationRecord   {
  private String publicReferenceDataManagementServiceConfigurationSettingDescription = null;

  private SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceConfigurationSetup publicReferenceDataManagementServiceConfigurationSetup = null;

  private SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceSubscription publicReferenceDataManagementServiceSubscription = null;

  private SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceAgreement publicReferenceDataManagementServiceAgreement = null;

  private String publicReferenceDataManagementServiceStatus = null;


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

  public SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceConfigurationSetup getPublicReferenceDataManagementServiceConfigurationSetup() {
    return publicReferenceDataManagementServiceConfigurationSetup;
  }

  public void setPublicReferenceDataManagementServiceConfigurationSetup(SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceConfigurationSetup publicReferenceDataManagementServiceConfigurationSetup) {
    this.publicReferenceDataManagementServiceConfigurationSetup = publicReferenceDataManagementServiceConfigurationSetup;
  }


  /**
   * Get publicReferenceDataManagementServiceSubscription
   * @return publicReferenceDataManagementServiceSubscription
  **/

  public SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceSubscription getPublicReferenceDataManagementServiceSubscription() {
    return publicReferenceDataManagementServiceSubscription;
  }

  public void setPublicReferenceDataManagementServiceSubscription(SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceSubscription publicReferenceDataManagementServiceSubscription) {
    this.publicReferenceDataManagementServiceSubscription = publicReferenceDataManagementServiceSubscription;
  }


  /**
   * Get publicReferenceDataManagementServiceAgreement
   * @return publicReferenceDataManagementServiceAgreement
  **/

  public SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceAgreement getPublicReferenceDataManagementServiceAgreement() {
    return publicReferenceDataManagementServiceAgreement;
  }

  public void setPublicReferenceDataManagementServiceAgreement(SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceAgreement publicReferenceDataManagementServiceAgreement) {
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

