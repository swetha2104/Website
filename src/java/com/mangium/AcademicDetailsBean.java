package com.mangium;

import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@RequestScoped
public class AcademicDetailsBean {
    
    private ArrayList academics;

    public ArrayList getAcademics() {
        
        academics =  new ArrayList();
        
        AcademicDetails ad1 = new AcademicDetails();
        ad1.setSno("1");
        ad1.setCourse("10th CLASS");
        ad1.setSpec("");
        ad1.setYop("2006");
        ad1.setInstitute("St.Charles Public School");
        ad1.setAggregate("83.3%");
        ad1.setFyp("");
        academics.add(ad1);
        
        AcademicDetails ad2 = new AcademicDetails();
        ad2.setSno("2");
        ad2.setCourse("PUC");
        ad2.setSpec("MPC");
        ad2.setYop("2008");
        ad2.setInstitute("Harward Composite PU College");
        ad2.setAggregate("77%");
        ad2.setFyp("67%");
        academics.add(ad2);
        
        AcademicDetails ad3 = new AcademicDetails();
        ad3.setSno("3");
        ad3.setCourse("Diploma");
        ad3.setSpec("Electronics ");
        ad3.setYop("2011");
        ad3.setInstitute("M S Ramaiah Polytechnic");
        ad3.setAggregate("80%");
        ad3.setFyp("78%");
        academics.add(ad3);
        return academics;
    }
    
    
}
