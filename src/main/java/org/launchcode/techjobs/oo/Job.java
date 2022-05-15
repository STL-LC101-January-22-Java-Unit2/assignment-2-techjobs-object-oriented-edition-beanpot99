package org.launchcode.techjobs.oo;

import java.util.ArrayList;
import java.util.Objects;

public class Job {
    private int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;

    private Location location;


    private PositionType positionType;


    private CoreCompetency coreCompetency;
    public Job(){
        this.id=nextId;
        nextId++;
    }
    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetancy){
        this();
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
    public int getId() {
        return id;
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
            return "\nID: %d\n" +
                    "Name: %s\n" +
                    "Employer: %s\n" +
                    "Location: %s\n" +
                    "Position Type: %s\n" +
                    "Core Competency: %s\n";


    }
    @Override
    public boolean equals(Object p){
        if(this==p)return true;
        if(p==null)return false;
        if(!(p instanceof JobField))return false;
        Job testerJob = ((Job) p);
        return getId() == testerJob.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
