package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGlobalStandardSpecificationRetrieveOutputModelGlobalStandardSpecificationInstanceAnalysis;
import org.bian.dto.CRGlobalStandardSpecificationRetrieveOutputModelGlobalStandardSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRGlobalStandardSpecificationRetrieveOutputModel
 */
public class CRGlobalStandardSpecificationRetrieveOutputModel   {
  private String globalStandardSpecificationParameterType = null;

  private String globalStandardSpecificationSelectedOption = null;

  private String globalStandardSpecificationDescription = null;

  private String globalStandardSpecificationVersion = null;

  private String globalStandardSpecificationStatus = null;

  private String globalStandardSpecificationUsageLog = null;

  private String globalStandardSpecificationFeedback = null;

  private String globalStandardSpecificationServiceProviderReference = null;

  private String globalStandardSpecificationRetrieveActionTaskReference = null;

  private Object globalStandardSpecificationRetrieveActionTaskRecord = null;

  private String globalStandardSpecificationRetrieveActionResponse = null;

  private CRGlobalStandardSpecificationRetrieveOutputModelGlobalStandardSpecificationInstanceReportRecord globalStandardSpecificationInstanceReportRecord = null;

  private CRGlobalStandardSpecificationRetrieveOutputModelGlobalStandardSpecificationInstanceAnalysis globalStandardSpecificationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation of Global Standard Specification 
   * @return globalStandardSpecificationDescription
  **/

  public String getGlobalStandardSpecificationDescription() {
    return globalStandardSpecificationDescription;
  }

  public void setGlobalStandardSpecificationDescription(String globalStandardSpecificationDescription) {
    this.globalStandardSpecificationDescription = globalStandardSpecificationDescription;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who has provided Global Standard Specification 
   * @return globalStandardSpecificationServiceProviderReference
  **/

  public String getGlobalStandardSpecificationServiceProviderReference() {
    return globalStandardSpecificationServiceProviderReference;
  }

  public void setGlobalStandardSpecificationServiceProviderReference(String globalStandardSpecificationServiceProviderReference) {
    this.globalStandardSpecificationServiceProviderReference = globalStandardSpecificationServiceProviderReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Global Standard Specification instance retrieve service call 
   * @return globalStandardSpecificationRetrieveActionTaskReference
  **/

  public String getGlobalStandardSpecificationRetrieveActionTaskReference() {
    return globalStandardSpecificationRetrieveActionTaskReference;
  }

  public void setGlobalStandardSpecificationRetrieveActionTaskReference(String globalStandardSpecificationRetrieveActionTaskReference) {
    this.globalStandardSpecificationRetrieveActionTaskReference = globalStandardSpecificationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return globalStandardSpecificationRetrieveActionTaskRecord
  **/

  public Object getGlobalStandardSpecificationRetrieveActionTaskRecord() {
    return globalStandardSpecificationRetrieveActionTaskRecord;
  }

  public void setGlobalStandardSpecificationRetrieveActionTaskRecord(Object globalStandardSpecificationRetrieveActionTaskRecord) {
    this.globalStandardSpecificationRetrieveActionTaskRecord = globalStandardSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return globalStandardSpecificationRetrieveActionResponse
  **/

  public String getGlobalStandardSpecificationRetrieveActionResponse() {
    return globalStandardSpecificationRetrieveActionResponse;
  }

  public void setGlobalStandardSpecificationRetrieveActionResponse(String globalStandardSpecificationRetrieveActionResponse) {
    this.globalStandardSpecificationRetrieveActionResponse = globalStandardSpecificationRetrieveActionResponse;
  }


  /**
   * Get globalStandardSpecificationInstanceReportRecord
   * @return globalStandardSpecificationInstanceReportRecord
  **/

  public CRGlobalStandardSpecificationRetrieveOutputModelGlobalStandardSpecificationInstanceReportRecord getGlobalStandardSpecificationInstanceReportRecord() {
    return globalStandardSpecificationInstanceReportRecord;
  }

  public void setGlobalStandardSpecificationInstanceReportRecord(CRGlobalStandardSpecificationRetrieveOutputModelGlobalStandardSpecificationInstanceReportRecord globalStandardSpecificationInstanceReportRecord) {
    this.globalStandardSpecificationInstanceReportRecord = globalStandardSpecificationInstanceReportRecord;
  }


  /**
   * Get globalStandardSpecificationInstanceAnalysis
   * @return globalStandardSpecificationInstanceAnalysis
  **/

  public CRGlobalStandardSpecificationRetrieveOutputModelGlobalStandardSpecificationInstanceAnalysis getGlobalStandardSpecificationInstanceAnalysis() {
    return globalStandardSpecificationInstanceAnalysis;
  }

  public void setGlobalStandardSpecificationInstanceAnalysis(CRGlobalStandardSpecificationRetrieveOutputModelGlobalStandardSpecificationInstanceAnalysis globalStandardSpecificationInstanceAnalysis) {
    this.globalStandardSpecificationInstanceAnalysis = globalStandardSpecificationInstanceAnalysis;
  }


}

