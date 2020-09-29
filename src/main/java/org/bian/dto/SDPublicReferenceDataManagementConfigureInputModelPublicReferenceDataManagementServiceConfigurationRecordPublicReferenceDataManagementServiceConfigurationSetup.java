package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceConfigurationSetup
 */
public class SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceConfigurationSetup   {
  private String publicReferenceDataManagementServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return publicReferenceDataManagementServiceConfigurationParameter
  **/

  public String getPublicReferenceDataManagementServiceConfigurationParameter() {
    return publicReferenceDataManagementServiceConfigurationParameter;
  }

  public void setPublicReferenceDataManagementServiceConfigurationParameter(String publicReferenceDataManagementServiceConfigurationParameter) {
    this.publicReferenceDataManagementServiceConfigurationParameter = publicReferenceDataManagementServiceConfigurationParameter;
  }


}

