package com.lv.appcongty1.model;

public class RegisterStep4 {
   private String step,title,description,titleUseCard,descriptionUseCard,titleWithoutCard,descriptionWithoutCard,continue_;

    public RegisterStep4(String step, String title, String description, String titleUseCard, String descriptionUseCard, String titleWithoutCard, String descriptionWithoutCard, String continue_) {
        this.step = step;
        this.title = title;
        this.description = description;
        this.titleUseCard = titleUseCard;
        this.descriptionUseCard = descriptionUseCard;
        this.titleWithoutCard = titleWithoutCard;
        this.descriptionWithoutCard = descriptionWithoutCard;
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

    public String getTitleUseCard() {
        return titleUseCard;
    }

    public void setTitleUseCard(String titleUseCard) {
        this.titleUseCard = titleUseCard;
    }

    public String getDescriptionUseCard() {
        return descriptionUseCard;
    }

    public void setDescriptionUseCard(String descriptionUseCard) {
        this.descriptionUseCard = descriptionUseCard;
    }

    public String getTitleWithoutCard() {
        return titleWithoutCard;
    }

    public void setTitleWithoutCard(String titleWithoutCard) {
        this.titleWithoutCard = titleWithoutCard;
    }

    public String getDescriptionWithoutCard() {
        return descriptionWithoutCard;
    }

    public void setDescriptionWithoutCard(String descriptionWithoutCard) {
        this.descriptionWithoutCard = descriptionWithoutCard;
    }

    public String getContinue_() {
        return continue_;
    }

    public void setContinue_(String continue_) {
        this.continue_ = continue_;
    }
}
