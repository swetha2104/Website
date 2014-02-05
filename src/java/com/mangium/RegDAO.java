package com.mangium;

import java.util.ArrayList;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class RegDAO {

    HibernateTemplate template;

    public void setSessionFactory(SessionFactory factory) {
        template = new HibernateTemplate(factory);
    }

    public void saveEmployee(Moharto_Student_Register_Basic_Bean register) {

        template.save(register);
    }

    public ArrayList getData() {

        ArrayList list = null;

        list = (ArrayList) template.find("from com.mangium.Moharto_Student_Register_Basic_Bean");
        System.out.println("-----------------RegDAO---------------------");
        System.out.println(list);
        System.out.println("--------------------------------------");
        return list;
    }
    

   
}
