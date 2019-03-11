package com.my.servlet;

import javafx.application.Application;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;

/**
 * @author blackjack
 * @date 2019/3/9/16:52
 */
@Component
public class MyServletConetxt  {

   @Autowired
   private ServletContext servletContext;

    public ServletContext getServletContext() {
        return this.servletContext;
    }

}
