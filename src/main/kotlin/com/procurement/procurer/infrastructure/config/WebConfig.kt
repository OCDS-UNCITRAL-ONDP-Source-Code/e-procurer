package com.procurement.procurer.infrastructure.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
@ComponentScan(basePackages = ["com.procurement.procurer.infrastructure.controller"])
class WebConfig
