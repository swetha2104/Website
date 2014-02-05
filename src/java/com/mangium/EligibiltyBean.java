/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium;

import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

@javax.faces.bean.ManagedBean
@RequestScoped
public class EligibiltyBean {
    
    private ArrayList eb;

    public ArrayList getEb() {
        
        eb =  new ArrayList();
        
        CreateCourse sb1 = new CreateCourse();
        sb1.setCategory("SC/OBC");
        sb1.setPercent("50%");
        sb1.setFee("30000");
        sb1.setEliexamname("JEE");
        sb1.setElirank("5600");
        sb1.setSeatsavail("50");
        eb.add(sb1);
        
        CreateCourse sb2 = new CreateCourse();
        sb2.setCategory("BC");
        sb2.setPercent("55%");
        sb2.setFee("30000");
        sb2.setEliexamname("JEE");
        sb2.setElirank("5600");
        sb2.setSeatsavail("49");
        eb.add(sb2);
        
        CreateCourse sb3 = new CreateCourse();
        sb3.setCategory("SC/ST");
        sb3.setPercent("50%");
        sb3.setFee("30000");
        sb3.setEliexamname("JEE");
        sb3.setElirank("5600");
        sb3.setSeatsavail("55");
        eb.add(sb3);
        
        CreateCourse sb4 = new CreateCourse();
        sb4.setCategory("Sports");
        sb4.setPercent("55%");
        sb4.setFee("30000");
        sb4.setEliexamname("JEE");
        sb4.setElirank("5600");
        sb4.setSeatsavail("60");
        eb.add(sb4);
        
        CreateCourse sb5 = new CreateCourse();
        sb5.setCategory("NRI");
        sb5.setPercent("65%");
        sb5.setFee("100000");
        sb5.setEliexamname("JEE");
        sb5.setElirank("5600");
        sb5.setSeatsavail("75");
        eb.add(sb5);
        
        return eb;
    }
    
    
    
    
}
