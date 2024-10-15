package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;
    String emptyField = "Data not available";

    private String name = emptyField;
    private Employer employer = new Employer();
    private Location location = new Location();
    private PositionType positionType = new PositionType();
    private CoreCompetency coreCompetency = new CoreCompetency();


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        this.id = nextId;
        nextId++;

    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        if(!name.isEmpty()) {
            this.name = name;
        }else {
            this.name = emptyField;
        }
        if(!employer.getValue().isEmpty()) {
            this.employer = employer;
        }else {
            this.employer.setValue(emptyField);
        }
        if(!location.getValue().isEmpty()) {
            this.location = location;
        }else {
            this.location.setValue(emptyField);
        }
        if(!positionType.getValue().isEmpty()) {
            this.positionType = positionType;
        }else {
            this.positionType.setValue(emptyField);
        }
        if(!coreCompetency.getValue().isEmpty()) {
            this.coreCompetency= coreCompetency;
        }else {
            this.coreCompetency.setValue(emptyField);
        }

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString() {

        if(this.id > 0 && this.name.isEmpty() && this.employer.toString().isEmpty() && this.positionType.toString().isEmpty()
            && this.coreCompetency.toString().isEmpty() && this.location.toString().isEmpty()) {

            return System.lineSeparator() + "OOPS! This job does not seem to exist." + System.lineSeparator();
        }

        String tmpName = this.getName();
//        String tmpEmployer = (this.getEmployer() != null) ? this.getEmployer().toString() : "";

        String tmpEmployer = this.getEmployer().toString();
        String tmpLocation = this.getLocation().toString();
        String tmpPositionType = this.getPositionType().toString();
        String tmpCoreCompetency = this.getCoreCompetency().toString();


        if(tmpName.isEmpty()){
            tmpName = emptyField;

        }

        if(tmpEmployer == null || tmpEmployer.isEmpty()){
            tmpEmployer = emptyField;
        }

        if(tmpLocation == null || tmpLocation.isEmpty()){
            tmpLocation = emptyField;
        }

        if(tmpPositionType == null || tmpPositionType.isEmpty()){
            tmpPositionType = emptyField;
        }

        if(tmpCoreCompetency == null || tmpCoreCompetency.isEmpty()){
            tmpCoreCompetency = emptyField;
        }


        String output =  System.lineSeparator() +
                "ID: " + this.getId() + System.lineSeparator() +
                "Name: " + tmpName +System.lineSeparator() +
                "Employer: " + tmpEmployer + System.lineSeparator() +
                "Location: " + tmpLocation + System.lineSeparator() +
                "Position Type: " + tmpPositionType + System.lineSeparator() +
                "Core Competency: " + tmpCoreCompetency + System.lineSeparator();

        return output;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return this.employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
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

}
