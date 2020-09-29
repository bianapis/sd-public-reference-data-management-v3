package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementActivateInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceConfigurationSetup
 */
public class SDPublicReferenceDataManagementActivateInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceConfigurationSetup   {
  private String publicReferenceDataManagementServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return publicReferenceDataManagementServiceConfigurationParameter
  **/

  public String getPublicReferenceDataManagementServiceConfigurationParameter() {
    return publicReferenceDataManagementServiceConfigurationParameter;
  }

  public void setPublicReferenceDataManagementServiceConfigurationParameter(String publicReferenceDataManagementServiceConfigurationParameter) {
    this.publicReferenceDataManagementServiceConfigurationParameter = publicReferenceDataManagementServiceConfigurationParameter;
  }


}

