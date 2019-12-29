package com.blogs.mydlogsdemo.service;

import com.alibaba.fastjson.JSON;

import com.blogs.mydlogsdemo.dao.BackAddArticleImput;
import com.blogs.mydlogsdemo.domain.Article;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;


import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class BackAddArticleService implements  BackAddArticleServiceImput {
    @Resource
    private BackAddArticleImput addArticleImput;
    @Override
    @Transactional(rollbackFor = Exception.class)//开始事务
    public int addArticle(String crticle) {

        int resu = addArticleImput.addArticle(assemble(crticle));
        if (resu != 1) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return 0; //若是错误的话就会自动回滚事务
        } else {
            return resu;
        }


    }

    public List<Article> getArtileData(){
            List<Article> article=addArticleImput.getArtileData();
            for(Article arst:article){
                   arst.setClassesData(addArticleImput.getClasses(arst));
            }

            return  article;
    }
    //主页获取文章
    public String getTingData(){
        List<Article> article=addArticleImput.getTingData();
                String ss=JSON.toJSONString(article);
                 System.out.println(ss);
        return ss;
    }
    //封装文章数据
    private Article assemble(String crticle){
        Article article=new Article();
        Date data=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Map map= JSON.parseObject(crticle,Map.class);
        article.setHeadline((String) map.get("headline"));
        article.setContent((String)map.get("content"));
        article.setKeyword((String)map.get("keyword"));
        article.setDescribess((String)map.get("describe"));
        article.setClasses(Integer.parseInt((String) map.get("classes")));
        article.setLabel((String)map.get("label"));
        article.setHomeimg((String)map.get("homeimg"));
        article.setConditionss(Integer.parseInt((String)map.get("condition")));
        article.setCreationtime(format.format(data));
        article.setViews(0);
        System.out.println(article.toString());
        return article;
    }


}
