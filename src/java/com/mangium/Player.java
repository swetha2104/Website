/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mangium;

/**
 *
 * @author Acer
 */
 public class Player {
    private String name;
  private Integer number;
     public Player(String name, Integer number) {
       this.name=name;
       this.number=number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
  
    
     
}
