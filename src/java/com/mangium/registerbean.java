/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium;

/**
 *
 * @author farhan
 */
public class registerbean {
    private String place;
    private String category;
    private Integer cost;
    private Integer enrollfee;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getEnrollfee() {
        return enrollfee;
    }

    public void setEnrollfee(Integer enrollfee) {
        this.enrollfee = enrollfee;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
