package com.lv.appcongty1.model;

public class MyWallet {
    private String name,email,my_balance,rp,send,pay,top_up,request,shopping,payment,charity,send_gift,split_bills,cash_back,promo;

    public MyWallet(String name, String email, String my_balance, String rp, String send, String pay, String top_up, String request, String shopping, String payment, String charity, String send_gift, String split_bills, String cash_back, String promo) {
        this.name = name;
        this.email = email;
        this.my_balance = my_balance;
        this.rp = rp;
        this.send = send;
        this.pay = pay;
        this.top_up = top_up;
        this.request = request;
        this.shopping = shopping;
        this.payment = payment;
        this.charity = charity;
        this.send_gift = send_gift;
        this.split_bills = split_bills;
        this.cash_back = cash_back;
        this.promo = promo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMy_balance() {
        return my_balance;
    }

    public void setMy_balance(String my_balance) {
        this.my_balance = my_balance;
    }

    public String getRp() {
        return rp;
    }

    public void setRp(String rp) {
        this.rp = rp;
    }

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getTop_up() {
        return top_up;
    }

    public void setTop_up(String top_up) {
        this.top_up = top_up;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getShopping() {
        return shopping;
    }

    public void setShopping(String shopping) {
        this.shopping = shopping;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getCharity() {
        return charity;
    }

    public void setCharity(String charity) {
        this.charity = charity;
    }

    public String getSend_gift() {
        return send_gift;
    }

    public void setSend_gift(String send_gift) {
        this.send_gift = send_gift;
    }

    public String getSplit_bills() {
        return split_bills;
    }

    public void setSplit_bills(String split_bills) {
        this.split_bills = split_bills;
    }

    public String getCash_back() {
        return cash_back;
    }

    public void setCash_back(String cash_back) {
        this.cash_back = cash_back;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }
}
