package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;


public class JobTest {
    //Create your unit tests here

    //Test empty constructor creates unique ID
    @Test
    public void testSettingJobId(){
        Job test_job_one = new Job();
        Job test_job_two = new Job();
        Assert.assertNotEquals(test_job_one.getId(), test_job_two.getId());
    }

    //Test that the full constructor contains five fields
    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertTrue(!Objects.equals(testJob.getName(), ""));
        Assert.assertTrue(!Objects.equals(testJob.getEmployer().toString(), ""));
        Assert.assertTrue(!Objects.equals(testJob.getLocation().toString(),""));
        Assert.assertTrue(!Objects.equals(testJob.getPositionType().toString(),""));
        Assert.assertTrue(!Objects.equals(testJob.getCoreCompetency().toString(),""));
        Assert.assertEquals(testJob.getName(), "Product tester");
        Assert.assertEquals(testJob.getEmployer().toString(), "ACME");
        Assert.assertEquals(testJob.getLocation().toString(), "Desert");
        Assert.assertEquals(testJob.getPositionType().toString(), "Quality control");
        Assert.assertEquals(testJob.getCoreCompetency().toString(), "Persistence");
    }
    //Test equals method
    @Test
    public void testJobsForEquality(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job otherTestJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertFalse(testJob.equals(otherTestJob));
    }

    //TODO: test toString starts and ends with new line
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        String expectedSeperator = System.lineSeparator();
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job emptyTestJob = new Job();

        String testJobOutput = testJob.toString();
        String emptyTestJobOutput = emptyTestJob.toString();

        Assert.assertTrue(testJobOutput.startsWith(expectedSeperator));
        Assert.assertTrue(testJobOutput.endsWith(expectedSeperator));

        Assert.assertTrue(emptyTestJobOutput.startsWith(expectedSeperator));
        Assert.assertTrue(emptyTestJobOutput.endsWith(expectedSeperator));
    }

    //TODO: test toString for the labels and data, checking for empty fields
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job newTestJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));


        Assert.assertTrue(newTestJob.toString().contains("ID: " + newTestJob.getId()));
        Assert.assertTrue(newTestJob.toString().contains("Name: Product tester"));
        Assert.assertTrue(newTestJob.toString().contains("Employer: ACME"));
        Assert.assertTrue(newTestJob.toString().contains("Location: Desert"));
        Assert.assertTrue(newTestJob.toString().contains("Position Type: Quality control"));
        Assert.assertTrue(newTestJob.toString().contains("Core Competency: Persistence"));

    }




}
