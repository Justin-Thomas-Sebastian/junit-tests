import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    public Student testStudent;

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

    @Test
    public void testUpdateGrade(){
        testStudent.addGrade(78);
        testStudent.addGrade(80);
        testStudent.addGrade(87);
        testStudent.updateGrade(2, 90);
        assertEquals(90, testStudent.getGrades().get(2), 0);
    }

    @Test
    public void testGradesToString(){
        testStudent.addGrade(67);
        testStudent.addGrade(78);
        testStudent.addGrade(99);
        assertEquals("[67, 78, 99]", testStudent.gradesToString());
    }

    @Test
    public void testDeleteGrade(){
        testStudent.addGrade(90);
        testStudent.addGrade(88);
        testStudent.addGrade(77);
        testStudent.deleteGrade(1);
        assertEquals("[90, 77]", testStudent.gradesToString());
    }
}