package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGlobalStandardSpecificationExchangeOutputModel
 */
public class CRGlobalStandardSpecificationExchangeOutputModel   {
  private String globalStandardSpecificationParameterType = null;

  private String globalStandardSpecificationSelectedOption = null;

  private String globalStandardSpecificationVersion = null;

  private String globalStandardSpecificationStatus = null;

  private String globalStandardSpecificationUsageLog = null;

  private String globalStandardSpecificationFeedback = null;

  private String globalStandardSpecificationExchangeActionTaskReference = null;

  private Object globalStandardSpecificationExchangeActionTaskRecord = null;

  private String globalStandardSpecificationExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Global Standard Specification instance exchange service call 
   * @return globalStandardSpecificationExchangeActionTaskReference
  **/

  public String getGlobalStandardSpecificationExchangeActionTaskReference() {
    return globalStandardSpecificationExchangeActionTaskReference;
  }

  public void setGlobalStandardSpecificationExchangeActionTaskReference(String globalStandardSpecificationExchangeActionTaskReference) {
    this.globalStandardSpecificationExchangeActionTaskReference = globalStandardSpecificationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return globalStandardSpecificationExchangeActionTaskRecord
  **/

  public Object getGlobalStandardSpecificationExchangeActionTaskRecord() {
    return globalStandardSpecificationExchangeActionTaskRecord;
  }

  public void setGlobalStandardSpecificationExchangeActionTaskRecord(Object globalStandardSpecificationExchangeActionTaskRecord) {
    this.globalStandardSpecificationExchangeActionTaskRecord = globalStandardSpecificationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return globalStandardSpecificationExchangeActionResponse
  **/

  public String getGlobalStandardSpecificationExchangeActionResponse() {
    return globalStandardSpecificationExchangeActionResponse;
  }

  public void setGlobalStandardSpecificationExchangeActionResponse(String globalStandardSpecificationExchangeActionResponse) {
    this.globalStandardSpecificationExchangeActionResponse = globalStandardSpecificationExchangeActionResponse;
  }


}

