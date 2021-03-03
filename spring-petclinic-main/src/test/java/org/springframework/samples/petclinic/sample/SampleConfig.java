package org.springframework.samples.petclinic.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {

	// 직접 bean 등록
	@Bean
	public SampleController sampleController() {
		return new SampleController();
	}

}
