package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDPublicReferenceDataManagementRetrieveInputModelPublicReferenceDataManagementOfferedService;
import org.bian.dto.SDPublicReferenceDataManagementRetrieveInputModelPublicReferenceDataManagementRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementRetrieveInputModel
 */
public class SDPublicReferenceDataManagementRetrieveInputModel   {
  private Object publicReferenceDataManagementRetrieveActionTaskRecord = null;

  private String publicReferenceDataManagementRetrieveActionRequest = null;

  private SDPublicReferenceDataManagementRetrieveInputModelPublicReferenceDataManagementRetrieveActionRecord publicReferenceDataManagementRetrieveActionRecord = null;

  private SDPublicReferenceDataManagementRetrieveInputModelPublicReferenceDataManagementOfferedService publicReferenceDataManagementOfferedService = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return publicReferenceDataManagementRetrieveActionRequest
  **/

  public String getPublicReferenceDataManagementRetrieveActionRequest() {
    return publicReferenceDataManagementRetrieveActionRequest;
  }

  public void setPublicReferenceDataManagementRetrieveActionRequest(String publicReferenceDataManagementRetrieveActionRequest) {
    this.publicReferenceDataManagementRetrieveActionRequest = publicReferenceDataManagementRetrieveActionRequest;
  }


  /**
   * Get publicReferenceDataManagementRetrieveActionRecord
   * @return publicReferenceDataManagementRetrieveActionRecord
  **/

  public SDPublicReferenceDataManagementRetrieveInputModelPublicReferenceDataManagementRetrieveActionRecord getPublicReferenceDataManagementRetrieveActionRecord() {
    return publicReferenceDataManagementRetrieveActionRecord;
  }

  public void setPublicReferenceDataManagementRetrieveActionRecord(SDPublicReferenceDataManagementRetrieveInputModelPublicReferenceDataManagementRetrieveActionRecord publicReferenceDataManagementRetrieveActionRecord) {
    this.publicReferenceDataManagementRetrieveActionRecord = publicReferenceDataManagementRetrieveActionRecord;
  }


  /**
   * Get publicReferenceDataManagementOfferedService
   * @return publicReferenceDataManagementOfferedService
  **/

  public SDPublicReferenceDataManagementRetrieveInputModelPublicReferenceDataManagementOfferedService getPublicReferenceDataManagementOfferedService() {
    return publicReferenceDataManagementOfferedService;
  }

  public void setPublicReferenceDataManagementOfferedService(SDPublicReferenceDataManagementRetrieveInputModelPublicReferenceDataManagementOfferedService publicReferenceDataManagementOfferedService) {
    this.publicReferenceDataManagementOfferedService = publicReferenceDataManagementOfferedService;
  }


}

