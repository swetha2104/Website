/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium;

import javax.faces.bean.RequestScoped;

@javax.faces.bean.ManagedBean(name = "register4enroll1")
@RequestScoped
public class Moharto_Student_Register_Personal_Bean {

   private String edu_id;
   private Moharto_Student_Register_Basic_Bean moharto_Student_Register_Basic_Bean;
   private String date_of_birth;
   private String gender;
   private String pre_address;
   private String pre_country;
   private String pre_location;
   private Integer pre_pin;
   private String father_name;
   private String guardian;
   private String guardian_name;
   private String guardian_occupation;
   private String perm_address;
   private String perm_country;
   private String perm_location;
   private Integer perm_pin;

    public String getEdu_id() {
        return edu_id;
    }

    public void setEdu_id(String edu_id) {
        this.edu_id = edu_id;
    }

    public Moharto_Student_Register_Basic_Bean getMoharto_Student_Register_Basic_Bean() {
        return moharto_Student_Register_Basic_Bean;
    }

    public void setMoharto_Student_Register_Basic_Bean(Moharto_Student_Register_Basic_Bean moharto_Student_Register_Basic_Bean) {
        this.moharto_Student_Register_Basic_Bean = moharto_Student_Register_Basic_Bean;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPre_address() {
        return pre_address;
    }

    public void setPre_address(String pre_address) {
        this.pre_address = pre_address;
    }

    public String getPre_country() {
        return pre_country;
    }

    public void setPre_country(String pre_country) {
        this.pre_country = pre_country;
    }

    public String getPre_location() {
        return pre_location;
    }

    public void setPre_location(String pre_location) {
        this.pre_location = pre_location;
    }

    public Integer getPre_pin() {
        return pre_pin;
    }

    public void setPre_pin(Integer pre_pin) {
        this.pre_pin = pre_pin;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

    public String getGuardian_name() {
        return guardian_name;
    }

    public void setGuardian_name(String guardian_name) {
        this.guardian_name = guardian_name;
    }

    public String getGuardian_occupation() {
        return guardian_occupation;
    }

    public void setGuardian_occupation(String guardian_occupation) {
        this.guardian_occupation = guardian_occupation;
    }

    public String getPerm_address() {
        return perm_address;
    }

    public void setPerm_address(String perm_address) {
        this.perm_address = perm_address;
    }

    public String getPerm_country() {
        return perm_country;
    }

    public void setPerm_country(String perm_country) {
        this.perm_country = perm_country;
    }

    public String getPerm_location() {
        return perm_location;
    }

    public void setPerm_location(String perm_location) {
        this.perm_location = perm_location;
    }

    public Integer getPerm_pin() {
        return perm_pin;
    }

    public void setPerm_pin(Integer perm_pin) {
        this.perm_pin = perm_pin;
    }
   
    public Moharto_Student_Register_Personal_Bean() {
    }
    
}
