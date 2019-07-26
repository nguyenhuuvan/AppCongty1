package com.lv.appcongty1.model;

public class Welcome {
    private String title,description,creatAcount,logIn;

    public Welcome(String title, String description, String creatAcount, String logIn) {
        this.title = title;
        this.description = description;
        this.creatAcount = creatAcount;
        this.logIn = logIn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatAcount() {
        return creatAcount;
    }

    public void setCreatAcount(String creatAcount) {
        this.creatAcount = creatAcount;
    }

    public String getLogIn() {
        return logIn;
    }

    public void setLogIn(String logIn) {
        this.logIn = logIn;
    }
}
