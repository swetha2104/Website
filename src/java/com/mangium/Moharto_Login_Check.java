/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium;

import java.util.ArrayList;
import java.util.Iterator;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


@javax.faces.bean.ManagedBean
@RequestScoped
public class Moharto_Login_Check {
    @ManagedProperty(value = "#{moharto_Student_Register_Basic_Bean}")
    
    private Moharto_Student_Register_Basic_Bean  user;

//    private String stu_email;
//    private String stu_password;
    public Moharto_Student_Register_Basic_Bean getUser() {
        return user;
    }

    public void setUser(Moharto_Student_Register_Basic_Bean user) {
        this.user = user;
    }
    

    
    public String valid(){
        System.out.println("-------------------Login Check ---------");
         String logincheck = "";
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Query q=session.createQuery("from com.mangium.Moharto_Login_Bean ");
        
        ArrayList list = (ArrayList) q.list();

        Iterator it = list.iterator();

        Moharto_Student_Register_Basic_Bean u = null;
        
        while (it.hasNext()) {

            u = (Moharto_Student_Register_Basic_Bean) it.next();

            if (u.equals(null)) {
                logincheck = "login";
                System.out.println("-------------------Login Failed---------");
                
                break;
            }

            if (user.getEmail().equals(u.getEmail())) {

                if (user.getPassword().equals(u.getPassword())) {

                    System.out.println("-------------------Login Successfull---------");
                    logincheck = "success";

                }
                else{
                logincheck = "login";
                System.out.println("-------------------Login Failed---------");
                }
            }

        }

        session.close();
        sf.close();
        return null;

   
    }
    
}
