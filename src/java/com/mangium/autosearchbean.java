/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mangium;


import java.lang.Iterable;

      
import java.util.ArrayList;  
import java.util.List;  
  
import javax.faces.application.FacesMessage;  
import javax.faces.context.FacesContext;  
  import java.lang.String;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.event.SelectEvent;  

  
    /**
     *
     */
@ManagedBean
@RequestScoped
    public class autosearchbean {  
  
    private Player selectedPlayer1;  
    private  List<Player> players;
  
   
    public autosearchbean() {  
        players =  PlayerConverter.playerDB;  
    }  
  
    public Player getSelectedPlayer1() {  
        return selectedPlayer1;  
    }  
  
    public void setSelectedPlayer1(Player selectedPlayer1) {  
        this.selectedPlayer1 = selectedPlayer1;  
    }  
  
    public List<Player> completePlayer(String query) {  
        List<Player> suggestions = new ArrayList<Player>();  
          
        for(Player p : players) {  
            if(p.getName().startsWith(query))  
                suggestions.add(p);  
        }  
          
        return suggestions;  
    }  
}  

