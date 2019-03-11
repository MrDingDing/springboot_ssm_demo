package com.my.servlet;

import javafx.application.Application;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author blackjack
 * @date 2019/3/9/16:52
 */
@Component
public class MyApplicationContext implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    public ApplicationContext getApplicationContext(){
        return this.applicationContext;
    }
    String getName(){
        return applicationContext.getDisplayName();
    }



}
