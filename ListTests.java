import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> input1 = new ArrayList<String>();
        input1.add("dog");
        input1.add("swag");
        input1.add("gone");
        input1.add("fawn");
        List<String> check1 = new ArrayList<String>();
        check1.add("dog");
        check1.add("gone");
        StringChecker sc = new StringCheckerImplement("o");

        assertArrayEquals(check1.toArray(), ListExamples.filter(input1, sc).toArray());
    }
}
