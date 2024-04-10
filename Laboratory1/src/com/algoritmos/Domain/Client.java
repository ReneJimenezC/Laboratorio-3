
package com.algoritmos.Domain;

import java.util.Objects;

/**
 *
 * @author Rene 
 */
public class Client {
    
    private String Id;
    private String Name; 
    private String Phone; 
    private String Adrress;

    public Client() {
    }

    public Client(String Id, String Name, String Phone, String Adrress) {
        this.Id = Id;
        this.Name = Name;
        this.Phone = Phone;
        this.Adrress = Adrress;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAdrress() {
        return Adrress;
    }

    public void setAdrress(String Adrress) {
        this.Adrress = Adrress;
    }
    
 
    @Override
    public String toString() {
        
        
        
    String result= "CLIENT INFORMATION"
            +"\n-----------------"
            +"\nID: "+this.getId()
            +"\nName: "+this.getName()
            +"\nPhone: "+this.getPhone()
            +"\nAddress: "+this.getAdrress();
    
            
    return result;
    
}
}
        
     
   

  