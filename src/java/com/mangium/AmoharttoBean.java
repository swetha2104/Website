

package com.mangium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Acer
 */
@ManagedBean
@RequestScoped
public class AmoharttoBean {

    private String city1;
      private static Map <String,String> city2;
      private static Map <String,String> city2collegedata;
      private ArrayList colleges;

    public ArrayList getColleges() {
        colleges=new ArrayList();
   Amohartto a=new Amohartto();
   a.setCollege("Brindavan College");
   colleges.add(a);
    Amohartto b=new Amohartto();
       b.setCollege("R.V College");
       colleges.add(b);
        Amohartto c=new Amohartto();
         c.setCollege("P.E.S College");
         colleges.add(c);
          Amohartto d=new Amohartto();
         d.setCollege("Ramaiah College");
         colleges.add(d);
          Amohartto e=new Amohartto();
         e.setCollege("Ghousia College");
         colleges.add(e);
          Amohartto f=new Amohartto();
         f.setCollege("S.C.T College");
         colleges.add(f);
          Amohartto g=new Amohartto();
         g.setCollege("U.V.C College");
         colleges.add(g);
         Amohartto h=new Amohartto();
         h.setCollege("H.K.B.K College");
         colleges.add(h);
         Amohartto i=new Amohartto();
         i.setCollege("M.V.I.T College");
         colleges.add(i);
         Amohartto j=new Amohartto();
         j.setCollege("Don Bosco College");
         colleges.add(j);
         
        return colleges;
    }

    public static Map<String, String> getCity2() {
        return city2;
    }
    public AmoharttoBean() {
        
//        Map <String,String> Bangalorecolleges=new HashMap<String,String>();
//        Bangalorecolleges.put("Brindavan College","bc" );
//         Bangalorecolleges.put("R.V College", "rv");
//          Bangalorecolleges.put("P.E.S College", "pesc");
//           Bangalorecolleges.put("Ramaiah College","rc" );
    }

    public String getCity1() {
        return city1;
    }

    public void setCity1(String city1) {
        this.city1 = city1;
    }
    
   static 
 {
            
           city2= new HashMap<String,String>();
           city2.put("Bangalore","bng");
           city2.put("Chennai","ch");
           city2.put("Delhi", "dh");
           city2.put("Dharwad","dd");
           city2.put("Hubli", "hb");
           city2.put("Calcutta", "ck");
           
    }
   
    
}
