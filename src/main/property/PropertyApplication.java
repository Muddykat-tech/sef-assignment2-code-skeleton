package main.property;

import main.property.Property;
import main.user.RegisteredUser;

import java.util.*

public class PropertyApplication{
    public ApplicationType applicationType;
    public Boolean accepted;
    public RegisteredUser user;
    public Property property;
}

public boolean acceptApplication(){
    return false;
}
public boolean rejectApplication(){
    return false;
}
}
