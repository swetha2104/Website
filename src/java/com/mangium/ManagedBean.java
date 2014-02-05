
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
public class ManagedBean {
    
   
            
    private ArrayList students;
//    private Student selectedstudent;
    
//    public void setSelectedStudent(Student selectedstudent)
//    {
//        this.selectedstudent=selectedstudent;
//    }
    
    public ArrayList getStudents(){
        
        students = new ArrayList();  
        
        Student s1 = new Student();
        s1.setName("Arun Kumar");
        s1.setCourse("BCA");
        s1.setRank("2nd Rank");
        s1.setImagename("../resources/images/pages/arun");
        students.add(s1);
        
        Student s2 = new Student();
        s2.setName("Nisha Garg");
        s2.setCourse("MCA");
        s2.setRank("1st Rank");
        s2.setImagename("../resources/images/pages/nisha");
        students.add(s2);
        
        Student s3 = new Student();
        s3.setName("Bhuvaneshwari");
        s3.setCourse("Fashion Tech");
        s3.setRank("3rd Rank");
        s3.setImagename("../resources/images/pages/bhuvaneshwari");
        students.add(s3);
        
         Student s4 = new Student();
        s4.setName("Vikas Kumar");
        s4.setCourse("B.Tech(ECE)");
        s4.setRank("2nd Rank");
        s4.setImagename("../resources/images/pages/vikas");
        students.add(s4);
        
        Student s5 = new Student();
        s5.setName("Rakesh Kumar");
        s5.setCourse("B.Tech(ECE)");
        s5.setRank("2nd Rank");
        s5.setImagename("../resources/images/pages/rakesh");
        students.add(s5);
        
        
        return students;
    }
 }
