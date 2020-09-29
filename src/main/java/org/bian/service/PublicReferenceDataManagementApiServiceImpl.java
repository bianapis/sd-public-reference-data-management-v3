/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PublicReferenceDataManagementApiServiceImpl implements PublicReferenceDataManagementApiService {

	public SDPublicReferenceDataManagementActivateOutputModel activate(SDPublicReferenceDataManagementActivateInputModel request){
		return JsonReader.read("activate-SDPublicReferenceDataManagementActivateOutputModel.json",new TypeReference<SDPublicReferenceDataManagementActivateOutputModel>(){});
	}
	
	public CRGlobalStandardSpecificationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRGlobalStandardSpecificationCaptureInputModel request){
		return JsonReader.read("capture-CRGlobalStandardSpecificationCaptureOutputModel.json",new TypeReference<CRGlobalStandardSpecificationCaptureOutputModel>(){});
	}
	
	public SDPublicReferenceDataManagementConfigureOutputModel configure(String sdReferenceId, SDPublicReferenceDataManagementConfigureInputModel request){
		return JsonReader.read("configure-SDPublicReferenceDataManagementConfigureOutputModel.json",new TypeReference<SDPublicReferenceDataManagementConfigureOutputModel>(){});
	}
	
	public CRGlobalStandardSpecificationControlOutputModel control(String sdReferenceId, String crReferenceId, CRGlobalStandardSpecificationControlInputModel request){
		return JsonReader.read("control-CRGlobalStandardSpecificationControlOutputModel.json",new TypeReference<CRGlobalStandardSpecificationControlOutputModel>(){});
	}
	
	public CRGlobalStandardSpecificationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRGlobalStandardSpecificationExchangeInputModel request){
		return JsonReader.read("exchange-CRGlobalStandardSpecificationExchangeOutputModel.json",new TypeReference<CRGlobalStandardSpecificationExchangeOutputModel>(){});
	}
	
	public SDPublicReferenceDataManagementFeedbackOutputModel feedback(String sdReferenceId, SDPublicReferenceDataManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDPublicReferenceDataManagementFeedbackOutputModel.json",new TypeReference<SDPublicReferenceDataManagementFeedbackOutputModel>(){});
	}
	
	public CRGlobalStandardSpecificationInitiateOutputModel initiate(String sdReferenceId, CRGlobalStandardSpecificationInitiateInputModel request){
		return JsonReader.read("initiate-CRGlobalStandardSpecificationInitiateOutputModel.json",new TypeReference<CRGlobalStandardSpecificationInitiateOutputModel>(){});
	}
	
	public BQGlobalReferenceDataInitiateOutputModel initiateGlobalreferencedata(String sdReferenceId, String crReferenceId, BQGlobalReferenceDataInitiateInputModel request){
		return JsonReader.read("initiate-BQGlobalReferenceDataInitiateOutputModel.json",new TypeReference<BQGlobalReferenceDataInitiateOutputModel>(){});
	}
	
	public CRGlobalStandardSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRGlobalStandardSpecificationRequestInputModel request){
		return JsonReader.read("request-CRGlobalStandardSpecificationRequestOutputModel.json",new TypeReference<CRGlobalStandardSpecificationRequestOutputModel>(){});
	}
	
	public BQGlobalReferenceDataRetrieveOutputModel retrieveGlobalreferencedata(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQGlobalReferenceDataRetrieveOutputModel.json",new TypeReference<BQGlobalReferenceDataRetrieveOutputModel>(){});
	}
	
	public CRGlobalStandardSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRGlobalStandardSpecificationRetrieveOutputModel.json",new TypeReference<CRGlobalStandardSpecificationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDPublicReferenceDataManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDPublicReferenceDataManagementRetrieveOutputModel.json",new TypeReference<SDPublicReferenceDataManagementRetrieveOutputModel>(){});
	}
	
	public CRGlobalStandardSpecificationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRGlobalStandardSpecificationUpdateInputModel request){
		return JsonReader.read("update-CRGlobalStandardSpecificationUpdateOutputModel.json",new TypeReference<CRGlobalStandardSpecificationUpdateOutputModel>(){});
	}
	
}
