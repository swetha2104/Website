/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium;

import java.util.ArrayList;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Acer
 */
@ManagedBean
@RequestScoped
public class EducationArray {

     public ArrayList educations;
    public ArrayList getArray(){
        return educations;
    }
    public EducationArray() {
        educations = new ArrayList();
        Education e = new Education();
        e.setSpecliazation("B.Tech");
        e.setCourse("CSE");
        e.setInstitute("Brindavan Collegeg");
        e.setYear("2012");
        e.setAggregate("73%");
        e.setPer("75%");
        e.setFile1("Admit Card.jpg");
        educations.add(e);
         Education e1 = new Education();
        e1.setSpecliazation("12th");
        e1.setCourse("Science");
        e1.setInstitute("Al-Ameen College");
        e1.setYear("2008");
        e1.setAggregate("78%");
        e1.setPer("71%");
        e1.setFile1("Marks Card.jpg");
        educations.add(e1);
//         Education e2 = new Education();
//        e2.setSpecliazation("Human Resources");
//        e2.setCourse("MBA");
//        e2.setInstitute("Presidency College");
//        e2.setYear("2013");
//        e2.setAggregate("65%");
//        e2.setPer("72%");
//        e2.setFile1("Transfer Certificate.jpg");
//        educations.add(e2);
//         Education e3 = new Education();
//        e3.setSpecliazation("E and C");
//        e3.setCourse("B.E");
//        e3.setInstitute("PES College");
//        e3.setYear("2012");
//        e3.setAggregate("72%");
//        e3.setPer("70%");
//        e3.setFile1("Admit Card.jpg");
//        educations.add(e3);
        
    }
    
    
}
