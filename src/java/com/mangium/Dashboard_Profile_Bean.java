package com.mangium;

import javax.faces.bean.RequestScoped;

@javax.faces.bean.ManagedBean
@RequestScoped
public class Dashboard_Profile_Bean {

    String cname="Brindavan College of Engineering";
    String address="#16/7A Binny Crescent,Benson Town";
    String city="Bangalore";
    String cperson="Harshitha";
    String mno="9535896649";
   String phno="7829456";
   String email="brin@gmail.com";

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCperson() {
        return cperson;
    }

    public void setCperson(String cperson) {
        this.cperson = cperson;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public String getPhno() {
        return phno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

 



}
