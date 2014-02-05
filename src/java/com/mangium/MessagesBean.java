/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mangium;

/**
 *
 * @author Acer
 */

public class MessagesBean {
     private String name;
    private String type;
    private String description;
private String time;
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
