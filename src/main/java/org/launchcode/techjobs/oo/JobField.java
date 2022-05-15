package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }


    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object p){
        if(this==p)return true;
        if(p==null)return false;
        if(!(p instanceof JobField))return false;
        JobField testerJob = ((JobField) p);
        return getId() == testerJob.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
