package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {

    public Location() {
        super();
    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.
    public Location(String value){

       super(value);
    }
    // Custom toString, equals, and hashCode methods:

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    // Getters and Setters:


}
