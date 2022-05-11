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
    Job job1;
    Job job2;
    Job job4;
    Job job5;
    @Before
    public void createJobObjects(){
        job1=new Job();
        job2 = new Job();
        job4= new Job("Scrum Master", new Employer("Federal Reserve"), new Location("Saint Louis"), new PositionType("Junior"), new CoreCompetency("Teamwork"));
        job5= new Job("Scrum Master", new Employer("Federal Reserve"), new Location("Saint Louis"), new PositionType("Junior"), new CoreCompetency("Teamwork"));
    }
@Test
    public void testSettingJobId(){
        assertFalse(String.valueOf(false), job1.equals(job2));
        assertEquals(1,abs(job1.getId()- job2.getId()));
}

@Test
    public void testJobConstructorSetsAllFields(){
    Job job3=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertTrue(job3.getEmployer() instanceof Employer && job3.getLocation() instanceof Location && job3.getPositionType() instanceof PositionType && job3.getCoreCompetency() instanceof CoreCompetency);
}
@Test
    public void testJobsForEquality(){
        assertFalse(String.valueOf(false),job4.equals(job5));
}
@Test
    public void testingToString(){
        String jobInfo = job4.toString();
        int firstLine = jobInfo.indexOf("\n");
        int lastLine = jobInfo.lastIndexOf("\n");
        assertEquals(0,firstLine);
        assertEquals(jobInfo.length()-1,lastLine);
}
}
