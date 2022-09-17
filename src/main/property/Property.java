package main.property;

import main.user.RealestateAgent;
import main.user.RealestatePartner;

import java.sql.Blob;
import java.util.List;

public class Property {
    public String name;
    public String description;
    private String propertyID;
    private String location;
    private List<Blob> photos;
    private RealestateAgent agent;
    private RealestatePartner partner;
    public String getPropertyLocation(){
        return null;
    }

    public void setAgent(RealestateAgent agent){

    }

    public void setLocation(String newLocation){

    }

    public boolean addPhoto(Blob photoData){

        return false;
    }

    public boolean deltePhoto(int photoIndex){

        return false;
    }

    public List<Blob> getPhotoListCopy(){
        return null;
    }

    public boolean setPartner(RealestatePartner newPartner){
        return false;
    }

    public String getID(){
        return propertyID;
    }
}
