package main.user;

public class RealestatePartner {
private String username;
private String id;
private List<Property> property;

public Boolean registerProperty（Property newProperty）{
    return false;
}
  
  
public Bollean deleteProperty(String propertyID){
  return false;
}
public Bollean updateProperty(String propertyId,Property updated){
  return false;
}
public Property getProperty(Property newProperty){
  return new Property();
 }
  
public String getUsername() {
  return username;
}
  public void setUsername(String username) {
    this.username = username;
  }
  public String getId(){
    return id;
  }
  public void setId(String id) {
    this.id=id;
  }
  public List <Property> getProperty(){
    return property;
  }
  public viod setProperty(Lis<Property> property){
    this.property = property;
  }
}
      
    
