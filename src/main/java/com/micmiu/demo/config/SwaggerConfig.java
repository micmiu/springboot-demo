package com.micmiu.demo.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 3/1/2018
 * Time: 11:45
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket testApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
//				.groupName("test")
//				.genericModelSubstitutes(DeferredResult.class)
//				.useDefaultResponseMessages(false)
//				.forCodeGeneration(true)
//				.pathMapping("/")
				.select()
				//.apis(RequestHandlerSelectors.basePackage("com.micmiu.demo"))
				.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("演示SprintBoot+Swagger 实现RESTful API接口文档")
				.description("更多信息请访问 http://micmiu.com")
				.contact(new Contact("Michael", "http://micmiu.com", "sjsky007@gamil.com"))
				.version("1.0")
				.termsOfServiceUrl("http://micmiu.com")
				.build();
	}
}
