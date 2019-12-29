package com.blogs.mydlogsdemo.Controller;



import com.baidu.ueditor.ActionEnter;
import com.blogs.mydlogsdemo.domain.BackLoginID;
import com.blogs.mydlogsdemo.service.BackLoginServicePort;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@RestController
public class LoingController{

    @Autowired
    BackLoginServicePort backPort;

    //后台登陆判断

    @RequestMapping(value = "/backLogin")
    public Object examineId(@RequestParam("username") String username,
                            @RequestParam("userpwd") String userpwd,
                            HttpServletRequest reg){
        System.out.println(username+userpwd);
        HttpSession session=reg.getSession();
        BackLoginID backUser=new BackLoginID();
        backUser.setUserName(username);
        backUser.setUserPwd(userpwd);
        backUser =backPort.examine(backUser);
        if(backUser!= null){
            session.setAttribute("user",backUser);
            return true;
        }else{
            return false;
        }

    }
    @RequestMapping(value = "/config")
    public void config(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json");
        String rootPath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/ueditor/jsp";
        try {
            response.setCharacterEncoding("UTF-8");
            String exec = new ActionEnter(request, rootPath).exec();
            System.out.println(exec);
            PrintWriter writer = response.getWriter();
            writer.write(new ActionEnter(request, rootPath).exec());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
