package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {


    public Employer(){
        super();
    }
    public Employer(String value) {
        super(value);
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters

}
