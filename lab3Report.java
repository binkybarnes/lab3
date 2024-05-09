import static org.junit.Assert.*;
import org.junit.*;

public class lab3Report {
    @Test
    public void test1() {
        assertEquals(2.0, ArrayExamples.averageWithoutLowest(new double[] { 1.0, 1.0, 2.0, 3.0 }), 0.001);

    }

    @Test
    public void test2() {
        assertEquals(3.5, ArrayExamples.averageWithoutLowest(new double[] { 2.0, 3.0, 4.0 }), 0.001);
    }
}