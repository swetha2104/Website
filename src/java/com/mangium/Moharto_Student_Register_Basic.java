/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author GigaByte
 */
@javax.faces.bean.ManagedBean(name = "regbeanstore")
@RequestScoped
public class Moharto_Student_Register_Basic {

    @ManagedProperty(value = "#{register4enroll}")
    private Moharto_Student_Register_Basic_Bean register;

    public Moharto_Student_Register_Basic_Bean getRegister() {
        return register;
    }

    public void setRegister(Moharto_Student_Register_Basic_Bean register) {
        this.register = register;
    }

    public void store() {
        

        System.out.println("-----------------store() CALLED------Farhan---------------");

        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(r);

        RegDAO dao = (RegDAO) factory.getBean("regDAO");

        dao.saveEmployee(register);

    }
    public void valid(){
        
        
        
    }
    
    public String navigate(){
        return "moharto_student_register_personal"; 
    }

    public ArrayList getDb() {

        ArrayList list = null;

        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(r);
        RegDAO dao = (RegDAO) factory.getBean("regDAO");

        list = dao.getData();
        System.out.println("-----------------storedata ()---------------------");
        System.out.println(list);
        System.out.println("--------------------------------------");
        return list;
    }

//          System.out.println("FARHAN MANGIUM");
//          Configuration cfg=new Configuration();
//            cfg.configure();
//            
//            SessionFactory sf=cfg.buildSessionFactory();
//           Session ses = sf.openSession();
////          System.out.println(register.getCity());
//           org.hibernate.Transaction tx=ses.beginTransaction();
//            ses.save(register);
//            tx.commit();
//            
//            ses.close();
//        
//    }
}
