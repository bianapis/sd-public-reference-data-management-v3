package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceAgreement
 */
public class SDPublicReferenceDataManagementConfigureInputModelPublicReferenceDataManagementServiceConfigurationRecordPublicReferenceDataManagementServiceAgreement   {
  private String publicReferenceDataManagementServiceAgreementReference = null;

  private String publicReferenceDataManagementServiceUserReference = null;

  private String publicReferenceDataManagementServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return publicReferenceDataManagementServiceAgreementReference
  **/

  public String getPublicReferenceDataManagementServiceAgreementReference() {
    return publicReferenceDataManagementServiceAgreementReference;
  }

  public void setPublicReferenceDataManagementServiceAgreementReference(String publicReferenceDataManagementServiceAgreementReference) {
    this.publicReferenceDataManagementServiceAgreementReference = publicReferenceDataManagementServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return publicReferenceDataManagementServiceUserReference
  **/

  public String getPublicReferenceDataManagementServiceUserReference() {
    return publicReferenceDataManagementServiceUserReference;
  }

  public void setPublicReferenceDataManagementServiceUserReference(String publicReferenceDataManagementServiceUserReference) {
    this.publicReferenceDataManagementServiceUserReference = publicReferenceDataManagementServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return publicReferenceDataManagementServiceAgreementTermsandConditions
  **/

  public String getPublicReferenceDataManagementServiceAgreementTermsandConditions() {
    return publicReferenceDataManagementServiceAgreementTermsandConditions;
  }

  public void setPublicReferenceDataManagementServiceAgreementTermsandConditions(String publicReferenceDataManagementServiceAgreementTermsandConditions) {
    this.publicReferenceDataManagementServiceAgreementTermsandConditions = publicReferenceDataManagementServiceAgreementTermsandConditions;
  }


}

