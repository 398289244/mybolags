package com.blogs.mydlogsdemo.domain;

import org.springframework.context.annotation.Bean;


public class LoginDemo {
    int loginModalUserNmae=0;
    int loginModalUserPwd=0;

    public int getLoginModalUserNmae() {
        return loginModalUserNmae;
    }

    public int getLoginModalUserPwd() {
        return loginModalUserPwd;
    }

    public void setLoginModalUserNmae(int loginModalUserNmae) {
        this.loginModalUserNmae = loginModalUserNmae;
    }

    public void setLoginModalUserPwd(int loginModalUserPwd) {
        this.loginModalUserPwd = loginModalUserPwd;
    }

    @Override
    public String toString() {
        return "LoginDemo{" +
                "loginModalUserNmae=" + loginModalUserNmae +
                ", loginModalUserPwd=" + loginModalUserPwd +
                '}';
    }
}
