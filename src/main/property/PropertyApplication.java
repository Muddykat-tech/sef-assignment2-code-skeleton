package main.property;

import main.helper.ApplicationType;
import main.property.Property;
import main.user.RegisteredUser;

import java.util.*;

public class PropertyApplication{
    private ApplicationType applicationType;
    private Boolean accepted;
    private RegisteredUser user;
    private Property property;

    public boolean acceptApplication(){
        return false;
    }
    public boolean rejectApplication(){
        return false;
    }
}
