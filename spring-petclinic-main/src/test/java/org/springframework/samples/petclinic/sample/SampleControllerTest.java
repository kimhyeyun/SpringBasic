package org.springframework.samples.petclinic.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.internal.matchers.Same;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

//@RunWith(SpringRunner.class) 이제안됌
@ExtendWith(SpringExtension.class)
@SpringBootTest
class SampleControllerTest {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void testDI() {
		SampleController bean = applicationContext.getBean(SampleController.class);
		assertThat(bean).isNotNull();
	}

	// @Test
	// public void teestDoSomething(){
	// SampleRepository sampleRepository = new SampleRepository();
	// SampleController sampleController = new SampleController(sampleRepository);
	// sampleController.doSomething();
	// }

}
