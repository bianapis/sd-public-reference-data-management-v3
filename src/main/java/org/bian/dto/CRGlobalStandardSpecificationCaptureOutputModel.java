package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGlobalStandardSpecificationCaptureOutputModel
 */
public class CRGlobalStandardSpecificationCaptureOutputModel   {
  private String globalStandardSpecificationParameterType = null;

  private String globalStandardSpecificationSelectedOption = null;

  private String globalStandardSpecificationVersion = null;

  private String globalStandardSpecificationStatus = null;

  private String globalStandardSpecificationUsageLog = null;

  private String globalStandardSpecificationFeedback = null;

  private String globalStandardSpecificationCaptureActionTaskReference = null;

  private Object globalStandardSpecificationCaptureActionTaskRecord = null;

  private String captureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between designs according to the type of business services and/or aspect within Global Standard Specification . Eg Product Design, Campaign Design, Risk Model Design etc.  
   * @return globalStandardSpecificationParameterType
  **/

  public String getGlobalStandardSpecificationParameterType() {
    return globalStandardSpecificationParameterType;
  }

  public void setGlobalStandardSpecificationParameterType(String globalStandardSpecificationParameterType) {
    this.globalStandardSpecificationParameterType = globalStandardSpecificationParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of design 
   * @return globalStandardSpecificationSelectedOption
  **/

  public String getGlobalStandardSpecificationSelectedOption() {
    return globalStandardSpecificationSelectedOption;
  }

  public void setGlobalStandardSpecificationSelectedOption(String globalStandardSpecificationSelectedOption) {
    this.globalStandardSpecificationSelectedOption = globalStandardSpecificationSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version of Global Standard Specification 
   * @return globalStandardSpecificationVersion
  **/

  public String getGlobalStandardSpecificationVersion() {
    return globalStandardSpecificationVersion;
  }

  public void setGlobalStandardSpecificationVersion(String globalStandardSpecificationVersion) {
    this.globalStandardSpecificationVersion = globalStandardSpecificationVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Global Standard Specification 
   * @return globalStandardSpecificationStatus
  **/

  public String getGlobalStandardSpecificationStatus() {
    return globalStandardSpecificationStatus;
  }

  public void setGlobalStandardSpecificationStatus(String globalStandardSpecificationStatus) {
    this.globalStandardSpecificationStatus = globalStandardSpecificationStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (usage) ativities/events of Global Standard Specification 
   * @return globalStandardSpecificationUsageLog
  **/

  public String getGlobalStandardSpecificationUsageLog() {
    return globalStandardSpecificationUsageLog;
  }

  public void setGlobalStandardSpecificationUsageLog(String globalStandardSpecificationUsageLog) {
    this.globalStandardSpecificationUsageLog = globalStandardSpecificationUsageLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Information about reactions to a design which is used as a basis for improvement for the Global Standard Specification. 
   * @return globalStandardSpecificationFeedback
  **/

  public String getGlobalStandardSpecificationFeedback() {
    return globalStandardSpecificationFeedback;
  }

  public void setGlobalStandardSpecificationFeedback(String globalStandardSpecificationFeedback) {
    this.globalStandardSpecificationFeedback = globalStandardSpecificationFeedback;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Global Standard Specification instance capture service call 
   * @return globalStandardSpecificationCaptureActionTaskReference
  **/

  public String getGlobalStandardSpecificationCaptureActionTaskReference() {
    return globalStandardSpecificationCaptureActionTaskReference;
  }

  public void setGlobalStandardSpecificationCaptureActionTaskReference(String globalStandardSpecificationCaptureActionTaskReference) {
    this.globalStandardSpecificationCaptureActionTaskReference = globalStandardSpecificationCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return globalStandardSpecificationCaptureActionTaskRecord
  **/

  public Object getGlobalStandardSpecificationCaptureActionTaskRecord() {
    return globalStandardSpecificationCaptureActionTaskRecord;
  }

  public void setGlobalStandardSpecificationCaptureActionTaskRecord(Object globalStandardSpecificationCaptureActionTaskRecord) {
    this.globalStandardSpecificationCaptureActionTaskRecord = globalStandardSpecificationCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the structured input transaction/record 
   * @return captureRecordReference
  **/

  public String getCaptureRecordReference() {
    return captureRecordReference;
  }

  public void setCaptureRecordReference(String captureRecordReference) {
    this.captureRecordReference = captureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

