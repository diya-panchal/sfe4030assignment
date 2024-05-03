import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {
    @Test
    public void testValidRomanNumerals() {
        assertEquals(3, Main.romanToInt("III"));
        assertEquals(9, Main.romanToInt("IX"));
        assertEquals(12, Main.romanToInt("XII"));
        assertEquals(24, Main.romanToInt("XXIV"));
        assertEquals(45, Main.romanToInt("XLV"));
        assertEquals(123, Main.romanToInt("CXXIII"));
        assertEquals(999, Main.romanToInt("CMXCIX"));
        assertEquals(1994, Main.romanToInt("MCMXCIV"));
    }

    @Test
    public void testEdgeCases() {
        assertEquals(1, Main.romanToInt("I"));
        assertEquals(5, Main.romanToInt("V"));
        assertEquals(10, Main.romanToInt("X"));
        assertEquals(50, Main.romanToInt("L"));
        assertEquals(100, Main.romanToInt("C"));
        assertEquals(500, Main.romanToInt("D"));
        assertEquals(1000, Main.romanToInt("M"));
    }

    
}
