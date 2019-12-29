package com.blogs.mydlogsdemo.domain;

public class AddBlogs {
    String title;//标题
    String content;//内容
    String keywords;//关键字
    String describe;//描述
    int category;//栏目id
    String  tags;//标签
    String titlepic;//图片路径
    int visibility;//是否密

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTitlepic() {
        return titlepic;
    }

    public void setTitlepic(String titlepic) {
        this.titlepic = titlepic;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        return "AddBlogs{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", keywords='" + keywords + '\'' +
                ", describe='" + describe + '\'' +
                ", category=" + category +
                ", tags='" + tags + '\'' +
                ", titlepic='" + titlepic + '\'' +
                ", visibility=" + visibility +
                '}';
    }
}
