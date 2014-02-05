

package com.mangium;
import javax.faces.bean.RequestScoped;

@javax.faces.bean.ManagedBean
@RequestScoped

public class Student {
    
    private String name;
    private String course;
    private String rank;
    private String imagename;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }
    
   
   
    
        
      /* public Student()
       {
           
       }
       public Student(String name,String course,String rank,String imagename) {
                this.name = name;
                this.course = course;
                this.rank = rank;
                this.imagename=imagename;
                
        }*/

    
       
}

    

