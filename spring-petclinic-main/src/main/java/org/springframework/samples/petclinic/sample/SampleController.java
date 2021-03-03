package org.springframework.samples.petclinic.sample;

import org.springframework.stereotype.Controller;

//@Controller
//config 에서 등록을 했기에
public class SampleController {
	SampleRepository sampleRepository;

//	public SampleController(SampleRepository sampleRepository) {
//		this.sampleRepository = sampleRepository;
//	}

	public void doSomething(){
		sampleRepository.save();
	}
}
