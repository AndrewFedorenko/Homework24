import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class RomanDigitsTranslator {
    public static Map<String, Integer> dict = new HashMap<>();
    static {
        dict.put("I", 1);
        dict.put("V", 5);
        dict.put("X", 10);
        dict.put("L", 50);
        dict.put("C", 100);
        dict.put("D", 500);
        dict.put("M", 1000);
        dict.put("IV", -2);
        dict.put("IX", -2);
        dict.put("XL", -20);
        dict.put("CD", -200);
        dict.put("CM", -200);
    }
    public static int getDecimal(String inputRoman){
        AtomicInteger result = new AtomicInteger();
        dict.forEach((str,i)->{
            // for each key find the number of its entry in string and multiple on according decimal
            result.set(result.get() + i * (inputRoman.length() - inputRoman.replace(str, "").length()) / str.length());
        });
        return result.get();
    }

    public static void main(String[] args) {
        System.out.println(getDecimal("CMXXIV"));
        System.out.println(getDecimal("IV"));
        System.out.println(getDecimal("XIX"));
    }
}
