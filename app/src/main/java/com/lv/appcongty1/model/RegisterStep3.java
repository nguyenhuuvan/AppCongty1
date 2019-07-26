package com.lv.appcongty1.model;

public class RegisterStep3 {
    private String step, title,description, skip,continue_;

    public RegisterStep3(String step, String title, String description, String skip, String continue_) {
        this.step = step;
        this.title = title;
        this.description = description;
        this.skip = skip;
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

    public String getSkip() {
        return skip;
    }

    public void setSkip(String skip) {
        this.skip = skip;
    }

    public String getContinue_() {
        return continue_;
    }

    public void setContinue_(String continue_) {
        this.continue_ = continue_;
    }
}
