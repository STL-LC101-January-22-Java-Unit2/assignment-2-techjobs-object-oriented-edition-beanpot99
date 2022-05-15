package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static java.lang.Math.abs;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    Job jobOne;
    Job jobTwo;
    Job jobFour;
    Job job5;
    @Before
    public void createJobObjects(){
        jobOne=new Job();
        jobTwo = new Job();
        jobFour= new Job("Scrum Master", new Employer("Federal Reserve"), new Location("Saint Louis"), new PositionType("Junior"), new CoreCompetency("Teamwork"));
        job5= new Job("Scrum Master", new Employer("Federal Reserve"), new Location("Saint Louis"), new PositionType("Junior"), new CoreCompetency("Teamwork"));
    }
@Test
    public void testSettingJobId(){
        assertFalse(String.valueOf(false), jobOne.equals(jobTwo));
        assertEquals(1,abs(jobOne.getId()- jobTwo.getId()));
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
    public void testJobsForEquality(){
        assertFalse(jobFour==job5);
}
@Test
    public void blankLineBeforeAndAfter(){assertEquals(jobFour.toString().charAt(0),'\n');assertEquals(jobFour.toString().charAt(jobFour.toString().length()-1),'\n');
}
@Test
    public void eachStringContainsLabelAndData(){
        assertEquals("\n" + "ID: " + jobFour.getId() + "\n" + "Name: " + jobFour.getName() + "\n" + "Employer: " + jobFour.getEmployer() + "\n" + "Location: " + jobFour.getLocation() + "\n" + "Position Type: " + jobFour.getPositionType() + "\n" + "Core Competency: " + jobFour.getCoreCompetency() + "\n", jobFour.toString());
}
@Test
    public void emptyFieldStringReturn(){
        Job job6 = new Job("Scrum Master", new Employer("Federal Reserve"), new Location(""), new PositionType("Junior"), new CoreCompetency("Teamwork"));
        assertTrue(job6.toString().contains("Data not available"));
}
/*@Test
    public void onlyContainsIdField(){
        Job job7 = new Job();
        assertEquals("OOPS! This job does not seem to exist.", job7.toString());
}*/
}
