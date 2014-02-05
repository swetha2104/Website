package com.mangium;

import javax.faces.bean.RequestScoped;



@javax.faces.bean.ManagedBean(name = "register4enroll")
@RequestScoped
public class Moharto_Student_Register_Basic_Bean {
    private Integer Student_Id;
    private String first_Name;
    private String last_Name;
    private String email;
    private String password;

    private String confirm_Password;
    private String mobile_No;
    private String current_City;
    private String education_Prefence;
    private String college_of_Interest;
    private String place_of_Interest;
    private String join;
    private Integer status;
    private String photo;
    
     public String navigate(){
        return "moharto_student_register_personal"; 
    }

    public Integer getStudent_Id() {
        return Student_Id;
    }

    public void setStudent_Id(Integer Student_Id) {
        this.Student_Id = Student_Id;
    }

  




    
    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_Password() {
        return confirm_Password;
    }

    public void setConfirm_Password(String confirm_Password) {
        this.confirm_Password = confirm_Password;
    }

    public String getMobile_No() {
        return mobile_No;
    }

    public void setMobile_No(String mobile_No) {
        this.mobile_No = mobile_No;
    }

    public String getCurrent_City() {
        return current_City;
    }

    public void setCurrent_City(String current_City) {
        this.current_City = current_City;
    }

    public String getEducation_Prefence() {
        return education_Prefence;
    }

    public void setEducation_Prefence(String education_Prefence) {
        this.education_Prefence = education_Prefence;
    }

    public String getCollege_of_Interest() {
        return college_of_Interest;
    }

    public void setCollege_of_Interest(String college_of_Interest) {
        this.college_of_Interest = college_of_Interest;
    }

    public String getPlace_of_Interest() {
        return place_of_Interest;
    }

    public void setPlace_of_Interest(String place_of_Interest) {
        this.place_of_Interest = place_of_Interest;
    }

    public String getJoin() {
        return join;
    }

    public void setJoin(String join) {
        this.join = join;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    

}
