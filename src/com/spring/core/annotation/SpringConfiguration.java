package com.spring.core.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {//<beans>
	@Bean
	public Performer performer() {//<bean>
		return new InstrumentList();
	}
	@Bean
	public Instrument piano() {
		return new Piano();
	}
	@Bean
	public Instrument saxophone() {
		return new Saxophone();
	}

}
