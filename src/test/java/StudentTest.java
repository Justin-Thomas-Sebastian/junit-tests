import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    private Student testStudent;

    @Before
    public void setUp(){
        testStudent = new Student(1L, "Justin Sebastian");
    }

    @Test
    public void testConstructor(){
        assertNotNull(testStudent);
    }

    @Test
    public void testNameIsInitialized(){
        assertNotNull(testStudent.getName());
    }

    @Test
    public void testIdIsInitialized(){
        assertNotNull(testStudent.getId());
    }

    @Test
    public void testGradesIsInitialized(){
        assertNotNull(testStudent.getGrades());
    }

    @Test
    public void testGradesInitializedEmpty(){
        assertEquals(0, testStudent.getGrades().size(), 0);
    }

    @Test
    public void testGetId(){
        assertEquals(1L, testStudent.getId());
    }

    @Test
    public void testGetName(){
        assertEquals("Justin Sebastian", testStudent.getName());
    }

    @Test
    public void testAddGrade(){
        testStudent.addGrade(90);
        int grade = testStudent.getGrades().get(0);
        assertEquals(90, grade, 0);
    }

    @Test
    public void testAverageGrade(){
        testStudent.addGrade(100);
        testStudent.addGrade(95);
        testStudent.addGrade(70);
        testStudent.addGrade(78);
        assertEquals(85.75, testStudent.getGradeAverage(), 0);
    }
}