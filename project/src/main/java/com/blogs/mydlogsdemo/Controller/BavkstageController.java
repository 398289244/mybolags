package com.blogs.mydlogsdemo.Controller;

import com.alibaba.fastjson.JSON;
import com.blogs.mydlogsdemo.domain.AddBlogs;
import com.blogs.mydlogsdemo.domain.Article;
import com.blogs.mydlogsdemo.service.BackAddArticleServiceImput;
import com.blogs.mydlogsdemo.service.BackClassesServiceImput;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

import java.util.List;

import java.util.UUID;

@RestController
public class BavkstageController {
    @Resource
    private BackAddArticleServiceImput articleServiceImput;
    @Resource
    private BackClassesServiceImput classesDispose;
    @Resource
    private BackAddArticleServiceImput addArticle;
    @RequestMapping("/articleConrent")
    public void addArticle(AddBlogs content){
        System.out.println(content.toString());
    }
//添加主图片
    @RequestMapping("/upHomeImg" )
    public String concon(MultipartFile imFile, HttpServletRequest re, HttpServletResponse rs)throws IOException{
        String path=re.getScheme()+"://"+re.getServerName()+":"+re.getServerPort()+"/"+"homeImg/";
        File filer=new File("F:\\homeImg");
        String id = UUID.randomUUID().toString().replace("-", "");
        String fileName=imFile.getOriginalFilename();
        String img=id+fileName.substring(fileName.lastIndexOf("."));
        FileOutputStream intup=new FileOutputStream(new File(filer,img));
        intup.write(imFile.getBytes());
        intup.close();
        return path+img;
    }
//获取全部栏目
    @RequestMapping("/getClassesAllData")
    public String getClassesData(){
            return classesDispose.getClassesAll();
    }


//保存文章
    @RequestMapping(value = "/insertData",method = RequestMethod.POST )
    public Object insertData(@RequestBody String crticle){
        if(crticle!=null||crticle!=""){
            int reu=addArticle.addArticle(crticle);
            return(reu) ;
        }else{
            return "2";
        }

    }
    //获取主页数据
    @RequestMapping("/gettingdata")
    public String getTingData(){
        return addArticle.getTingData();
    }
}
