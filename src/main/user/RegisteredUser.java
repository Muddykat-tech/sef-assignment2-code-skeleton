package main.user;

public class RegisteredUser extends GuestUser {
  private String username;
  private String email;
  
  pubic void logout(){
  }
  public void changeEmail(String oldEmail,String nweEmail){
  }
  public String getUsername(){
    return username;
  }
  public void setUsername(String usename) {
    this.username = username;
  }
  public String getEmail(){
    return email;
  }
  public void setEmail(string email) {
    this.email = email;
  }
}
