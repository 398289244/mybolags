package com.blogs.mydlogsdemo.service;

import com.blogs.mydlogsdemo.dao.BackLoginDaoImput;
import com.blogs.mydlogsdemo.domain.BackLoginID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BackLoginService implements BackLoginServicePort {
   @Resource
    BackLoginDaoImput backimpt;

    @Override
    public BackLoginID examine(BackLoginID back) {
        BackLoginID backUser= backimpt.examineID(back);
       return backUser;

    }
}
