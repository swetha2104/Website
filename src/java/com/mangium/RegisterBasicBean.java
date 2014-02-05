/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.RequestScoped;

@javax.faces.bean.ManagedBean
@RequestScoped
public class RegisterBasicBean {
        public ArrayList tb;

    public ArrayList getAgents() {
        return tb;
    }

    public RegisterBasicBean(){
   super();
        tb = new ArrayList();
        registerbean a=new registerbean();
        a.setPlace("Finance");
        a.setCategory("For Residant of karnataka");
        a.setCost(45000);
        a.setEnrollfee(10000);
        tb.add(a);

         registerbean a1=new registerbean();
        a1.setPlace("Human Resoucre");
        a1.setCategory("For Residants of Tamil Nadu & AP");
        a1.setEnrollfee(8000);
        a1.setCost(51000);
      

        tb.add(a1);

         registerbean a2=new registerbean();
         a2.setCategory("For Residants of Other State");
        a2.setCost(29000);
        a2.setPlace("Logistic & Operation");
        a2.setEnrollfee(9000);
       
        tb.add(a2);
        
        registerbean a3=new registerbean();
         a3.setCategory("For Residants of Other State");
        a3.setCost(29000);
        a3.setPlace("Sales & Marketing");
        a3.setEnrollfee(10000);
       
        tb.add(a3);
        
        registerbean a4=new registerbean();
         a4.setCategory("For Residants of Other State");
        a4.setCost(29000);
        a4.setPlace("IT");
       a4.setEnrollfee(12000);
        tb.add(a4);
}
}
