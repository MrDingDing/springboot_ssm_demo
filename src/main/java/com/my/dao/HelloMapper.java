package com.my.dao;

import com.my.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
public interface HelloMapper{
    public User getEmpById(Integer id);
}
