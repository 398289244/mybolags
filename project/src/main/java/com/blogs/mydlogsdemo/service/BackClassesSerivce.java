package com.blogs.mydlogsdemo.service;

import com.alibaba.fastjson.JSON;
import com.blogs.mydlogsdemo.dao.BackClassesDaoImput;
import com.blogs.mydlogsdemo.domain.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BackClassesSerivce implements BackClassesServiceImput {

    @Resource
    private BackClassesDaoImput classesdao;
    @Override
    public String getClassesAll() {
        return JSON.toJSONString(classesdao.getClassesAll());
    }
}
