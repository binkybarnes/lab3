import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void ReverseInPlaceTest2() {
    int[] arr = { 1, 2 };
    ArrayExamples.reverseInPlace(arr);
    assertArrayEquals(new int[] { 2, 1 }, arr);
  }

  @Test
  public void ReversedTest2() {
    int[] arr = { 1, 2 };
    assertArrayEquals(new int[] { 2, 1 }, ArrayExamples.reversed(arr));
    assertArrayEquals(new int[] { 1, 2 }, arr);

  }

  @Test
  public void AvgNoLowestTest1() {
    double[] arr = { 1.0, 1.0, 2.0 };
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(arr), 0.0001);
  }

  @Test
  public void AvgNoLowestTest2() {
    double[] arr = { 1.0 };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(arr), .0001);
  }
}
