package com.springwebfluxdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

/**
 * Created by rama4 on 12/5/2019.
 */
@EnableWebFlux
@Configuration
public class WebFluxConfig implements WebFluxConfigurer {
}
