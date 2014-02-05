
package com.mangium;



import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


@SessionScoped
@javax.faces.bean.ManagedBean(name = "reg1")
public class Moharto_Student_Register_Personal implements Serializable {
      @ManagedProperty(value = "#{register4enroll1 }")
    private Moharto_Student_Register_Personal_Bean personal;

    public Moharto_Student_Register_Personal() {
        
    }

    public Moharto_Student_Register_Personal_Bean getPersonal() {
        return personal;
    }

    public void setPersonal(Moharto_Student_Register_Personal_Bean personal) {
        this.personal = personal;
    }
    public void store(){
        
         System.out.println("-----------------store() CALLED------Farhan---------------");

        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(r);

        RegDAO dao = (RegDAO) factory.getBean("regDAO");

//        dao.saveEmployee1(personal);

        
    }
      public void valid(){
        
        
        
    }
        public String navigate(){
        return "moharto_student_register_education"; 
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
}
