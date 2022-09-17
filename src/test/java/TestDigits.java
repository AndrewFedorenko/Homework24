import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDigits {
    @Test
    public void test(){
        assertEquals(RomanDigitsTranslator.getDecimal("CMXXIV"), 924);
        assertEquals(RomanDigitsTranslator.getDecimal("IV"), 4);
        assertEquals(RomanDigitsTranslator.getDecimal("XIX"), 19);
    }
}
