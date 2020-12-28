package br.com.itau.validator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import br.com.itau.validator.service.ValidatorService;
import br.com.itau.validator.service.impl.ValidatorServiceLogicImpl;

@Configuration
public class ValidatorConfig {
	
	@Bean
	@Primary
    public ValidatorService validatorService() {
    	return new ValidatorServiceLogicImpl();
    };
    	

}
