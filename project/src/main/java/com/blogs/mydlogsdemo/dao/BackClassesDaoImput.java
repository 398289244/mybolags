package com.blogs.mydlogsdemo.dao;

import com.blogs.mydlogsdemo.domain.Classes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BackClassesDaoImput {
    List<Classes> getClassesAll();
}
