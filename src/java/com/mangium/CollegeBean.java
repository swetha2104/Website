package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CollegeBean {
    
    private ArrayList college;

    public ArrayList getCollege() {
        
        college =  new ArrayList();
        
        college c1 =  new college();
        c1.setCollegename("R.V. College of Engineering");
        c1.setCollegecity("Bangalore");
        c1.setCollegelogo("rvce.JPG");
        c1.setAffiliated("Affiliated to VTU University");
        c1.setRating("5");
        c1.setAdmissions("45");
        c1.setSubdate("10-05-2013");
        college.add(c1);
        
        college c2 =  new college();
        c2.setCollegename("Basaveshwar Engineering College");
        c2.setCollegecity("Bangalore");
        c2.setCollegelogo("bce.png");
        c2.setAffiliated("Affiliated to VTU University");
        c2.setRating("4");
        c2.setAdmissions("37");
        c2.setSubdate("29-01-2013");
        college.add(c2);
        
        college c3 =  new college();
        c3.setCollegename("B.M.S. College of Engineering");
        c3.setCollegecity("Bangalore");
        c3.setCollegelogo("bmsce.png");
        c3.setAffiliated("Affiliated to VTU University");
        c3.setRating("4");
        c3.setAdmissions("42");
        c3.setSubdate("25-03-2013");
        college.add(c3);
        
        college c4 =  new college();
        c4.setCollegename("Coorg Institute of Technology");
        c4.setCollegecity("Bangalore");
        c4.setCollegelogo("CIT.jpg");
        c4.setAffiliated("Affiliated to VTU University");
        c4.setRating("3");
        c4.setAdmissions("27");
        c4.setSubdate("12-07-2013");
        college.add(c4);
        
        college c5 =  new college();
        c5.setCollegename("CMR Institute of Technology");
        c5.setCollegecity("Bangalore");
        c5.setCollegelogo("cmr.jpg");
        c5.setAffiliated("Affiliated to VTU University");
        c5.setRating("4");
        c5.setAdmissions("35");
        c5.setSubdate("22-06-2013");
        college.add(c5);
        
        college c6 =  new college();
        c6.setCollegename("Acharya Institute of Technology");
        c6.setCollegecity("Bangalore");
        c6.setCollegelogo("acharya.jpg");
        c6.setAffiliated("Affiliated to VTU University");
        c6.setRating("5");
        c6.setAdmissions("45");
        c6.setSubdate("10-05-2013");
        college.add(c6);
        
        college c7 =  new college();
        c7.setCollegename("Adarsh College of Engineering");
        c7.setCollegecity("Bangalore");
        c7.setCollegelogo("adarsh.jpg");
        c7.setAffiliated("Affiliated to VTU University");
        c7.setRating("5");
        c7.setAdmissions("45");
        c7.setSubdate("10-05-2013");
        college.add(c7);
        
        college c8 =  new college();
        c8.setCollegename("PESIT");
        c8.setCollegecity("Bangalore");
        c8.setCollegelogo("Pesit.gif");
        c8.setAffiliated("Affiliated to VTU University");
        c8.setRating("5");
        c8.setAdmissions("45");
        c8.setSubdate("10-05-2013");
        college.add(c8);
        
        college c9 =  new college();
        c9.setCollegename("City Engineering College");
        c9.setCollegecity("Bangalore");
        c9.setCollegelogo("cec.jpg");
        c9.setAffiliated("Affiliated to VTU University");
        c9.setRating("5");
        c9.setAdmissions("45");
        c9.setSubdate("10-05-2013");
        college.add(c9);
        
        college c10 =  new college();
        c10.setCollegename("Christ University");
        c10.setCollegecity("Bangalore");
        c10.setCollegelogo("christ.jpg");
        c10.setAffiliated("Affiliated to VTU University");
        c10.setRating("5");
        c10.setAdmissions("45");
        c10.setSubdate("10-05-2013");
        college.add(c10);
        
        
        return college;
    }

    
}
