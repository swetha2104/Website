/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mangium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author Acer
 */
@ManagedBean
@RequestScoped
public class enrollmentsearchbean {
List<enroll> alst;
private List<String> click;

    public List<String> getClick() {
        List<String> lst=new ArrayList<String>();
       lst.add("BCom");
            lst.add("BPHARMA");
                lst.add("BE/BTech");
                    lst.add("MBBS");
                        lst.add("BCA");
                            lst.add("MBA");
                            
                            return lst;
    }

    public void setClick(List<String> click) {
      
        this.click = click;
        
    }
    
    public List<enroll> getAlst() {
        return alst;
    }

    public void setAlst(List<enroll> alst) {
    
        this.alst = alst;
    }
    
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
     private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
//    public List<String> complete(String query)
//    {
//        List<String> lst=new ArrayList<String>();
//        for(int i=0;i<=9;i++)
//        {
//           lst.add(query+i);
//        }
//        return lst;
//    }
    public List<String> complete1(String query)
    {
        List<String> lst=new ArrayList<>();
         lst.add("BCom");
            lst.add("Nursing");
                lst.add("BE/BTech");
                    lst.add("MBBS");
                        lst.add("BCA");
                            lst.add("MBA");
        return lst;
    
    }
    
    public List<String> complete2(String query)
    {
        List<String> lst=new ArrayList<>();
        lst.add("Kolkata");
            lst.add("Delhi");
                lst.add("Chennai");
                    lst.add("Bangalore");
                        lst.add("Mysore");
                           lst.add("Belgaum");
        return lst;
       
    }
    public void submit() 
    {  Connection con;
        alst=new ArrayList<enroll>();
        System.out.println(city);
        System.out.println(course);
        String sql="select * from example.enrollment where place=? and courses=?  ";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
            PreparedStatement  pst =con.prepareStatement(sql);
            pst.setString(1,city);
            pst.setString(2,course);
            
            ResultSet rs=pst.executeQuery();
//          if(rs.next()==null){
//              
//          }
            
           while(rs.next())
           {    System.out.println("enterd into while");
                enroll e=new enroll();
                e.setCollegename(rs.getString("collegename"));
                e.setCourses(rs.getString("courses"));
                e.setPlace(rs.getString("place"));
            
                alst.add(e);
               
                System.out.println(e.getCollegename());
           }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(enrollmentsearchbean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(enrollmentsearchbean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
}
