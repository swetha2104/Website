/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mangium;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@RequestScoped
public class dashboard  {
private List lst;
public dashboard()
{  lst=new ArrayList();
dashbean d=new dashbean();
d.setName("Kiran");
d.setType("enquiry");
d.setTime("01/01/14");
d.setDescription("to get the information");
lst.add(d);



dashbean d2=new dashbean();
d2.setName("Albeer");
d2.setType("Complaint");
d2.setTime("01/01/14");
d2.setDescription("to get the information");
lst.add(d2);

dashbean d1=new dashbean();
d1.setName("Kumar");
d1.setType("Forum");
d1.setTime("01/01/14");
d1.setDescription("to get the information");
lst.add(d1);




//dashbean d3=new dashbean();
//d3.setName("Saroja");
//d3.setType("enquiry");
//d3.setTime("01/01/14");
//d3.setDescription("to get the information");
//lst.add(d3);
//
//dashbean d4=new dashbean();
//d4.setName("Krishna");
//d4.setType("enquiry");
//d4.setTime("01/01/14");
//d4.setDescription("to get the information");
//lst.add(d4);
 System.out.println("creating constructor");
    
}



    public List getLst() {
      
        return lst;
    }

    public void setLst(List lst) {
        this.lst = lst;
    }

  

    

  
    

 

}
