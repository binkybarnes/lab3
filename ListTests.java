import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListTests {

    @Test
    public void filterTest() {
        List<String> list = Arrays.asList("rat", "mega rat", "hedgehog");
        StringChecker sc = s -> s.contains("rat");
        assertEquals(Arrays.asList("rat", "mega rat"), ListExamples.filter(list, sc));
    }

    @Test(timeout = 1000)
    public void mergeTest() {
        List<String> list1 = Arrays.asList("a", "c", "e");
        List<String> list2 = Arrays.asList("b", "d", "f");

        assertEquals(Arrays.asList("a", "b", "c", "d", "e", "f"), ListExamples.merge(list1, list2));
    }

}