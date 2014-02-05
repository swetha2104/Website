/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mangium;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

@javax.faces.bean.ManagedBean
@RequestScoped
public class Cars {
    
    String name;
    
private List<SelectItem> cars;
    public Cars() { 
      SelectItemGroup g1 = new SelectItemGroup("After 10th");
    g1.setSelectItems(new SelectItem[] {new SelectItem("PUC", "PUC"), new SelectItem("ITI", "ITI"), new SelectItem("Diploma", "Diploma")});

    SelectItemGroup g2 = new SelectItemGroup("After 12th");
    g2.setSelectItems(new SelectItem[] {new SelectItem("B.Tech", "B.Tech"), new SelectItem("B.B.M", "B.B.M"), new SelectItem("B.C.A", "B.C.A"),
        new SelectItem("B.Sc", "B.Sc"),new SelectItem("B.Ed", "B.Ed")});
    
    SelectItemGroup g3=new SelectItemGroup("PG");
    g3.setSelectItems(new SelectItem[] {new SelectItem("MBA", "MBA"),new SelectItem("MCA", "MCA"),new SelectItem("M.Com", "M.Com"),new SelectItem("M.Ed", "M.Ed"),
    new SelectItem("M.Tech", "M.Tech")});

    cars = new ArrayList<SelectItem>();
    cars.add(g1);
    cars.add(g2);
      cars.add(g3);
    
    }

    public List<SelectItem> getCars() {
        return cars;
    }

    public void setCars(List<SelectItem> cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  
    
}
