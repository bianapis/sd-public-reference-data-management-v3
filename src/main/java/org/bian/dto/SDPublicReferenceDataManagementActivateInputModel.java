package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPublicReferenceDataManagementActivateInputModelPublicReferenceDataManagementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementActivateInputModel
 */
public class SDPublicReferenceDataManagementActivateInputModel   {
  private Object publicReferenceDataManagementActivationActionTaskRecord = null;

  private String publicReferenceDataManagementCenterReference = null;

  private String publicReferenceDataManagementServiceReference = null;

  private SDPublicReferenceDataManagementActivateInputModelPublicReferenceDataManagementServiceConfigurationRecord publicReferenceDataManagementServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return publicReferenceDataManagementActivationActionTaskRecord
  **/

  public Object getPublicReferenceDataManagementActivationActionTaskRecord() {
    return publicReferenceDataManagementActivationActionTaskRecord;
  }

  public void setPublicReferenceDataManagementActivationActionTaskRecord(Object publicReferenceDataManagementActivationActionTaskRecord) {
    this.publicReferenceDataManagementActivationActionTaskRecord = publicReferenceDataManagementActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return publicReferenceDataManagementCenterReference
  **/

  public String getPublicReferenceDataManagementCenterReference() {
    return publicReferenceDataManagementCenterReference;
  }

  public void setPublicReferenceDataManagementCenterReference(String publicReferenceDataManagementCenterReference) {
    this.publicReferenceDataManagementCenterReference = publicReferenceDataManagementCenterReference;
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

  public SDPublicReferenceDataManagementActivateInputModelPublicReferenceDataManagementServiceConfigurationRecord getPublicReferenceDataManagementServiceConfigurationRecord() {
    return publicReferenceDataManagementServiceConfigurationRecord;
  }

  public void setPublicReferenceDataManagementServiceConfigurationRecord(SDPublicReferenceDataManagementActivateInputModelPublicReferenceDataManagementServiceConfigurationRecord publicReferenceDataManagementServiceConfigurationRecord) {
    this.publicReferenceDataManagementServiceConfigurationRecord = publicReferenceDataManagementServiceConfigurationRecord;
  }


}

