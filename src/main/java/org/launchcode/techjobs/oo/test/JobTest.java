package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.lang.reflect.Field;

import static java.lang.Math.abs;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    //Job jobOne=new Job();
    //Job jobTwo=new Job();
    Job jobFour=new Job("Scrum Master", new Employer("Federal Reserve"), new Location("Saint Louis"), new PositionType("Junior"), new CoreCompetency("Teamwork"));
    Job job5=new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

    @Before
    public void createJobObjects(){
        //Job jobOne=new Job();
        //Job jobTwo = new Job();
        //jobFour= new Job("Scrum Master", new Employer("Federal Reserve"), new Location("Saint Louis"), new PositionType("Junior"), new CoreCompetency("Teamwork"));
        //job5= new Job("Scrum Master", new Employer("Federal Reserve"), new Location("Saint Louis"), new PositionType("Junior"), new CoreCompetency("Teamwork"));
    }
@Test
    public void testSettingJobId(){
    Job empty1 = new Job();
    Job empty2 = new Job();
        //assertFalse(String.valueOf(false), empty1.equals(empty2));
        assertTrue(abs(empty1.getId()- empty2.getId())==1);
}



    @Test
    public void testJobConstructorSetsAllFields(){
    Job jobThree=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals(jobThree.getName().toString(),"Product tester");
    assertEquals(jobThree.getEmployer().toString(),"ACME");
    assertEquals(jobThree.getLocation().toString(),"Desert");
    assertEquals(jobThree.getPositionType().toString(),"Quality control");
    assertEquals(jobThree.getCoreCompetency().toString(),"Persistence");
    assertTrue(jobThree.getEmployer() instanceof Employer);
    assertTrue(jobThree.getLocation() instanceof Location);
    assertTrue(jobThree.getPositionType() instanceof PositionType);
    assertTrue(jobThree.getCoreCompetency() instanceof CoreCompetency);
    assertTrue(jobThree instanceof Job);
    assertTrue(jobThree.getLocation() instanceof JobField);
}
@Test
    public void testJobsForEquality() {
    Job jobSeven = new Job("Scrum Master", new Employer("Federal Reserve"), new Location("Saint Louis"), new PositionType("Junior"), new CoreCompetency("Teamwork"));
    Job jobEight = new Job("Scrum Master", new Employer("Federal Reserve"), new Location("Saint Louis"), new PositionType("Junior"), new CoreCompetency("Teamwork"));
    Job jobNine= new Job();
    jobNine = jobSeven;
    /*assertFalse(jobSeven.equals(jobEight));
    assertTrue(jobSeven.equals(jobNine));
    assertNotEquals(jobEight.getId(), jobSeven.getId());
    assertTrue(jobEight.equals(jobEight));*/
    assertFalse(jobEight==jobSeven);
    assertTrue(jobNine==jobSeven);
}
@Test
    public void testToStringStartsAndEndsWithNewLine(){
        assertEquals(jobFour.toString().charAt(0),'\n');
        assertEquals(jobFour.toString().charAt(jobFour.toString().length()-1),'\n');

}
@Test
    public void testToStringContainsCorrectLabelsAndData(){
        assertEquals("\nID: "+ jobFour.getId()+"\n" +
                "Name: "+jobFour.getName()+"\n" +
                "Employer: "+jobFour.getEmployer()+"\n" +
                "Location: "+jobFour.getLocation()+"\n" +
                "Position Type: "+jobFour.getPositionType()+"\n" +
                "Core Competency: "+jobFour.getCoreCompetency()+"\n", jobFour.toString());
}
@Test
    public void testToStringHandlesEmptyField(){
        //Job job6 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals("\nID: "+ job5.getId() +"\n" +
                "Name: "+"Data not available"+"\n" +
                "Employer: "+"Data not available"+"\n" +
                "Location: "+"Data not available"+"\n" +
                "Position Type: "+"Data not available"+"\n" +
                "Core Competency: "+"Data not available"+"\n",job5.toString());
}
/*@Test
    public void onlyContainsIdField(){
        Job job7 = new Job();
        assertEquals("OOPS! This job does not seem to exist.", job7.toString());
}*/
}
