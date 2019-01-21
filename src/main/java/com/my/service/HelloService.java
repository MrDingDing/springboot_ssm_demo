package com.my.service;


import com.my.dao.HelloMapper;
import com.my.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    //引入dao层的对象
    @Autowired
    HelloMapper helloMapper;
    public User selectById(Integer id) {
        System.out.printf(helloMapper.toString());
        return  helloMapper.getEmpById(id);
    }




}
