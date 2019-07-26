package com.lv.appcongty1.model;

public class Gift {
    private String titleToolbar,titleActivity,description,continue_;

    public Gift(String titleToolbar, String titleActivity, String description, String continue_) {
        this.titleToolbar = titleToolbar;
        this.titleActivity = titleActivity;
        this.description = description;
        this.continue_ = continue_;
    }

    public String getTitleToolbar() {
        return titleToolbar;
    }

    public void setTitleToolbar(String titleToolbar) {
        this.titleToolbar = titleToolbar;
    }

    public String getTitleActivity() {
        return titleActivity;
    }

    public void setTitleActivity(String titleActivity) {
        this.titleActivity = titleActivity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContinue_() {
        return continue_;
    }

    public void setContinue_(String continue_) {
        this.continue_ = continue_;
    }
}
