package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedService;
import org.bian.dto.SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementRetrieveOutputModel
 */
public class SDPublicReferenceDataManagementRetrieveOutputModel   {
  private String publicReferenceDataManagementRetrieveActionTaskReference = null;

  private Object publicReferenceDataManagementRetrieveActionTaskRecord = null;

  private String publicReferenceDataManagementRetrieveActionResponse = null;

  private SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementRetrieveActionRecord publicReferenceDataManagementRetrieveActionRecord = null;

  private SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedService publicReferenceDataManagementOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return publicReferenceDataManagementRetrieveActionTaskReference
  **/

  public String getPublicReferenceDataManagementRetrieveActionTaskReference() {
    return publicReferenceDataManagementRetrieveActionTaskReference;
  }

  public void setPublicReferenceDataManagementRetrieveActionTaskReference(String publicReferenceDataManagementRetrieveActionTaskReference) {
    this.publicReferenceDataManagementRetrieveActionTaskReference = publicReferenceDataManagementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return publicReferenceDataManagementRetrieveActionTaskRecord
  **/

  public Object getPublicReferenceDataManagementRetrieveActionTaskRecord() {
    return publicReferenceDataManagementRetrieveActionTaskRecord;
  }

  public void setPublicReferenceDataManagementRetrieveActionTaskRecord(Object publicReferenceDataManagementRetrieveActionTaskRecord) {
    this.publicReferenceDataManagementRetrieveActionTaskRecord = publicReferenceDataManagementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return publicReferenceDataManagementRetrieveActionResponse
  **/

  public String getPublicReferenceDataManagementRetrieveActionResponse() {
    return publicReferenceDataManagementRetrieveActionResponse;
  }

  public void setPublicReferenceDataManagementRetrieveActionResponse(String publicReferenceDataManagementRetrieveActionResponse) {
    this.publicReferenceDataManagementRetrieveActionResponse = publicReferenceDataManagementRetrieveActionResponse;
  }


  /**
   * Get publicReferenceDataManagementRetrieveActionRecord
   * @return publicReferenceDataManagementRetrieveActionRecord
  **/

  public SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementRetrieveActionRecord getPublicReferenceDataManagementRetrieveActionRecord() {
    return publicReferenceDataManagementRetrieveActionRecord;
  }

  public void setPublicReferenceDataManagementRetrieveActionRecord(SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementRetrieveActionRecord publicReferenceDataManagementRetrieveActionRecord) {
    this.publicReferenceDataManagementRetrieveActionRecord = publicReferenceDataManagementRetrieveActionRecord;
  }


  /**
   * Get publicReferenceDataManagementOfferedService
   * @return publicReferenceDataManagementOfferedService
  **/

  public SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedService getPublicReferenceDataManagementOfferedService() {
    return publicReferenceDataManagementOfferedService;
  }

  public void setPublicReferenceDataManagementOfferedService(SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedService publicReferenceDataManagementOfferedService) {
    this.publicReferenceDataManagementOfferedService = publicReferenceDataManagementOfferedService;
  }


}

