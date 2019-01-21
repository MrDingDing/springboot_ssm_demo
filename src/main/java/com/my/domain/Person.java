package com.my.domain;

import org.hibernate.validator.constraints.Email;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person")
@Validated
    public class Person {
        //lastName必须是邮箱格式
        @Email
        private String lastName;
        //@Value("#{11*2}")
        private Integer age;
        //@Value("true")
        private Boolean boss;

        private Date birth;
        private Map<String,Object> maps;
        private List<Object> lists;
}
