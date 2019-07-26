package com.lv.appcongty1.model;

public class Insurance {
    private String titleToolbar,life_insurance,getLife_insurance,buy_insurance,house,health,vehical,disability,my_insurance;

    public Insurance(String titleToolbar, String life_insurance, String getLife_insurance, String buy_insurance, String house, String health, String vehical, String disability, String my_insurance) {
        this.titleToolbar = titleToolbar;
        this.life_insurance = life_insurance;
        this.getLife_insurance = getLife_insurance;
        this.buy_insurance = buy_insurance;
        this.house = house;
        this.health = health;
        this.vehical = vehical;
        this.disability = disability;
        this.my_insurance = my_insurance;
    }

    public String getTitleToolbar() {
        return titleToolbar;
    }

    public void setTitleToolbar(String titleToolbar) {
        this.titleToolbar = titleToolbar;
    }

    public String getLife_insurance() {
        return life_insurance;
    }

    public void setLife_insurance(String life_insurance) {
        this.life_insurance = life_insurance;
    }

    public String getGetLife_insurance() {
        return getLife_insurance;
    }

    public void setGetLife_insurance(String getLife_insurance) {
        this.getLife_insurance = getLife_insurance;
    }

    public String getBuy_insurance() {
        return buy_insurance;
    }

    public void setBuy_insurance(String buy_insurance) {
        this.buy_insurance = buy_insurance;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getVehical() {
        return vehical;
    }

    public void setVehical(String vehical) {
        this.vehical = vehical;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public String getMy_insurance() {
        return my_insurance;
    }

    public void setMy_insurance(String my_insurance) {
        this.my_insurance = my_insurance;
    }
}
