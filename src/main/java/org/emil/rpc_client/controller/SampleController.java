package org.emil.rpc_client.controller;

import org.emil.rpc_client.service.SampleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	
	@Autowired
	private SampleClient sampleClient;
	
	@GetMapping("/hello-word")
	public String helloWorld(){
		return sampleClient.run();
	}
}
