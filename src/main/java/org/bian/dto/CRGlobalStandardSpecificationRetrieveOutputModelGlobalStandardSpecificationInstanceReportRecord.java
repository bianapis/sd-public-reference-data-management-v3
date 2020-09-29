package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRGlobalStandardSpecificationRetrieveOutputModelGlobalStandardSpecificationInstanceReportRecord
 */
public class CRGlobalStandardSpecificationRetrieveOutputModelGlobalStandardSpecificationInstanceReportRecord   {
  private String globalStandardSpecificationInstanceReportData = null;

  private String globalStandardSpecificationInstanceReportType = null;

  private Object globalStandardSpecificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return globalStandardSpecificationInstanceReportData
  **/

  public String getGlobalStandardSpecificationInstanceReportData() {
    return globalStandardSpecificationInstanceReportData;
  }

  public void setGlobalStandardSpecificationInstanceReportData(String globalStandardSpecificationInstanceReportData) {
    this.globalStandardSpecificationInstanceReportData = globalStandardSpecificationInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return globalStandardSpecificationInstanceReportType
  **/

  public String getGlobalStandardSpecificationInstanceReportType() {
    return globalStandardSpecificationInstanceReportType;
  }

  public void setGlobalStandardSpecificationInstanceReportType(String globalStandardSpecificationInstanceReportType) {
    this.globalStandardSpecificationInstanceReportType = globalStandardSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return globalStandardSpecificationInstanceReport
  **/

  public Object getGlobalStandardSpecificationInstanceReport() {
    return globalStandardSpecificationInstanceReport;
  }

  public void setGlobalStandardSpecificationInstanceReport(Object globalStandardSpecificationInstanceReport) {
    this.globalStandardSpecificationInstanceReport = globalStandardSpecificationInstanceReport;
  }


}

