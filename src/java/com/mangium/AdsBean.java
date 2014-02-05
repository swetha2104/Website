

package com.mangium;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.RequestScoped;

@javax.faces.bean.ManagedBean
@RequestScoped
public class AdsBean {
       private List as;
    public AdsBean()
    {
           as = new ArrayList();
        Ads a1=new Ads();
      
           a1.setAdsize("230 * 418px");
            a1.setDate("04/06/2013 ");
              a1.setDuration("30 days");
              as.add(a1);
               Ads a2=new Ads();
        a2.setAdsize("230 * 178px");
           a2.setDate("24/06/2013");
               a2.setDuration("2 months");
                  as.add(a2);
               Ads a3=new Ads();
                a3.setAdsize("230 * 78px");
                a3.setDate("09/08/2013");
                     a3.setDuration("6 months");
             as.add(a3);
        
              
               Ads a4=new Ads();
     a4.setAdsize("468 * 84px");
              a4.setDate("16/09/2013");
                     a4.setDuration("1 year");   
                 as.add(a4);
              
    }

    public List getAs() {
        return as;
    }

    public void setAs(List as) {
        this.as = as;
    }
    
}
