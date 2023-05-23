import day2.StringUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @Test
    public void testReverse() {
        String string = "Hello";
        String reversed = "olleH";
        String actual = StringUtil.reverse(string);
        Assertions.assertEquals(actual, reversed);
    }

    @Test
    public void testReverse_NullInput() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.reverse(null);
        });
    }

    @Test
    public void testIsPalindrome() {
        String palindrome = "racecar";
        String notPalindrome = "hello";
        Assertions.assertTrue(StringUtil.isPalindrome(palindrome));
        Assertions.assertFalse(StringUtil.isPalindrome(notPalindrome));
    }

    @Test
    public void testIsPalindrome_NullInput() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.isPalindrome(null);
        });
    }



}
