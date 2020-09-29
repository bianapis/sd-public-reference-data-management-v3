package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementConfigureInputModel
 */
public class SDPublicReferenceDataManagementConfigureInputModel   {
  private Object publicReferenceDataManagementConfigurationActionTaskRecord = null;

  private String publicReferenceDataManagementServicingSessionReference = null;

  private String publicReferenceDataManagementServiceReference = null;

  private SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecord publicReferenceDataManagementServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return publicReferenceDataManagementServicingSessionReference
  **/

  public String getPublicReferenceDataManagementServicingSessionReference() {
    return publicReferenceDataManagementServicingSessionReference;
  }

  public void setPublicReferenceDataManagementServicingSessionReference(String publicReferenceDataManagementServicingSessionReference) {
    this.publicReferenceDataManagementServicingSessionReference = publicReferenceDataManagementServicingSessionReference;
  }


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
   * Get publicReferenceDataManagementServiceConfigurationRecord
   * @return publicReferenceDataManagementServiceConfigurationRecord
  **/

  public SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecord getPublicReferenceDataManagementServiceConfigurationRecord() {
    return publicReferenceDataManagementServiceConfigurationRecord;
  }

  public void setPublicReferenceDataManagementServiceConfigurationRecord(SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecord publicReferenceDataManagementServiceConfigurationRecord) {
    this.publicReferenceDataManagementServiceConfigurationRecord = publicReferenceDataManagementServiceConfigurationRecord;
  }


}

