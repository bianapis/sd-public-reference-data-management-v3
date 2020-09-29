package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecordPublicReferenceDataManagementServicePoliciesandGuidelines
 */
public class SDPublicReferenceDataManagementRetrieveOutputModelPublicReferenceDataManagementOfferedServicePublicReferenceDataManagementServiceRecordPublicReferenceDataManagementServicePoliciesandGuidelines   {
  private String publicReferenceDataManagementServiceEligibility = null;

  private String publicReferenceDataManagementServiceIntendedUses = null;

  private String publicReferenceDataManagementServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return publicReferenceDataManagementServiceEligibility
  **/

  public String getPublicReferenceDataManagementServiceEligibility() {
    return publicReferenceDataManagementServiceEligibility;
  }

  public void setPublicReferenceDataManagementServiceEligibility(String publicReferenceDataManagementServiceEligibility) {
    this.publicReferenceDataManagementServiceEligibility = publicReferenceDataManagementServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return publicReferenceDataManagementServiceIntendedUses
  **/

  public String getPublicReferenceDataManagementServiceIntendedUses() {
    return publicReferenceDataManagementServiceIntendedUses;
  }

  public void setPublicReferenceDataManagementServiceIntendedUses(String publicReferenceDataManagementServiceIntendedUses) {
    this.publicReferenceDataManagementServiceIntendedUses = publicReferenceDataManagementServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return publicReferenceDataManagementServicePricingandTerms
  **/

  public String getPublicReferenceDataManagementServicePricingandTerms() {
    return publicReferenceDataManagementServicePricingandTerms;
  }

  public void setPublicReferenceDataManagementServicePricingandTerms(String publicReferenceDataManagementServicePricingandTerms) {
    this.publicReferenceDataManagementServicePricingandTerms = publicReferenceDataManagementServicePricingandTerms;
  }


}

