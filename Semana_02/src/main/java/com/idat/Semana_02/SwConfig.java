package com.idat.Semana_02;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwConfig {
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().
				apis(RequestHandlerSelectors.basePackage("com.idat.Semana_02.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {

		return new ApiInfo("Titulo", "Description", "Version 1.0", "Terminos del Servicio", 
				new Contact("Nombre del Contacto", "URl.com", "uncorreo@gmail.com"), "Licencia", "Licencia URL",Collections.emptyList());
	}
	
}
