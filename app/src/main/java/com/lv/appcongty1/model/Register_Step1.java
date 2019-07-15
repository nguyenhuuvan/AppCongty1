package com.lv.appcongty1.model;

public class Register_Step1 {
    String step,title,descreption,continue_;

    public Register_Step1(String step, String title, String descreption, String continue_) {
        this.step = step;
        this.title = title;
        this.descreption = descreption;
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

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public String getContinue_() {
        return continue_;
    }

    public void setContinue_(String continue_) {
        this.continue_ = continue_;
    }
}
