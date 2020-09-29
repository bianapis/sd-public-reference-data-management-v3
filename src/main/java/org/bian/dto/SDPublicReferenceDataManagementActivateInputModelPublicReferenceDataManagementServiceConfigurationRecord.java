package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPublicReferenceDataManagementActivateInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementActivateInputModelPublicReferenceDataManagementServiceConfigurationRecord
 */
public class SDPublicReferenceDataManagementActivateInputModelPublicReferenceDataManagementServiceConfigurationRecord   {
  private String publicReferenceDataManagementServiceConfigurationSettingReference = null;

  private String publicReferenceDataManagementServiceConfigurationSettingType = null;

  private SDPublicReferenceDataManagementActivateInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceConfigurationSetup publicReferenceDataManagementServiceConfigurationSetup = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return publicReferenceDataManagementServiceConfigurationSettingType
  **/

  public String getPublicReferenceDataManagementServiceConfigurationSettingType() {
    return publicReferenceDataManagementServiceConfigurationSettingType;
  }

  public void setPublicReferenceDataManagementServiceConfigurationSettingType(String publicReferenceDataManagementServiceConfigurationSettingType) {
    this.publicReferenceDataManagementServiceConfigurationSettingType = publicReferenceDataManagementServiceConfigurationSettingType;
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


}

