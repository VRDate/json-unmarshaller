package com.elasticpath.rest.clientsdk

import javax.inject.Inject

import org.junit.Test
import org.junit.runner.RunWith

import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.support.AnnotationConfigContextLoader

import com.elasticpath.rest.clientsdk.config.SdkConfiguration

@RunWith(SpringJUnit4ClassRunner)
@ContextConfiguration(classes = SdkConfiguration, loader = AnnotationConfigContextLoader)
class WiringTest {

	@Inject
	CortexClient cortexClient

	@Test
	void 'Wiring test'() {
		// simply passing shows the wiring works
	}
}