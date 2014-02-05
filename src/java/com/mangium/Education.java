

package com.mangium;

import javax.inject.Named;
import javax.enterprise.context.Dependent;


@Named(value = "education")
@Dependent
public class Education {
private String specliazation;
private String course;
private String institute;
private String year;
private String aggregate;
private String per;
private String file1;

    public String getSpecliazation() {
        return specliazation;
    }

    public void setSpecliazation(String specliazation) {
        this.specliazation = specliazation;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

   

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAggregate() {
        return aggregate;
    }

    public void setAggregate(String aggregate) {
        this.aggregate = aggregate;
    }

    public String getPer() {
        return per;
    }

    public void setPer(String per) {
        this.per = per;
    }

    public String getFile1() {
        return file1;
    }

    public void setFile1(String file1) {
        this.file1 = file1;
    }

    
    
    
}
