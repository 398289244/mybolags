package com.blogs.mydlogsdemo.dao;

import com.blogs.mydlogsdemo.domain.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BackAddArticleImput {
        int addArticle(Article article);
        List<Article>  getTingData();//主页获取数据
        List<Article>  getArtileData();//主页获取数据
        String getClasses(Article article);
}
