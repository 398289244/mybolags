package com.blogs.mydlogsdemo.service;

import com.blogs.mydlogsdemo.domain.Article;

import java.util.List;

public interface BackAddArticleServiceImput {

     int addArticle(String article);
    String getTingData();
    List<Article> getArtileData();
}
