package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.RequestScoped;

@javax.faces.bean.ManagedBean
@RequestScoped
public class SchoolsList {
    
    private ArrayList schools;

    public ArrayList getSchools() {
        
        
        schools = new ArrayList();
        
        schools.add("Canadian International School");
        schools.add("Indus International School");
        schools.add("Legacy School Bangalore");
        schools.add("Ryan International School");
        schools.add("Inventure Academy");
        schools.add("Oakridge High School");
        schools.add("New Baldwin International School");
        schools.add("Vibgyor International School");
        schools.add("Royal International School");
        schools.add("Global International School");
        schools.add("Mallya Aditi International School");
        schools.add("Greenwood high international school");
        schools.add("Jain International Residential School");
        schools.add("Canadian International School");
        schools.add("Mallya Aditi International School");
        schools.add("Greenwood high international school");
        schools.add("Indus International School");
        schools.add("Legacy School Bangalore");
        schools.add("Ryan International School");
        schools.add("Jain International Residential School");
        schools.add("Inventure Academy");
        schools.add("Oakridge High School");
        schools.add("New Baldwin International School");
        schools.add("Vibgyor International School");
        schools.add("Royal International School");
        schools.add("Global International School"); 
        
        return schools;
    }
    
    
    
    
}
