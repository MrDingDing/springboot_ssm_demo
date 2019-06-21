package com.my.config;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * 实现视图解析器
 */
public class MvcConfig {

    public View resolveViewName(String viewName, Locale locale) throws Exception {
        return null;
    }
}
