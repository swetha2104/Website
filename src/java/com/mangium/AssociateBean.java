package com.mangium;

import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@RequestScoped
public class AssociateBean implements Serializable {

    private ArrayList associates;

    public ArrayList getAssociates() {

        associates = new ArrayList();

        Associates a1 = new Associates();

        a1.setName("Ashwin Kumar");
        a1.setEmail("ashwin123@gmail.com");
        a1.setPhone("9966551248");
        a1.setLocation("Bangalore");
        associates.add(a1);

        Associates a2 = new Associates();

        a2.setName("Karthik Daggieni");
        a2.setEmail("Karthik_dagg@yahoo.co.in");
        a2.setPhone("9884925818");
        a2.setLocation("Chennai");
        associates.add(a2);

        Associates a3 = new Associates();

        a3.setName("Srikanth Reddy");
        a3.setEmail("srikant.danhill@hotmail.com");
        a3.setPhone("9940858456");
        a3.setLocation("Halasur");
        associates.add(a3);

        Associates a4 = new Associates();

        a4.setName("Bobby");
        a4.setEmail("bobby.boss@gmail.com");
        a4.setPhone("9875236412");
        a4.setLocation("Hyderabad");
        associates.add(a4);

        Associates a5 = new Associates();

        a5.setName("Hari Krishna");
        a5.setEmail("hari.krishna@gmail.com");
        a5.setPhone("9873122456");
        a5.setLocation("Mangalore");
        associates.add(a5);

        Associates a6 = new Associates();

        a6.setName("Kishore Kumar");
        a6.setEmail("kishore_122@gmail.com");
        a6.setPhone("9741258963");
        a6.setLocation("Bellandur");
        associates.add(a6);

        Associates a7 = new Associates();

        a7.setName("Vinod Kumar");
        a7.setEmail("vinod_kumar@rediffmail.com");
        a7.setPhone("9645678123");
        a7.setLocation("Gulbarga");
        associates.add(a7);

        Associates a8 = new Associates();

        a8.setName("Harish Shankar ");
        a8.setEmail("Shankar.2012@gmail.com");
        a8.setPhone("9564125487");
        a8.setLocation("Hebbal");
        associates.add(a8);

        Associates a9 = new Associates();

        a9.setName("Jyothi");
        a9.setEmail("jyothi.jyo@gmail.com");
        a9.setPhone("9854612345");
        a9.setLocation("Tumkur");
        associates.add(a9);

        Associates a10 = new Associates();

        a10.setName("Yashwanth");
        a10.setEmail("Yashwanth4u@y6ahoo.com.com");
        a10.setPhone("9848022338");
        a10.setLocation("Banaswasdi");
        associates.add(a10);

        return associates;
    }

}
