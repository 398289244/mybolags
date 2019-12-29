package com.blogs.mydlogsdemo.Controller;

import com.blogs.mydlogsdemo.domain.Article;
import com.blogs.mydlogsdemo.service.BackAddArticleServiceImput;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class GoToURLController {

    @Resource
    private BackAddArticleServiceImput articleServiceImput;
    @RequestMapping("/indexr")
    public String gotoIndex(){
        return "index";
    }

    //前往后台登陆页面
    @RequestMapping("/backlogin")
    public String toBackstageLogin(){
        return "backstagePage/login";
    }
//前往文章管理
//    @RequestMapping("/articleManagement")
//    public String goToBackstage(){
//        return "backstagePage/article";
//    }
    //前往添加文章页面
    @RequestMapping("/addarticle")
    public String goToAddarticle(HttpServletRequest rs){

        return "backstagePage/add-article";
    }
   //后台登陆判断是否有session
    @RequestMapping("/backindex")
    public String goToBackIndex(HttpServletRequest res){
        HttpSession session=res.getSession();
        Object user=session.getAttribute("user");
        if(user!=null){
            return "backstagePage/index";
        }else{
            return "backstagePage/login";
        }

    }
    //前往后台栏目
    @RequestMapping("/category")
    public String goToCategory(){
        return "backstagePage/category";
    }
//修改指定栏目
    @RequestMapping("/update-category")
    public String goToUpdateCategory(){
        return "backstagePage/update-category";
    }
//前往指定文章展示页面
    @RequestMapping("/article")
    public String toToArticle(){
        return "article";
    }

    //前往后台公告
    @RequestMapping("/noticeer")
    public String goToNoticeer(){
        return "backstagePage/notice";
    }
    //进入文章管理分页
    @RequestMapping("/articleManagement")
    public String goToNoticeer(Model modl, Integer pageNum, Integer pageSize){
        ModelAndView modelAndView=new ModelAndView();
        if(pageNum==null){
            pageNum=0;
        }if(pageSize==null){
            pageSize=10;
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Article> resu=articleServiceImput.getArtileData();

        PageInfo<Article> page=new PageInfo<Article>(resu);
        System.out.println("当前页查询记录：" + page.getList().size());
        System.out.println("当前页码：" + page.getPageNum());
        System.out.println("每页显示数量：" + page.getPageSize());
        System.out.println("总页：" + page.getPages());
        List<Article> ss=page.getList();
        modl.addAttribute("pageInfo",page);

        modl.addAttribute("name","6666666");


        System.out.println(page.getList());

        page.getList();
        return "backstagePage/article";
    }

}

