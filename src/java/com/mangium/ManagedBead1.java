/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mangium;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author GigaByte
 */
@ManagedBean
@RequestScoped

public class ManagedBead1 implements Serializable {

    public ArrayList tb;

    public ArrayList getAgents() {
        return tb;
    }

    public ManagedBead1() {
        tb = new ArrayList();

        TableBean a = new TableBean();
        
        a.setSpecial("Finance");

        tb.add(a);

        TableBean a1 = new TableBean();
        
        a1.setSpecial("Human Resoucre");

        tb.add(a1);

        TableBean a2 = new TableBean();
        
         a2.setSpecial("Logistic & Operation");
        
        tb.add(a2);
        
        TableBean a3 = new TableBean();
        a3.setSpecial("IT");
        
        tb.add(a3);
        
        TableBean a4 = new TableBean();
        a4.setSpecial("Sales & Marketing");
        
        tb.add(a4);
        
        TableBean a5 = new TableBean();
        a5.setSpecial("Retail");
        
        tb.add(a5);
        
        

    }

}

