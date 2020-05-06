/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class PostGraduate {
    int ID;
    String name;
    int fee;
    String duration;
    
    
    public PostGraduate(int ID,String name,int fee,String duration){
        this.ID=ID;
        this.name=name;
        this.fee=fee;
        this.duration=duration;
    }
    
    public int getID()
    {
        return ID;
    }
    
    public String getname()
    {
        return name;
    }
    
     public int getfee()
    {
        return fee;
    }
     
     public String getduration()
    {
        return duration;
    }
     
     public void setID(int ID)
     {
         this.ID=ID;
     }
     
     public void name(String name)
     {
         this.name=name;
     }
     
     public void setfee(int fee)
     {
         this.fee=fee;
     }
     
      public void duration(String duration)
     {
         this.duration=duration;
     }
      
    @Override
      public String toString()
      {
          return ID+"\n"+name+"\n"+fee+"\n"+duration;
      }
       
}
