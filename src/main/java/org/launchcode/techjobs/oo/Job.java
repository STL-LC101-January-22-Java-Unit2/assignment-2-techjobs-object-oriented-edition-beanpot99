package org.launchcode.techjobs.oo;

import java.util.ArrayList;
import java.util.Objects;

public class Job extends JobField{

    private String name;
    private Employer employer;

    private Location location;


    private PositionType positionType;


    private CoreCompetency coreCompetency;
    public Job(){
        super();
    }
    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetancy){
        super();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetancy;
    }
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
    @Override
    public String toString() {
        //String stringId = String.valueOf(this.getId());
        String stringName = this.getName();
        String stringEmployer = String.valueOf(this.getEmployer());
        String stringLocation = String.valueOf(this.getLocation());
        String stringPosition = String.valueOf(this.getPositionType());
        String stringCompetency = String.valueOf(this.getCoreCompetency());

        if (stringName == "") {
            stringName = "Data not available";
        }
        if (stringEmployer == "") {
            stringEmployer = "Data not available";
        }
        if (stringLocation == "") {
            stringLocation = "Data not available";
        }
        if (stringPosition == "") {
            stringPosition = "Data not available";
        }
        if (stringCompetency == "") {
            stringCompetency = "Data not available";
        }
            return "\n" + "ID: " + this.getId() + "\n" + "Name: " + stringName + "\n" + "Employer: " + stringEmployer + "\n" + "Location: " + stringLocation + "\n" + "Position Type: " + stringPosition + "\n" + "Core Competency: " + stringCompetency + "\n";


    }

}
