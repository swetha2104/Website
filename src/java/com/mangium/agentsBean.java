/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mangium;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Acer
 */
@ManagedBean
@RequestScoped
public class agentsBean {

    public ArrayList agents;

    public ArrayList getAgents1() {
        return agents;
    }

    public agentsBean() {
        agents = new ArrayList();
        agents a = new agents();
        a.setId("Finance");
        a.setName("Bangalore University");
        a.setCity("Banglore");
        a.setBoard("ICSE");
//         a.setName("Pqr Company");
//         a.setCity("DOHA");
//         a.setCountry("INDIA");
         a.setType("Full time");
//         a.setDos("20-08-2013");
//         a.setDoe("20-08-2013");
//         a.setNo_of_connection("450 connections");
//         a.setPackages("Package-3");
//         a.setSubscription_status("Active");
//         a.setAmount("500$");
//         a.setCountries("15");
        agents.add(a);

        agents a1 = new agents();
        a1.setId("Marketing");
        a1.setName("VT University");
        a1.setCity("Chennai");
        a1.setBoard("CBSE");
//         a1.setCity("DOHA");
//         a1.setCountry("QATAR");
        a1.setType("Modular MBA");
//         a1.setDos("20-08-2013");
//         a1.setDoe("20-08-2013");
//         a1.setNo_of_connection("450 connections");
//         a1.setPackages("Package-3");
//         a1.setSubscription_status("Active");
//         a1.setAmount("500$");
//         a1.setCountries("15");
        agents.add(a1);

        agents a2 = new agents();
        a2.setId("Human Resources");
        a2.setName("Mysore University");
        a2.setCity("Delhi");
        a2.setBoard("IGCSE");
//         a2.setName("Pqr Company");
//        a2.setCity("DOHA");
//         a2.setCountry("QATAR");
        a2.setType("Dual MBA");
//         a2.setDos("20-08-2013");
//         a2.setDoe("20-08-2013");
//         a2.setNo_of_connection("450 connections");
//         a2.setPackages("Package-3");
//         a2.setSubscription_status("Active");
//         a2.setAmount("500$");
//         a2.setCountries("15");
        agents.add(a2);
        agents a3 = new agents();
        a3.setId("Finance");
        a3.setName("VTU Bangalore");
        a3.setType("Part time");
        a3.setCity("Hyderabad");
        a3.setBoard("IB");
        agents.add(a3);
        agents a4 = new agents();
        a4.setId("Marketing");
        a4.setName("VTU Mysore");
        a4.setType("Dual MBA");
        a4.setCity("Kolkata");
        a4.setBoard("ISC");
        agents.add(a4);
        agents a5 = new agents();
        a5.setId("Human Resources");
        a5.setName("VTU Belgaum");
        a5.setType("Night college ");
        a5.setCity("Mysore");
        a5.setBoard("CIE");
        agents.add(a5);

    }
}
