package main.property;

import main.user.RealestateAgent;
import main.user.RealestatePartner;

public class Property {
    public String name;
    public String description;
    private String propertyID;
    private String location;
    private List<LongBlob> photos;
    private RealestateAgent agent;
    private RealestatePartner partner;
    public String getPropertyLocation(){
        return null;
    }

    public void setAgent(RealestateAgent agent){

    }

    public void setLocation(String newLocation){

    }

    public boolean addPhoto(LongBlob photoData){

        return false;
    }

    public boolean deltePhoto(int photoIndex){

        return false;
    }

    public List<LongBlob> getPhotoListCopy(){
        return null;
    }

    public boolean setPartner(RealestatePartner newPartner){
        return false;
    }

    public String getID(){
        return propertyID;
    }
}
