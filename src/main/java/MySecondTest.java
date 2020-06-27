import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class MySecondTest {
    @Test
    public void toTestStringIsEqual(){
        String actual = "Codeup";
        String expected = "CodeUp";
        assertNotEquals(expected,actual);
        assertEquals(expected, "CodeUp");
        assertNotEquals("CodeUp", actual);
    }

    @Test
    public void toTestArraysNotEqual(){
    List<String> languages = new ArrayList<>();
    List<String> moreLanguages = new ArrayList<>();
    assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testIfArraysAreEqual(){
        int [] numbers = {1, 2, 3};
        int [] otherNumbers = new int [3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfWordContains(){
        String language = "PHP";
        language.contains("H");
        language.contains("J");
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }
}
