import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    public Cohort testCohort;

    @Before
    public void setUp(){
        testCohort = new Cohort();
    }

    @Test
    public void testStudentsPropertyInitialized(){
        assertNotNull(testCohort.getStudents());
    }

    @Test
    public void testAddStudent(){
        assertEquals(0, testCohort.getStudents().size());
        Student student1 = new Student(1L, "Jeff");
        testCohort.addStudent(student1);
        assertEquals(1, testCohort.getStudents().size());
        Student student2 = new Student(2L, "Bridges");
        testCohort.addStudent(student2);
        assertEquals(2, testCohort.getStudents().size());
    }

    @Test
    public void testGetStudents(){
        Student student1 = new Student(1L, "Bob");
        testCohort.addStudent(student1);
        assertEquals("Bob", testCohort.getStudents().get(0).getName());
    }

    @Test
    public void testGetCohortAverage(){
        Student student1 = new Student(1L, "Rick");
        Student student2 = new Student(2L, "James");
        Student student3 = new Student(3L, "Rich");
        student1.addGrade(75);
        student2.addGrade(81);
        student3.addGrade(97);
        testCohort.addStudent(student1);
        testCohort.addStudent(student2);
        testCohort.addStudent(student3);
        assertEquals(84.33, testCohort.getCohortAverage(), 0.01);
    }

    @Test
    public void testFindStudentById(){
        Student student1 = new Student(1L, "Peter");
        Student student2 = new Student(2L, "Dinklage");
        testCohort.addStudent(student1);
        testCohort.addStudent(student2);
        assertEquals("Dinklage", testCohort.findStudentById(2L));
        assertEquals("Student not found", testCohort.findStudentById(4L));
    }
}