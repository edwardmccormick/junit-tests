import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    public Student ted = new Student("Ted");

    @Before
    public void setUp(){
        ted.addGrade(91);
        ted.addGrade(92);
        ted.addGrade(93);
    }

    @Test
    public void testIfGetIDReturnsID() {
        assertEquals(ted.getID(), 1);
    }

    @Test
    public void testIfGetGradesGetsGrades() {

        ArrayList<Integer> grades = new ArrayList<>(List.of(91,92,93));
        assertArrayEquals(ted.getGrades().toArray(), grades.toArray());
    }

        @Test
        public void testIfGetGradeAverageAveragesGrades () {
            assertEquals(ted.getGradeAverage(), 92.0, 0.0);
        }

}