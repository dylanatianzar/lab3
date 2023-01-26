import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] custom1 = {1,2,3};
    ArrayExamples.reverseInPlace(custom1);
    assertArrayEquals(new int[]{3,2,1}, custom1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] custom1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(custom1));

  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {1,1,1,2,2,5,3,3,3,3};

    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }
  
}
