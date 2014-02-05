/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author GigaByte
 */
//@Named(value = "enrolmentHistoryBean")
//@Dependent
public class EnrolmentHistoryBean implements Serializable{

    private String name;
    private String appliedcourse;
    private String appliedstream;
    private String hostel;
    private String txdate;
    private String txtime;
    private String source;
    private String txamnt;
    private String status;
    private String action;
    
    public EnrolmentHistoryBean(String name,String appliedcourse,String appliedstream,String hostel,String txdate,String source,String txamnt,String status,String action,String txtime)
    {
        this.appliedcourse=appliedcourse;
    this.name=name;
        this.hostel=hostel;
        this.txtime=txtime;
        this.txamnt=txamnt;
        this.txdate=txdate;
        this.action=action;
    this.status=status;
    this.source=source;
    this.appliedstream=appliedstream;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppliedcourse() {
        return appliedcourse;
    }

    public void setAppliedcourse(String appliedcourse) {
        this.appliedcourse = appliedcourse;
    }

    public String getAppliedstream() {
        return appliedstream;
    }

    public void setAppliedstream(String appliedstream) {
        this.appliedstream = appliedstream;
    }

    public String getHostel() {
        return hostel;
    }

    public void setHostel(String hostel) {
        this.hostel = hostel;
    }

    public String getTxdate() {
        return txdate;
    }

    public void setTxdate(String txdate) {
        this.txdate = txdate;
    }

    public String getTxtime() {
        return txtime;
    }

    public void setTxtime(String txtime) {
        this.txtime = txtime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTxamnt() {
        return txamnt;
    }

    public void setTxamnt(String txamnt) {
        this.txamnt = txamnt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
}
