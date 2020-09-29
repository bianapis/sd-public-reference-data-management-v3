package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPublicReferenceDataManagementConfigureOutputModelPublicReferenceDataManagementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementConfigureOutputModel
 */
public class SDPublicReferenceDataManagementConfigureOutputModel   {
  private String publicReferenceDataManagementConfigurationActionTaskReference = null;

  private Object publicReferenceDataManagementConfigurationActionTaskRecord = null;

  private SDPublicReferenceDataManagementConfigureOutputModelPublicReferenceDataManagementServiceConfigurationRecord publicReferenceDataManagementServiceConfigurationRecord = null;

  private String publicReferenceDataManagementServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return publicReferenceDataManagementConfigurationActionTaskReference
  **/

  public String getPublicReferenceDataManagementConfigurationActionTaskReference() {
    return publicReferenceDataManagementConfigurationActionTaskReference;
  }

  public void setPublicReferenceDataManagementConfigurationActionTaskReference(String publicReferenceDataManagementConfigurationActionTaskReference) {
    this.publicReferenceDataManagementConfigurationActionTaskReference = publicReferenceDataManagementConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return publicReferenceDataManagementConfigurationActionTaskRecord
  **/

  public Object getPublicReferenceDataManagementConfigurationActionTaskRecord() {
    return publicReferenceDataManagementConfigurationActionTaskRecord;
  }

  public void setPublicReferenceDataManagementConfigurationActionTaskRecord(Object publicReferenceDataManagementConfigurationActionTaskRecord) {
    this.publicReferenceDataManagementConfigurationActionTaskRecord = publicReferenceDataManagementConfigurationActionTaskRecord;
  }


  /**
   * Get publicReferenceDataManagementServiceConfigurationRecord
   * @return publicReferenceDataManagementServiceConfigurationRecord
  **/

  public SDPublicReferenceDataManagementConfigureOutputModelPublicReferenceDataManagementServiceConfigurationRecord getPublicReferenceDataManagementServiceConfigurationRecord() {
    return publicReferenceDataManagementServiceConfigurationRecord;
  }

  public void setPublicReferenceDataManagementServiceConfigurationRecord(SDPublicReferenceDataManagementConfigureOutputModelPublicReferenceDataManagementServiceConfigurationRecord publicReferenceDataManagementServiceConfigurationRecord) {
    this.publicReferenceDataManagementServiceConfigurationRecord = publicReferenceDataManagementServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return publicReferenceDataManagementServicingSessionStatus
  **/

  public String getPublicReferenceDataManagementServicingSessionStatus() {
    return publicReferenceDataManagementServicingSessionStatus;
  }

  public void setPublicReferenceDataManagementServicingSessionStatus(String publicReferenceDataManagementServicingSessionStatus) {
    this.publicReferenceDataManagementServicingSessionStatus = publicReferenceDataManagementServicingSessionStatus;
  }


}

