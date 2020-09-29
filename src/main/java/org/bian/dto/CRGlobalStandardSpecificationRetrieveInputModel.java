package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRGlobalStandardSpecificationRetrieveInputModelGlobalStandardSpecificationInstanceAnalysis;
import org.bian.dto.CRGlobalStandardSpecificationRetrieveInputModelGlobalStandardSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRGlobalStandardSpecificationRetrieveInputModel
 */
public class CRGlobalStandardSpecificationRetrieveInputModel   {
  private Object globalStandardSpecificationRetrieveActionTaskRecord = null;

  private String globalStandardSpecificationRetrieveActionRequest = null;

  private CRGlobalStandardSpecificationRetrieveInputModelGlobalStandardSpecificationInstanceReportRecord globalStandardSpecificationInstanceReportRecord = null;

  private CRGlobalStandardSpecificationRetrieveInputModelGlobalStandardSpecificationInstanceAnalysis globalStandardSpecificationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return globalStandardSpecificationRetrieveActionRequest
  **/

  public String getGlobalStandardSpecificationRetrieveActionRequest() {
    return globalStandardSpecificationRetrieveActionRequest;
  }

  public void setGlobalStandardSpecificationRetrieveActionRequest(String globalStandardSpecificationRetrieveActionRequest) {
    this.globalStandardSpecificationRetrieveActionRequest = globalStandardSpecificationRetrieveActionRequest;
  }


  /**
   * Get globalStandardSpecificationInstanceReportRecord
   * @return globalStandardSpecificationInstanceReportRecord
  **/

  public CRGlobalStandardSpecificationRetrieveInputModelGlobalStandardSpecificationInstanceReportRecord getGlobalStandardSpecificationInstanceReportRecord() {
    return globalStandardSpecificationInstanceReportRecord;
  }

  public void setGlobalStandardSpecificationInstanceReportRecord(CRGlobalStandardSpecificationRetrieveInputModelGlobalStandardSpecificationInstanceReportRecord globalStandardSpecificationInstanceReportRecord) {
    this.globalStandardSpecificationInstanceReportRecord = globalStandardSpecificationInstanceReportRecord;
  }


  /**
   * Get globalStandardSpecificationInstanceAnalysis
   * @return globalStandardSpecificationInstanceAnalysis
  **/

  public CRGlobalStandardSpecificationRetrieveInputModelGlobalStandardSpecificationInstanceAnalysis getGlobalStandardSpecificationInstanceAnalysis() {
    return globalStandardSpecificationInstanceAnalysis;
  }

  public void setGlobalStandardSpecificationInstanceAnalysis(CRGlobalStandardSpecificationRetrieveInputModelGlobalStandardSpecificationInstanceAnalysis globalStandardSpecificationInstanceAnalysis) {
    this.globalStandardSpecificationInstanceAnalysis = globalStandardSpecificationInstanceAnalysis;
  }


}

