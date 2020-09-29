/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PublicReferenceDataManagementApiService {

	SDPublicReferenceDataManagementActivateOutputModel activate(SDPublicReferenceDataManagementActivateInputModel request);
	
	CRGlobalStandardSpecificationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRGlobalStandardSpecificationCaptureInputModel request);
	
	SDPublicReferenceDataManagementConfigureOutputModel configure(String sdReferenceId, SDPublicReferenceDataManagementConfigureInputModel request);
	
	CRGlobalStandardSpecificationControlOutputModel control(String sdReferenceId, String crReferenceId, CRGlobalStandardSpecificationControlInputModel request);
	
	CRGlobalStandardSpecificationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRGlobalStandardSpecificationExchangeInputModel request);
	
	SDPublicReferenceDataManagementFeedbackOutputModel feedback(String sdReferenceId, SDPublicReferenceDataManagementFeedbackInputModel request);
	
	CRGlobalStandardSpecificationInitiateOutputModel initiate(String sdReferenceId, CRGlobalStandardSpecificationInitiateInputModel request);
	
	BQGlobalReferenceDataInitiateOutputModel initiateGlobalreferencedata(String sdReferenceId, String crReferenceId, BQGlobalReferenceDataInitiateInputModel request);
	
	CRGlobalStandardSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRGlobalStandardSpecificationRequestInputModel request);
	
	BQGlobalReferenceDataRetrieveOutputModel retrieveGlobalreferencedata(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRGlobalStandardSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDPublicReferenceDataManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRGlobalStandardSpecificationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRGlobalStandardSpecificationUpdateInputModel request);
	
}
