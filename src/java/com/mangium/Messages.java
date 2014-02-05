/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mangium;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Acer
 */
@javax.faces.bean.ManagedBean
@RequestScoped
public class Messages {
    private List lst;
public Messages()
{  lst=new ArrayList();
MessagesBean d=new MessagesBean();
d.setName("Farhan");
d.setType("enquiry");
d.setTime("01/01/14");
d.setDescription("to get the information");
lst.add(d);
MessagesBean de=new MessagesBean();
de.setName("Vijay");
de.setType("enquiry");
de.setTime("01/01/14");
de.setDescription("to get the information");
lst.add(de);



MessagesBean dd2=new MessagesBean();
dd2.setName("Asif");
dd2.setType("enquiry");
dd2.setTime("01/01/14");
dd2.setDescription("to get the information");
lst.add(dd2);



MessagesBean dd1=new MessagesBean();
dd1.setName("Waseem");
dd1.setType("enquiry");
dd1.setTime("01/01/14");
dd1.setDescription("to get the information");
lst.add(dd1);




MessagesBean d2=new MessagesBean();
d2.setName("Sonali");
d2.setType("enquiry");
d2.setTime("01/01/14");
d2.setDescription("to get the information");
lst.add(d2);


MessagesBean dc5=new MessagesBean();
dc5.setName("Divya");
dc5.setType("complaint");
dc5.setTime("01/01/14");
dc5.setDescription("to get the information");
lst.add(dc5);
        
        MessagesBean dc=new MessagesBean();
dc.setName("Sania");
dc.setType("complaint");
dc.setTime("01/01/14");
dc.setDescription("to get the information");
lst.add(dc);



MessagesBean dc2=new MessagesBean();
dc2.setName("Anderson");
dc2.setType("complaint");
dc2.setTime("01/01/14");
dc2.setDescription("to get the information");
lst.add(dc2);

MessagesBean dc1=new MessagesBean();
dc1.setName("Rajendra");
dc1.setType("complain");
dc1.setTime("01/01/14");
dc1.setDescription("to get the information");
lst.add(dc1);

MessagesBean dce=new MessagesBean();
dce.setName("Kalam");
dce.setType("complaint");
dce.setTime("01/01/14");
dce.setDescription("to get the information");
lst.add(dce);



MessagesBean d3=new MessagesBean();
d3.setName("Veeresh");
d3.setType("Forum");
d3.setTime("01/01/14");
d3.setDescription("to get the information");
lst.add(d3);

MessagesBean d4=new MessagesBean();
d4.setName("Anant");
d4.setType("Forum");
d4.setTime("01/01/14");
d4.setDescription("to get the information");
lst.add(d4);


MessagesBean dd4=new MessagesBean();
dd4.setName("Tahir");
dd4.setType("Forum");
dd4.setTime("01/01/14");
dd4.setDescription("to get the information");
lst.add(dd4);


MessagesBean d5=new MessagesBean();
d5.setName("Khalid");
d5.setType("Forum");
d5.setTime("01/01/14");
d5.setDescription("to get the information");
lst.add(d5);
MessagesBean d6=new MessagesBean();
d6.setName("Kondal");
d6.setType("Forum");
d6.setTime("01/01/14");
d6.setDescription("to get the information");
lst.add(d6);

 System.out.println("creating constructor");
    
}



    public List getLst() {
      
        return lst;
    }

    public void setLst(List lst) {
        this.lst = lst;
    }

   

}
