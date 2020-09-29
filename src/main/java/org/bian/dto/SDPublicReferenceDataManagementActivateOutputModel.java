package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementActivateOutputModel
 */
public class SDPublicReferenceDataManagementActivateOutputModel   {
  private String publicReferenceDataManagementActivationActionTaskReference = null;

  private Object publicReferenceDataManagementActivationActionTaskRecord = null;

  private String publicReferenceDataManagementServicingSessionReference = null;

  private Object publicReferenceDataManagementServicingSessionRecord = null;

  private SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecord publicReferenceDataManagementServiceConfigurationRecord = null;

  private String publicReferenceDataManagementServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return publicReferenceDataManagementActivationActionTaskReference
  **/

  public String getPublicReferenceDataManagementActivationActionTaskReference() {
    return publicReferenceDataManagementActivationActionTaskReference;
  }

  public void setPublicReferenceDataManagementActivationActionTaskReference(String publicReferenceDataManagementActivationActionTaskReference) {
    this.publicReferenceDataManagementActivationActionTaskReference = publicReferenceDataManagementActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return publicReferenceDataManagementServicingSessionRecord
  **/

  public Object getPublicReferenceDataManagementServicingSessionRecord() {
    return publicReferenceDataManagementServicingSessionRecord;
  }

  public void setPublicReferenceDataManagementServicingSessionRecord(Object publicReferenceDataManagementServicingSessionRecord) {
    this.publicReferenceDataManagementServicingSessionRecord = publicReferenceDataManagementServicingSessionRecord;
  }


  /**
   * Get publicReferenceDataManagementServiceConfigurationRecord
   * @return publicReferenceDataManagementServiceConfigurationRecord
  **/

  public SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecord getPublicReferenceDataManagementServiceConfigurationRecord() {
    return publicReferenceDataManagementServiceConfigurationRecord;
  }

  public void setPublicReferenceDataManagementServiceConfigurationRecord(SDPublicReferenceDataManagementActivateOutputModelPublicReferenceDataManagementServiceConfigurationRecord publicReferenceDataManagementServiceConfigurationRecord) {
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

