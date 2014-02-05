/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mangium;

import java.io.Serializable;  
  
import org.primefaces.model.map.DefaultMapModel;  
import org.primefaces.model.map.LatLng;  
import org.primefaces.model.map.MapModel;  
import org.primefaces.model.map.Marker;  
  
public class MapBean implements Serializable {  
  
    private MapModel simpleModel;  
  
    public MapBean() {  
        simpleModel = new DefaultMapModel();  
          
        //Shared coordinates  
        LatLng coord1 = new LatLng(36.879466, 30.667648);  
        LatLng coord2 = new LatLng(36.883707, 30.689216);  
        LatLng coord3 = new LatLng(36.879703, 30.706707);  
        LatLng coord4 = new LatLng(36.885233, 30.702323);  
          
        //Basic marker  
        simpleModel.addOverlay(new Marker(coord1, "Konyaalti"));  
        simpleModel.addOverlay(new Marker(coord2, "Ataturk Parki"));  
        simpleModel.addOverlay(new Marker(coord3, "Karaalioglu Parki"));  
        simpleModel.addOverlay(new Marker(coord4, "Kaleici"));  
    }  
  
    public MapModel getSimpleModel() {  
        return simpleModel;  
    }  
}  
                      