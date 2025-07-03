import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramGeneratorTest {

    @Test
    public void testThreeLetters() {
        List<String> result = AnagramGenerator.generateAnagrams("abc");
        assertEquals(6, result.size());
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("acb"));
        assertTrue(result.contains("bac"));
        assertTrue(result.contains("bca"));
        assertTrue(result.contains("cab"));
        assertTrue(result.contains("cba"));
    }

    @Test
    public void testFourLetters() {
        List<String> result = AnagramGenerator.generateAnagrams("abcd");
        assertEquals(24, result.size());
        assertTrue(result.contains("abcd"));
        assertTrue(result.contains("abdc"));
        assertTrue(result.contains("acbd"));
        assertTrue(result.contains("acdb"));
        assertTrue(result.contains("adbc"));
        assertTrue(result.contains("adcb"));
        assertTrue(result.contains("bacd"));
        assertTrue(result.contains("badc"));
        assertTrue(result.contains("bcad"));
        assertTrue(result.contains("bcda"));
        assertTrue(result.contains("bdac"));
        assertTrue(result.contains("bdca"));
        assertTrue(result.contains("cabd"));
        assertTrue(result.contains("cadb"));
        assertTrue(result.contains("cbad"));
        assertTrue(result.contains("cbda"));
        assertTrue(result.contains("cdab"));
        assertTrue(result.contains("cdba"));
        assertTrue(result.contains("dabc"));
        assertTrue(result.contains("dacb"));
        assertTrue(result.contains("dbac"));
        assertTrue(result.contains("dbca"));
        assertTrue(result.contains("dcab"));
        assertTrue(result.contains("dcba"));
    }

    @Test
    public void testSingleLetter() {
        List<String> result = AnagramGenerator.generateAnagrams("x");
        assertEquals(1, result.size());
        assertEquals("x", result.get(0));
    }

    @Test
    public void testEmptyInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            AnagramGenerator.generateAnagrams("");
        });
        assertEquals("Input must be a non-empty string.", exception.getMessage());
    }

    @Test
    public void testNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            AnagramGenerator.generateAnagrams(null);
        });
        assertEquals("Input must be a non-empty string.", exception.getMessage());
    }

    @Test
    public void testInvalidCharacters() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            AnagramGenerator.generateAnagrams("a1b");
        });
        assertEquals("Input must contain only alphabetic letters.", exception.getMessage());
    }
}
