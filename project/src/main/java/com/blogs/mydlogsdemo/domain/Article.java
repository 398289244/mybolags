package com.blogs.mydlogsdemo.domain;



public class Article {
    private int aid;            //id
    private String headline;    //文章标题
    private String content;     //文章内容
    private String keyword;     //关键字
    private String describess;    //描述
    private int classes;        //栏目
    private String label;       //标签
    private String homeimg;     //主图
    private int conditionss;      //公开/隐私
    private String creationtime;  //创建时间
    private int views;          //观看人数
    private String classesData;//栏目内容

    @Override
    public String toString() {
        return "Article{" +
                "aid=" + aid +
                ", headline='" + headline + '\'' +
                ", content='" + content + '\'' +
                ", keyword='" + keyword + '\'' +
                ", describess='" + describess + '\'' +
                ", classes=" + classes +
                ", label='" + label + '\'' +
                ", homeimg='" + homeimg + '\'' +
                ", conditionss=" + conditionss +
                ", creationtime='" + creationtime + '\'' +
                ", views=" + views +
                ", classesData='" + classesData + '\'' +
                '}';
    }

    public String getClassesData() {
        return classesData;
    }

    public void setClassesData(String classesData) {
        this.classesData = classesData;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getDescribess() {
        return describess;
    }

    public void setDescribess(String describess) {
        this.describess = describess;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getHomeimg() {
        return homeimg;
    }

    public void setHomeimg(String homeimg) {
        this.homeimg = homeimg;
    }

    public int getConditionss() {
        return conditionss;
    }

    public void setConditionss(int conditionss) {
        this.conditionss = conditionss;
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
