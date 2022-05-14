package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField{

    /*private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }
*/
    public PositionType(String value) {
        super(value);
    }
    /*
    @Override
    public String toString(){
        return value;
    }
    @Override
    public boolean equals(Object p){
        if(this==p)return true;
        if(p==null)return false;
        if(!(p instanceof PositionType))return false;
        return getId() == ((PositionType) p).getId();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //  their id fields match.

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
*/
}
