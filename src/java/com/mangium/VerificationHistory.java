/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author GigaByte
 */
@ManagedBean
@RequestScoped
public class VerificationHistory  implements Serializable{

    public List<VerificationHistoryBean> getLst() {
        return lst;
    }

    public void setLst(List<VerificationHistoryBean> lst) {
        this.lst = lst;
    }
    private List<VerificationHistoryBean> lst=new ArrayList<VerificationHistoryBean>();
    public VerificationHistory()
    {
        VerificationHistoryBean em=new VerificationHistoryBean("Anshul Sinha","MBA","Finance","with Hostel","21/07/2011","Paypal", "2000","Verified", "", "4:15 Pm");
       
        VerificationHistoryBean em1=new VerificationHistoryBean("Farhan Quadr","B.tech","Computer Science","without Hostel","05/08/2010","paypal", "2000","Not Verified", "", "09:51 Am");
       
        VerificationHistoryBean em2=new VerificationHistoryBean("Ananth Mahale","B.E","Electronic and Comunication","with Hostel","21/07/2011","Paypal", "2000","Not verified", "", "11:35 Am");
       
      VerificationHistoryBean em3=new VerificationHistoryBean("Rahul Roy","M.Tech","Electronics and Comunication","without Hostel","21/07/2011","Paypal", "2000","Verified", "", "10:30 Am");
       
      VerificationHistoryBean em4=new VerificationHistoryBean("Arman Sahil","BCA","Software System","with Hostel","21/07/2011","Paypal", "2000","Not verified", "", "12:15 Pm");
       
      VerificationHistoryBean em5=new VerificationHistoryBean("Vinay Kumar","MBA","HR","without Hostel","21/07/2011","Paypal", "2000","Verified", "", "01:41 Pm");
       
      VerificationHistoryBean em6=new VerificationHistoryBean("Rajiv Ranjan","BBA","Marketing","with Hostel","21/07/2011","Paypal", "2000","Not verified", "", "3:59 Pm");
       
      VerificationHistoryBean em7=new VerificationHistoryBean("Vikram Bhasker","B.tech","Mechanical","without Hostel","21/07/2011","Paypal", "2000","Verified", "", "4:15 Pm");
       
      VerificationHistoryBean em8=new VerificationHistoryBean("Md Ameen","B.tech","Computer Science","with Hostel","21/07/2011","Paypal", "2000","Not Verified ", "", "6:56 Pm");
       
      VerificationHistoryBean em9=new VerificationHistoryBean("Rohit Shetti","B.tech","Electrical Engineering","without Hostel","21/07/2011","Paypal", "2000","Verified", "", "10:10 Am");
       
      VerificationHistoryBean em10=new VerificationHistoryBean("Ram Deyal","B.tech","Computer Science","with Hostel","21/07/2011","Paypal", "2000","Verified", "", "2:36 Pm");
       
        lst.add(em10);
        lst.add(em9);
        lst.add(em8);
        lst.add(em7);
        lst.add(em6);
        lst.add(em5);
        lst.add(em4);
        lst.add(em3);
        lst.add(em2);
        lst.add(em1);
        lst.add(em);
    }
}
