import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;


class PalindromeService {

    public boolean isPalindrome(String text) {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equals(reversedText);
    }
}

@RunWith(Parameterized.class)
// добавь аннотацию с раннером
public class PalindromeServiceTest {
    private final String checkedText;
    private final boolean expected;
    // добавь два поля класса: для проверяемой строки и ожидаемого результата

    public PalindromeServiceTest(String checkedText, boolean expected) {
        this.checkedText = checkedText;
        this.expected = expected;
    }
    // напиши конструктор с двумя параметрами

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"e", "e"},
                {"e", "e"},
                {"e", "e"},

        };// напиши метод для получения тестовых данных
    }
    @Test
    public void shouldCheckPalindrome() {
        PalindromeService palindromeService = new PalindromeService();
        boolean actual = palindromeService.isPalindrome(checkedText);
        assertEquals(expected, actual);
    }

}