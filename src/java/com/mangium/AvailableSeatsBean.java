package com.mangium;

import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

@javax.faces.bean.ManagedBean
@RequestScoped

public class AvailableSeatsBean {

    private ArrayList courses;

    public AvailableSeatsBean() {

        courses = new ArrayList();

        Course c1 = new Course();
        c1.setCoursename("MBA");

        ArrayList a1 = new ArrayList();

        SubCourse sb1 = new SubCourse();
        sb1.setStream("Finance");
        sb1.setSeats("25");
        a1.add(sb1);

        SubCourse sb2 = new SubCourse();
        sb2.setStream("HR");
        sb2.setSeats("19");
        a1.add(sb2);

        SubCourse sb3 = new SubCourse();
        sb3.setStream("Business Planning");
        sb3.setSeats("20");
        a1.add(sb3);

        c1.setSubcourse(a1);

        courses.add(c1);
        
        Course c3 = new Course();
        c3.setCoursename("M.Sc");

        ArrayList a3 = new ArrayList();

        SubCourse sb7 = new SubCourse();
        sb7.setStream("Computers");
        sb7.setSeats("35");
        a3.add(sb7);

        SubCourse sb8 = new SubCourse();
        sb8.setStream("Mathematics");
        sb8.setSeats("15");
        a3.add(sb8);

        SubCourse sb9 = new SubCourse();
        sb9.setStream("Physics");
        sb9.setSeats("12");
        a3.add(sb9);

        c3.setSubcourse(a3);

        courses.add(c3);
        
        Course c4 = new Course();
        c4.setCoursename("M.A");

        ArrayList a4 = new ArrayList();

        SubCourse sb10 = new SubCourse();
        sb10.setStream("Philosophy");
        sb10.setSeats("22");
        a4.add(sb10);

        SubCourse sb11 = new SubCourse();
        sb11.setStream("Economics");
        sb11.setSeats("26");
        a4.add(sb11);

        SubCourse sb12 = new SubCourse();
        sb12.setStream("Journalism");
        sb12.setSeats("30");
        a4.add(sb12);

        c4.setSubcourse(a4);
        
        courses.add(c4);
        
        
        Course c2 = new Course();
        c2.setCoursename("B.Tech");

        ArrayList a2 = new ArrayList();

        SubCourse sb4 = new SubCourse();
        sb4.setStream("ECE");
        sb4.setSeats("36");
        a2.add(sb4);

        SubCourse sb5 = new SubCourse();
        sb5.setStream("CSE");
        sb5.setSeats("29");
        a2.add(sb5);

        SubCourse sb6 = new SubCourse();
        sb6.setStream("Mechanical");
        sb6.setSeats("30");
        a2.add(sb6);

        c2.setSubcourse(a2);

        courses.add(c2);
        
        Course c5 = new Course();
        c5.setCoursename("B.A");

        ArrayList a5 = new ArrayList();

        SubCourse sb13 = new SubCourse();
        sb13.setStream("English");
        sb13.setSeats("24");
        a5.add(sb13);

        SubCourse sb14 = new SubCourse();
        sb14.setStream("Political Sciences");
        sb14.setSeats("30");
        a5.add(sb14);

        SubCourse sb15 = new SubCourse();
        sb15.setStream("History");
        sb15.setSeats("18");
        a5.add(sb15);

        c5.setSubcourse(a5);

        courses.add(c5);
        
        Course c6 = new Course();
        c6.setCoursename("B.Sc");

        ArrayList a6 = new ArrayList();

        SubCourse sb16 = new SubCourse();
        sb16.setStream("Biology");
        sb16.setSeats("26");
        a6.add(sb16);

        SubCourse sb17 = new SubCourse();
        sb17.setStream("Electronics");
        sb17.setSeats("28");
        a6.add(sb17);

        SubCourse sb18 = new SubCourse();
        sb18.setStream("Bio-Chemistry");
        sb18.setSeats("12");
        a6.add(sb18);

        c6.setSubcourse(a6);

        courses.add(c6);
    }

    public ArrayList getCourses() {
        return courses;
    }

    public void onEdit(RowEditEvent event) {
        
            FacesMessage msg = new FacesMessage("Data Edited");  
            FacesContext.getCurrentInstance().addMessage(null, msg);  
    }

    public void onCancel(RowEditEvent event) {
            FacesMessage msg = new FacesMessage("Data Editing cancelled");  
            FacesContext.getCurrentInstance().addMessage(null, msg);  
    }
}
