/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/

package com.mangium;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//import org.primefaces.examples.domain.Car; 
/**
 *
 * @author GigaByte
 */
@ManagedBean
@RequestScoped
public class ManageBean implements Serializable {

    public ArrayList tb;

    public ArrayList getAgents() {
        return tb;
    }

    public ManageBean() {
//        this();
        super();
        tb = new ArrayList();

        TableBean a = new TableBean();
        a.setPlace("For Residant of karnataka");
        a.setFees("475000");
        a.setSpecial("Finance");

        tb.add(a);

        TableBean a1 = new TableBean();
        a1.setPlace("For Residants of Tamil Nadu & AP");
        a1.setFees("500000");
        a1.setSpecial("Human Resoucre");

        tb.add(a1);

        TableBean a2 = new TableBean();
        a2.setPlace("For Residants of Other State");
        a2.setFees("525000");
         a2.setSpecial("Logistic & Operation");
        
        tb.add(a2);
        
        TableBean a3 = new TableBean();
        a3.setPlace("For Residants of Other State");
        a3.setFees("525000");
        
        tb.add(a3);
        
        TableBean a4 = new TableBean();
        a4.setPlace("For NRI Catagory");
        a4.setFees("550000");
        
        tb.add(a4);
        
        TableBean a5 = new TableBean();
        a5.setPlace("For National of SAARC/Africa");
        a5.setFees("9700 USD");
        
        tb.add(a5);
        
        TableBean a6 = new TableBean();
        a6.setPlace("For Other Nationals ");
        a6.setFees("10000 USD");
        
        tb.add(a6);

    }

}
