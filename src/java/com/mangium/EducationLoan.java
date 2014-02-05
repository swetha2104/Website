package com.mangium;

import java.io.Serializable;

public class EducationLoan implements Serializable {

    private String sno;
    private String bankname;
    private String maxlimitindia;
    private String maxlimititabroad;
    private String rate;
    private String repayment;
    private String eligibility;
    private String security;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getMaxlimitindia() {
        return maxlimitindia;
    }

    public void setMaxlimitindia(String maxlimitindia) {
        this.maxlimitindia = maxlimitindia;
    }

    public String getMaxlimititabroad() {
        return maxlimititabroad;
    }

    public void setMaxlimititabroad(String maxlimititabroad) {
        this.maxlimititabroad = maxlimititabroad;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRepayment() {
        return repayment;
    }

    public void setRepayment(String repayment) {
        this.repayment = repayment;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    
}
