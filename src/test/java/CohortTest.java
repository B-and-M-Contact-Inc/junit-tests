import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CohortTest {

    /* Test the following cases:
    A Cohort instance can add a Student to the List of students.
    A Cohort instance can get the current List of students.
    A Cohort instance can get the average, and it's being calculated correctly.*/
    Cohort dut;
    Student miles;
    Student penny;
    Student joan;
    Student glenda;
    @Before
    public void initialize(){
        dut = new Cohort();
        miles = new Student(0, "Miles");
        miles.addGrade(10);
        miles.addGrade(10);
        miles.addGrade(10);
        miles.addGrade(10);

        penny = new Student(1, "Penny");
        penny.addGrade(9);
        penny.addGrade(9);
        penny.addGrade(9);
        penny.addGrade(9);

        joan = new Student(1, "Joan");
        joan.addGrade(9);
        joan.addGrade(9);
        joan.addGrade(9);
        joan.addGrade(9);

        glenda = new Student(1, "Glenda");
        glenda.addGrade(9);
        glenda.addGrade(9);
        glenda.addGrade(9);
        glenda.addGrade(9);

        dut.addStudent(miles);
        dut.addStudent(penny);
        dut.addStudent(joan);
        dut.addStudent(glenda);
    }

    @Test
    public void testAddStudent(){
        assertEquals(4, dut.getStudents().size(), 0);
    }

    @Test
    public void testGetStudentList(){
        List<Student> expectedStudentList = new ArrayList<Student>();
        expectedStudentList.add(miles);
        expectedStudentList.add(penny);
        expectedStudentList.add(joan);
        expectedStudentList.add(glenda);
        assertEquals(expectedStudentList, dut.getStudents());

    }
    @Test
    public void testCohortAverage(){
        assertEquals(9.25, dut.getCohortAverage(), 0);
    }

}
