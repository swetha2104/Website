
package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.RequestScoped;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GigaByte
 */
@javax.faces.bean.ManagedBean
@RequestScoped
public class Partners {
    
   
            
    private ArrayList partners;
//    private Student selectedstudent;
    
//    public void setSelectedStudent(Student selectedstudent)
//    {
//        this.selectedstudent=selectedstudent;
//    }
    
    public ArrayList getStudents(){
        
        partners = new ArrayList();  
        
        Partner p1 = new Partner();
        p1.setImagename("../resources/images/partner/Gopalan college");
        partners.add(p1);
        
        Partner p2 = new Partner();
        p2.setImagename("../resources/images/partner/Pes");
        partners.add(p2);
        
        Partner p3 = new Partner();
        p3.setImagename("../resources/images/partner/acharya");
        partners.add(p3);
        
        Partner p4 = new Partner();
        p4.setImagename("../resources/images/partner/aiimspeenya");
        partners.add(p4);
        
        Partner p5 = new Partner();
        p5.setImagename("../resources/images/partner/alvas");
        partners.add(p5);
        
        Partner p6 = new Partner();
        p6.setImagename("../resources/images/partner/aradhya");
        partners.add(p6);
        
        Partner p7 = new Partner();
        p7.setImagename("../resources/images/partner/banglorecollege");
        partners.add(p7);
        
        Partner p8 = new Partner();
        p8.setImagename("../resources/images/partner/brindavancollege");
        partners.add(p8);
        
        Partner p9 = new Partner();
        p9.setImagename("../resources/images/partner/isb");
        partners.add(p9);
        
       
        return partners;
    }
 }
