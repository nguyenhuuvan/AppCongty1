package com.lv.appcongty1.model;

public class OverviewInvestment {
    private String investment_total_port,investment_total_rp,investment_day,
            investment_week,investment_month,investment_year,investment,investment_des,
            investment_my_portfolio,investment_portfolio_name,investment_portfolio_money,
            investment_portfolio_share,investment_portfolio_percent;

    public OverviewInvestment(String investment_total_port, String investment_total_rp, String investment_day, String investment_week, String investment_month, String investment_year, String investment, String investment_des, String investment_my_portfolio, String investment_portfolio_name, String investment_portfolio_money, String investment_portfolio_share, String investment_portfolio_percent) {
        this.investment_total_port = investment_total_port;
        this.investment_total_rp = investment_total_rp;
        this.investment_day = investment_day;
        this.investment_week = investment_week;
        this.investment_month = investment_month;
        this.investment_year = investment_year;
        this.investment = investment;
        this.investment_des = investment_des;
        this.investment_my_portfolio = investment_my_portfolio;
        this.investment_portfolio_name = investment_portfolio_name;
        this.investment_portfolio_money = investment_portfolio_money;
        this.investment_portfolio_share = investment_portfolio_share;
        this.investment_portfolio_percent = investment_portfolio_percent;
    }

    public String getInvestment_total_port() {
        return investment_total_port;
    }

    public void setInvestment_total_port(String investment_total_port) {
        this.investment_total_port = investment_total_port;
    }

    public String getInvestment_total_rp() {
        return investment_total_rp;
    }

    public void setInvestment_total_rp(String investment_total_rp) {
        this.investment_total_rp = investment_total_rp;
    }

    public String getInvestment_day() {
        return investment_day;
    }

    public void setInvestment_day(String investment_day) {
        this.investment_day = investment_day;
    }

    public String getInvestment_week() {
        return investment_week;
    }

    public void setInvestment_week(String investment_week) {
        this.investment_week = investment_week;
    }

    public String getInvestment_month() {
        return investment_month;
    }

    public void setInvestment_month(String investment_month) {
        this.investment_month = investment_month;
    }

    public String getInvestment_year() {
        return investment_year;
    }

    public void setInvestment_year(String investment_year) {
        this.investment_year = investment_year;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    public String getInvestment_des() {
        return investment_des;
    }

    public void setInvestment_des(String investment_des) {
        this.investment_des = investment_des;
    }

    public String getInvestment_my_portfolio() {
        return investment_my_portfolio;
    }

    public void setInvestment_my_portfolio(String investment_my_portfolio) {
        this.investment_my_portfolio = investment_my_portfolio;
    }

    public String getInvestment_portfolio_name() {
        return investment_portfolio_name;
    }

    public void setInvestment_portfolio_name(String investment_portfolio_name) {
        this.investment_portfolio_name = investment_portfolio_name;
    }

    public String getInvestment_portfolio_money() {
        return investment_portfolio_money;
    }

    public void setInvestment_portfolio_money(String investment_portfolio_money) {
        this.investment_portfolio_money = investment_portfolio_money;
    }

    public String getInvestment_portfolio_share() {
        return investment_portfolio_share;
    }

    public void setInvestment_portfolio_share(String investment_portfolio_share) {
        this.investment_portfolio_share = investment_portfolio_share;
    }

    public String getInvestment_portfolio_percent() {
        return investment_portfolio_percent;
    }

    public void setInvestment_portfolio_percent(String investment_portfolio_percent) {
        this.investment_portfolio_percent = investment_portfolio_percent;
    }
}
