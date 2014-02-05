package com.mangium;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import javax.faces.bean.RequestScoped;

@javax.faces.bean.ManagedBean
@RequestScoped

public class Course {

    private String coursename;
    private ArrayList subcourse;

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public ArrayList getSubcourse() {
        return subcourse;
    }

    public void setSubcourse(ArrayList subcourse) {
        this.subcourse = subcourse;
    }

    

}
