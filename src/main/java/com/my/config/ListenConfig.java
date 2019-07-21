package com.my.config;

import listener.MyServletContextListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * create by blackjack on 2019/6/21
 */
@Configuration
public class ListenConfig {

  @Bean
    ServletListenerRegistrationBean<MyServletContextListener> allMyListener(){
      return new ServletListenerRegistrationBean(new MyServletContextListener());
  }
}
