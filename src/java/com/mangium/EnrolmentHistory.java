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
public class EnrolmentHistory  implements Serializable{

    public List<EnrolmentHistoryBean> getLst() {
        return lst;
    }

    public void setLst(List<EnrolmentHistoryBean> lst) {
        this.lst = lst;
    }
    private List<EnrolmentHistoryBean> lst=new ArrayList<EnrolmentHistoryBean>();
    public EnrolmentHistory()
    {
        EnrolmentHistoryBean em=new EnrolmentHistoryBean("Anshul Sinha","MBA","Finance","with Hostel","21/07/2011","Paypal", "2000","Confirmed", "", "4:15 Pm");
       
        EnrolmentHistoryBean em1=new EnrolmentHistoryBean("Farhan Quadr","B.tech","Computer Science","without Hostel","05/08/2010","paypal", "2000","Rejected", "", "09:51 Am");
       
        EnrolmentHistoryBean em2=new EnrolmentHistoryBean("Ananth Mahale","B.E","Electronic and Comunication","with Hostel","21/07/2011","Paypal", "2000","Confirmed", "", "11:35 Am");
       
      EnrolmentHistoryBean em3=new EnrolmentHistoryBean("Rahul Roy","M.Tech","Electronics and Comunication","without Hostel","21/07/2011","Paypal", "2000","Confirmed", "", "10:30 Am");
       
      EnrolmentHistoryBean em4=new EnrolmentHistoryBean("Arman Sahil","BCA","Software System","with Hostel","21/07/2011","Paypal", "2000","Rejected", "", "12:15 Pm");
       
      EnrolmentHistoryBean em5=new EnrolmentHistoryBean("Vinay Kumar","MBA","HR","without Hostel","21/07/2011","Paypal", "2000","Confirmed", "", "01:41 Pm");
       
      EnrolmentHistoryBean em6=new EnrolmentHistoryBean("Rajiv Ranjan","BBA","Marketing","with Hostel","21/07/2011","Paypal", "2000","Not Rejected", "", "3:59 Pm");
       
      EnrolmentHistoryBean em7=new EnrolmentHistoryBean("Vikram Bhasker","B.tech","Mechanical","without Hostel","21/07/2011","Paypal", "2000","Confirmed", "", "4:15 Pm");
       
      EnrolmentHistoryBean em8=new EnrolmentHistoryBean("Md Ameen","B.tech","Computer Science","with Hostel","21/07/2011","Paypal", "2000","Rejected", "", "6:56 Pm");
       
      EnrolmentHistoryBean em9=new EnrolmentHistoryBean("Rohit Shetti","B.tech","Electrical Engineering","without Hostel","21/07/2011","Paypal", "2000","Confirm", "", "10:10 Am");
       
      EnrolmentHistoryBean em10=new EnrolmentHistoryBean("Ram Deyal","B.tech","Computer Science","with Hostel","21/07/2011","Paypal", "2000","Rejected", "", "2:36 Pm");
       
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
