package com.blogs.mydlogsdemo.dao;

import com.blogs.mydlogsdemo.domain.BackLoginID;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BackLoginDaoImput {


    BackLoginID examineID(BackLoginID back);
}
