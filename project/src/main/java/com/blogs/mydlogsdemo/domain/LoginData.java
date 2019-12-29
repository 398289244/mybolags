package com.blogs.mydlogsdemo.domain;


import org.springframework.stereotype.Repository;

@Repository
public class LoginData {

    private int l_id=0;
    private String l_name;
    private int l_password=0;

    public int getL_id() {
        return l_id;
    }

    public void setL_id(int l_id) {
        this.l_id = l_id;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public int getL_password() {
        return l_password;
    }

    public void setL_password(int l_password) {
        this.l_password = l_password;
    }

    @Override
    public String toString() {
        return "loginData{" +
                "l_id=" + l_id +
                ", l_name='" + l_name + '\'' +
                ", l_password=" + l_password +
                '}';
    }
}
