package com.blogs.mydlogsdemo;


import com.blogs.mydlogsdemo.domain.Article;
import com.blogs.mydlogsdemo.service.BackAddArticleServiceImput;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@SpringBootApplication
@MapperScan("com.blogs.mydlogsdemo.dao")
@RestController
public class MydlogsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MydlogsdemoApplication.class, args);


    }

    @RequestMapping("/hello")
    public String mana(){
     return "hello,allalal";
    }


}
