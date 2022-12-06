import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StudentTest {
    Student s;
    // returns the student's id
    @Test
    public void testGetId(){
        s = new Student("Miles", 0);
        assertEquals(0, s.getId());
    }

    // returns the student's name
    @Test
    public void testGetName(){
        s = new Student("Miles", 0);
        assertEquals("Miles", s.getName());
    }

    // adds the given grade to the grades list
    // public void addGrade(int grade){...}
    @Test
    public void testAddGrade(){
        s = new Student("Miles", 0);
        s.addGrade(10);
        int actual = s.getGrades().get(0);
        assertEquals( 10, actual);
    }

    // returns the list of grades
    // public ArrayList<Integer> getGrades(){...}
    @Test
    public void testGetGrades(){
        s = new Student("Miles", 0);
        assertNotNull(s.getGrades());
    }

    // returns the average of the students grades
    // public double getGradeAverage(){...}
    @Test
    public void testGetGradeAverage(){
        s = new Student("Miles", 0);
        s.addGrade(10);
        s.addGrade(10);
        s.addGrade(10);
        s.addGrade(9);
        assertEquals(9.75, s.getGradeAverage(), 0);
    }
}
