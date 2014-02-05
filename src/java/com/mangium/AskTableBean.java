package com.mangium;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.RequestScoped;

@javax.faces.bean.ManagedBean
@RequestScoped
public class AskTableBean {

    private List ask;

    private Integer rating = 3;
        private Integer rating1 = 4;

  
   

    public AskTableBean() {
        ask = new ArrayList();
        AskTable a1 = new AskTable();
        a1.setSlno(1);
        a1.setName("mukesh");
           a1.setReview("need info about MBA admission");
        a1.setTime("12/13/2013");
        ask.add(a1);

        AskTable a2 = new AskTable();
        a2.setSlno(2);
        a2.setName("phani");
        a2.setReview("need info about Brindavan college");
        a2.setTime("01/13/2013");
        ask.add(a2);

        AskTable a3 = new AskTable();
        a3.setSlno(3);
        a3.setName("syed");
        a3.setReview("need info about placements");
        a3.setTime("24/12/2013");
        ask.add(a3);
        
          AskTable a4 = new AskTable();
        a4.setSlno(4);
        a4.setName("kondal");
        a4.setReview("need info about admission");
        a4.setTime("21/12/2013");
        ask.add(a4);
        
          AskTable a5 = new AskTable();
        a5.setSlno(5);
        a5.setName("ananth");
        a5.setReview("when college reopens");
        a5.setTime("12/10/2013");
        ask.add(a4);
        
          AskTable a6 = new AskTable();
        a6.setSlno(6);
        a6.setName("kondal");
        a6.setReview("need info about admission");
        a6.setTime("21/13/2013");
        ask.add(a6);
        
        
        

    }
  public Integer getRating() {
        return rating;
    }

    public Integer getRating1() {
        return rating1;
    }

    public void setRating1(Integer rating1) {
        this.rating1 = rating1;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public List getAsk() {
        return ask;
    }

    public void setAsk(List ask) {
        this.ask = ask;
    }

}
