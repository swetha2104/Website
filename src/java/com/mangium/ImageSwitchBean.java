
package com.mangium;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class ImageSwitchBean {

    private final List<String> images;
    private final List<String> image2;
    private final List<String> certificate;
    
    
  
    public ImageSwitchBean() {  
        images = new ArrayList<>();  
        image2 = new ArrayList<>(); 
        certificate  = new ArrayList<>(); 
         images.add("../resources/images/pages/doc.jpg"); 
         image2.add("../resources/images/pages/doc.jpg"); 
        certificate.add("../resources/images/pages/doc.jpg");  
    }  
  
    public List<String> getImages() {  
        return images;  
    } 
    public List<String> getImage2() {  
        return image2;  
    } 
    public List<String> getCertficate() {  
        return certificate;  
    } 
    
    
}
