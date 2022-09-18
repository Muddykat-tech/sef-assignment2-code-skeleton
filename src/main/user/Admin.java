package main.user;

import java.util.*;

public class Admin extends RealestatePartner {
    public boolean deleteRealestatePartner (String partnerID, RealestatePartner newPartnerInfo){
        return false;
    }
    public boolean updateRealestatePartner(String partnerID, RealestatePartner newPartnerInfo){
        return false;
    }
    public boolean assignAgentToProperty(String agentID, String propertyID){
        return false;
    }
    public boolean createAgent(RealestateAgent agent){
        return false;
    }
    public boolean deleteAgent(String agentID){
        return false;
    }
}
