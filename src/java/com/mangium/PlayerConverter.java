/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mangium;


   import java.util.ArrayList;  
import java.util.List;  
import javax.faces.application.FacesMessage;  
  
import javax.faces.component.UIComponent;  
import javax.faces.context.FacesContext;  
import javax.faces.convert.Converter;  
import javax.faces.convert.ConverterException;  
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Acer
 */

 

  @FacesConverter(value = "playerConverter")
public class PlayerConverter implements Converter {  
  
    public static List<Player> playerDB;  
  
    static {  
        playerDB = new ArrayList<Player>();  
  
        playerDB.add(new Player("MBA", 10));  
        playerDB.add(new Player("MCA", 9));  
        playerDB.add(new Player("BE", 14));  
        playerDB.add(new Player("BTECH", 8));  
        playerDB.add(new Player("BBA", 7));  
        playerDB.add(new Player("BCA", 6));  
        playerDB.add(new Player("Nursing", 5));  
        playerDB.add(new Player("MBBS", 20));  
        playerDB.add(new Player("BDS", 22));  
        playerDB.add(new Player("BBM", 2));  
        playerDB.add(new Player("BCS", 3));  
        playerDB.add(new Player("BPharma", 15));  
        playerDB.add(new Player("BEd", 16));  
        playerDB.add(new Player("BHM", 21));  
        playerDB.add(new Player("BHMS", 1));  
        playerDB.add(new Player("BUMS", 30));  
             playerDB.add(new Player("BAMS", 30));  
             playerDB.add(new Player("BFIA", 30));  
                     playerDB.add(new Player("BCJ", 30));  
             playerDB.add(new Player("BSc", 30));  
             playerDB.add(new Player("BL", 30));  
             playerDB.add(new Player("BCom", 30));  

    }  
  
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String submittedValue) {  
        if (submittedValue.trim().equals("")) {  
            return null;  
        } else {  
            try {  
                int number = Integer.parseInt(submittedValue);  
  
                for (Player p : playerDB) {  
                    if (p.getNumber() == number) {  
                        return p;  
                    }  
                }  
  
            } catch(NumberFormatException exception) {  
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid player"));  
            }  
        }  
  
        return null;  
    }  
  
    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object value) {  
        if (value == null || value.equals("")) {  
            return "";  
        } else {  
            return String.valueOf(((Player) value).getNumber());  
        }  
    }

       
       
    }  

