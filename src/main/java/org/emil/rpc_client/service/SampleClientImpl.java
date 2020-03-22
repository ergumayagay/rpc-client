package org.emil.rpc_client.service;

import org.emil.rpc_server.service.SampleService;
import org.springframework.stereotype.Service;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;

@Service
public class SampleClientImpl implements SampleClient {

    @SofaReference(interfaceType = SampleService.class, binding =  @SofaReferenceBinding(bindingType = "bolt"))
    private SampleService sampleService;
	
	@Override
	public String run() {
		
		return sampleService.helloWorld();
	}

}
