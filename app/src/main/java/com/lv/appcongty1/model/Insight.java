package com.lv.appcongty1.model;

public class Insight {
    private String status,status_description,cash_flow,loan,insurance,investment,name,content,askmore;

    public Insight(String status, String status_description, String cash_flow, String loan, String insurance, String investment, String name, String content, String askmore) {
        this.status = status;
        this.status_description = status_description;
        this.cash_flow = cash_flow;
        this.loan = loan;
        this.insurance = insurance;
        this.investment = investment;
        this.name = name;
        this.content = content;
        this.askmore = askmore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus_description() {
        return status_description;
    }

    public void setStatus_description(String status_description) {
        this.status_description = status_description;
    }

    public String getCash_flow() {
        return cash_flow;
    }

    public void setCash_flow(String cash_flow) {
        this.cash_flow = cash_flow;
    }

    public String getLoan() {
        return loan;
    }

    public void setLoan(String loan) {
        this.loan = loan;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAskmore() {
        return askmore;
    }

    public void setAskmore(String askmore) {
        this.askmore = askmore;
    }
}
