package main.user;

import main.property.Property;

import java.util.List;

public class RealestatePartner {
  private String username;
  private String id;
  private List<Property> property;

  public Boolean registerProperty(Property newProperty){
      return false;
  }
  
  public Boolean deleteProperty(String propertyID){
    return false;
  }
  public Boolean updateProperty(String propertyId,Property updated){
    return false;
  }
  public Property getProperty(Property newProperty){
    return new Property();
   }

  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {

  }
  public String getId(){
    return id;
  }
  public void setId(String id) {

  }
  public List <Property> getProperty(){
    return property;
  }
  public void setProperty(List<Property> property){

  }
}
      
    
