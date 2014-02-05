package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.RequestScoped;

@javax.faces.bean.ManagedBean
@RequestScoped
public class SchoolBean {
    
     private ArrayList school;

    public ArrayList getSchool() {
        
        school =  new ArrayList();
        
        School s1 = new School();
        s1.setSchoolname("Canadian International School");
        s1.setSchoolcity("Bangalore");
        s1.setSchoollogo("cis.jpg");
        s1.setAffiliated("IGCSE & IB Board");
        s1.setRating("5");
        s1.setAdmissions("45");
       
        school.add(s1);
        
        School s2 = new School();
        s2.setSchoolname("Mallya Aditi International School");
        s2.setSchoolcity("Bangalore");
        s2.setSchoollogo("aditi.jpg");
        s2.setAffiliated("ICSE and ISC, IGCSE Board");
        s2.setRating("4");
        s2.setAdmissions("35");
       
        school.add(s2);
        
 
        
        
       School s4 = new School();
        s4.setSchoolname("Indus International School");
        s4.setSchoolcity("Bangalore");
        s4.setSchoollogo("Indus-Logo.jpg");
        s4.setAffiliated("IGCSE Board");
        s4.setRating("4");
        s4.setAdmissions("36");
        school.add(s4);
        

        
                School s9 = new School();
        s9.setSchoolname("Oakridge International School");
        s9.setSchoolcity("Bangalore");
        s9.setSchoollogo("oakridge.jpg");
        s9.setAffiliated("ICSE, CBSE Board");
        s9.setRating("5");
        s9.setAdmissions("45");
       
        school.add(s9);
        

        
        School s7 = new School();
        s7.setSchoolname("Ryan International School");
        s7.setSchoolcity("Bangalore");
        s7.setSchoollogo("ris.jpg");
        s7.setAffiliated("ICSE, IGCSE Board");
        s7.setRating("4");
        s7.setAdmissions("45");
       
        school.add(s7);
        
        School s8 = new School();
        s8.setSchoolname("Legacy School Bangalore");
        s8.setSchoolcity("Bangalore");
        s8.setSchoollogo("lsb.jpg");
        s8.setAffiliated("Montessori, International GCSE (UK) Board");
        s8.setRating("5");
        s8.setAdmissions("45");
       
        school.add(s8);
        
        School s6 = new School();     
        s6.setSchoolname("Inventure Academy");
        s6.setSchoolcity("Bangalore");
        s6.setSchoollogo("INVENTURE.png");
        s6.setAffiliated("IGCSE, CIE Board");
        s6.setRating("3");
        s6.setAdmissions("45");
        school.add(s6);
                
        School s10 = new School();
        s10.setSchoolname("Primus Public School");
        s10.setSchoolcity("Bangalore");
        s10.setSchoollogo("primus.jpg");
        s10.setAffiliated("CBSE Board");
        s10.setRating("5");
        s10.setAdmissions("45");
        
        school.add(s10);
        
                
        School s5 = new School();
        s5.setSchoolname("Jain International Residential School");
        s5.setSchoolcity("Bangalore");
        s5.setSchoollogo("jain.jpg");
        s5.setAffiliated("CBSE, IGCSE, IB Diploma Programme Board");
        s5.setRating("3");
        s5.setAdmissions("41");
       
        school.add(s5);
        
        School s3 = new School();
        s3.setSchoolname("Greenwood High International School");
        s3.setSchoolcity("Bangalore");
        s3.setSchoollogo("greenwood.png");
        s3.setAffiliated("IB , IGCSE , ICSE Board");
        s3.setRating("4");
        s3.setAdmissions("39");
       
        school.add(s3);
        
        School s11 = new School();
        s11.setSchoolname("Global Indian International School");
        s11.setSchoolcity("Bangalore");
        s11.setSchoollogo("giis.jpg");
        s11.setAffiliated("IB , IGCSE , ICSE Board");
        s11.setRating("4");
        s11.setAdmissions("39");
       
        school.add(s11);
        
        return school;
    
    
}
}