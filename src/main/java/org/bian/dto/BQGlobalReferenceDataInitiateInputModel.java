package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQGlobalReferenceDataInitiateInputModel
 */
public class BQGlobalReferenceDataInitiateInputModel   {
  private String globalStandardSpecificationInstanceReference = null;

  private Object globalReferenceDataInitiateActionRecord = null;

  private String globalReferenceDataPreconditions = null;

  private String globalReferenceDataSpecificationSchedule = null;

  private String globalReferenceDataVersionNumber = null;

  private String externalReferenceData = null;

  private String externalReferenceDataServiceType = null;

  private String externalReferenceDataServiceDescription = null;

  private String externalReferenceDataServiceInputsandOuputs = null;

  private String externalReferenceDataServiceWorkProduct = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Global Standard Specification instance 
   * @return globalStandardSpecificationInstanceReference
  **/

  public String getGlobalStandardSpecificationInstanceReference() {
    return globalStandardSpecificationInstanceReference;
  }

  public void setGlobalStandardSpecificationInstanceReference(String globalStandardSpecificationInstanceReference) {
    this.globalStandardSpecificationInstanceReference = globalStandardSpecificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return globalReferenceDataInitiateActionRecord
  **/

  public Object getGlobalReferenceDataInitiateActionRecord() {
    return globalReferenceDataInitiateActionRecord;
  }

  public void setGlobalReferenceDataInitiateActionRecord(Object globalReferenceDataInitiateActionRecord) {
    this.globalReferenceDataInitiateActionRecord = globalReferenceDataInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return globalReferenceDataPreconditions
  **/

  public String getGlobalReferenceDataPreconditions() {
    return globalReferenceDataPreconditions;
  }

  public void setGlobalReferenceDataPreconditions(String globalReferenceDataPreconditions) {
    this.globalReferenceDataPreconditions = globalReferenceDataPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return globalReferenceDataSpecificationSchedule
  **/

  public String getGlobalReferenceDataSpecificationSchedule() {
    return globalReferenceDataSpecificationSchedule;
  }

  public void setGlobalReferenceDataSpecificationSchedule(String globalReferenceDataSpecificationSchedule) {
    this.globalReferenceDataSpecificationSchedule = globalReferenceDataSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return globalReferenceDataVersionNumber
  **/

  public String getGlobalReferenceDataVersionNumber() {
    return globalReferenceDataVersionNumber;
  }

  public void setGlobalReferenceDataVersionNumber(String globalReferenceDataVersionNumber) {
    this.globalReferenceDataVersionNumber = globalReferenceDataVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Global Standard Specification specific Business Service 
   * @return externalReferenceData
  **/

  public String getExternalReferenceData() {
    return externalReferenceData;
  }

  public void setExternalReferenceData(String externalReferenceData) {
    this.externalReferenceData = externalReferenceData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return externalReferenceDataServiceType
  **/

  public String getExternalReferenceDataServiceType() {
    return externalReferenceDataServiceType;
  }

  public void setExternalReferenceDataServiceType(String externalReferenceDataServiceType) {
    this.externalReferenceDataServiceType = externalReferenceDataServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return externalReferenceDataServiceDescription
  **/

  public String getExternalReferenceDataServiceDescription() {
    return externalReferenceDataServiceDescription;
  }

  public void setExternalReferenceDataServiceDescription(String externalReferenceDataServiceDescription) {
    this.externalReferenceDataServiceDescription = externalReferenceDataServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return externalReferenceDataServiceInputsandOuputs
  **/

  public String getExternalReferenceDataServiceInputsandOuputs() {
    return externalReferenceDataServiceInputsandOuputs;
  }

  public void setExternalReferenceDataServiceInputsandOuputs(String externalReferenceDataServiceInputsandOuputs) {
    this.externalReferenceDataServiceInputsandOuputs = externalReferenceDataServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return externalReferenceDataServiceWorkProduct
  **/

  public String getExternalReferenceDataServiceWorkProduct() {
    return externalReferenceDataServiceWorkProduct;
  }

  public void setExternalReferenceDataServiceWorkProduct(String externalReferenceDataServiceWorkProduct) {
    this.externalReferenceDataServiceWorkProduct = externalReferenceDataServiceWorkProduct;
  }


}

