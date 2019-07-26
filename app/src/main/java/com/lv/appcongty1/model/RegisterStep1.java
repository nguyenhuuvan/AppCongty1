package com.lv.appcongty1.model;

public class RegisterStep1 {
    private String step,title,description,continue_;

    public RegisterStep1(String step, String title, String description, String continue_) {
        this.step = step;
        this.title = title;
        this.description = description;
        this.continue_ = continue_;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
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

    public String getContinue_() {
        return continue_;
    }

    public void setContinue_(String continue_) {
        this.continue_ = continue_;
    }
}
