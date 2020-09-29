package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQGlobalReferenceDataRetrieveInputModelGlobalReferenceDataInstanceAnalysis;
import org.bian.dto.BQGlobalReferenceDataRetrieveInputModelGlobalReferenceDataInstanceReport;

import javax.validation.Valid;
  
/**
 * BQGlobalReferenceDataRetrieveInputModel
 */
public class BQGlobalReferenceDataRetrieveInputModel   {
  private Object globalReferenceDataRetrieveActionTaskRecord = null;

  private String globalReferenceDataRetrieveActionRequest = null;

  private BQGlobalReferenceDataRetrieveInputModelGlobalReferenceDataInstanceReport globalReferenceDataInstanceReport = null;

  private BQGlobalReferenceDataRetrieveInputModelGlobalReferenceDataInstanceAnalysis globalReferenceDataInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return globalReferenceDataRetrieveActionTaskRecord
  **/

  public Object getGlobalReferenceDataRetrieveActionTaskRecord() {
    return globalReferenceDataRetrieveActionTaskRecord;
  }

  public void setGlobalReferenceDataRetrieveActionTaskRecord(Object globalReferenceDataRetrieveActionTaskRecord) {
    this.globalReferenceDataRetrieveActionTaskRecord = globalReferenceDataRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return globalReferenceDataRetrieveActionRequest
  **/

  public String getGlobalReferenceDataRetrieveActionRequest() {
    return globalReferenceDataRetrieveActionRequest;
  }

  public void setGlobalReferenceDataRetrieveActionRequest(String globalReferenceDataRetrieveActionRequest) {
    this.globalReferenceDataRetrieveActionRequest = globalReferenceDataRetrieveActionRequest;
  }


  /**
   * Get globalReferenceDataInstanceReport
   * @return globalReferenceDataInstanceReport
  **/

  public BQGlobalReferenceDataRetrieveInputModelGlobalReferenceDataInstanceReport getGlobalReferenceDataInstanceReport() {
    return globalReferenceDataInstanceReport;
  }

  public void setGlobalReferenceDataInstanceReport(BQGlobalReferenceDataRetrieveInputModelGlobalReferenceDataInstanceReport globalReferenceDataInstanceReport) {
    this.globalReferenceDataInstanceReport = globalReferenceDataInstanceReport;
  }


  /**
   * Get globalReferenceDataInstanceAnalysis
   * @return globalReferenceDataInstanceAnalysis
  **/

  public BQGlobalReferenceDataRetrieveInputModelGlobalReferenceDataInstanceAnalysis getGlobalReferenceDataInstanceAnalysis() {
    return globalReferenceDataInstanceAnalysis;
  }

  public void setGlobalReferenceDataInstanceAnalysis(BQGlobalReferenceDataRetrieveInputModelGlobalReferenceDataInstanceAnalysis globalReferenceDataInstanceAnalysis) {
    this.globalReferenceDataInstanceAnalysis = globalReferenceDataInstanceAnalysis;
  }


}

