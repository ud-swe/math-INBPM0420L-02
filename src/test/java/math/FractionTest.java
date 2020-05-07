package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FractionTest {

    private void assertFraction(int expectedNumerator, int expectedDenominator, Fraction actual) {
        assertAll("fraction",
                () -> assertEquals(expectedNumerator, actual.getNumerator(), "Invalid numerator"),
                () -> assertEquals(expectedDenominator, actual.getDenominator(), "Invalid denominator")
        );
    }

    @Test
    public void testFractionIntInt() {
        assertFraction(1, 4, new Fraction(1, 4));
        assertFraction(-13, 27, new Fraction(13, -27));
        assertFraction(5, 7, new Fraction(-5, -7));
        assertFraction(4, 2, new Fraction(4, 2));
        ArithmeticException e = assertThrows(ArithmeticException.class, () -> new Fraction(11, 0));
        assertEquals("Division by zero", e.getMessage());
    }

    @Test
    public void testFractionInt() {
        assertFraction(0, 1, new Fraction(0));
        assertFraction(3, 1, new Fraction(3));
        assertFraction(-13, 1, new Fraction(-13));
    }

    @Test
    public void testAddInt() {
        fail();
    }

    @Test
    public void testSubtractInt() {
        fail();
    }

    @Test
    public void testMultiplyInt() {
        fail();
    }

    @Test
    public void testDivideInt() {
        // TODO (ILBLIL)
        fail();
    }

    @Test
    public void testPow() {
        // TODO (AN170X)
        fail();
    }

    @Test
    public void testAddFraction() {
        // TODO (RLTF9H)
        fail();
    }

    @Test
    public void testSubtractFraction() {
        // TODO (L8HCRL)
        fail();
    }

    @Test
    public void testDivideFraction() {
        // TODO (XE9XT0)
        fail();
    }

    @Test
    public void testMultiplyFraction() {
        // TODO (AQC8ZY)
        fail();
    }

    @Test
    public void testReciprocal() {
        // TODO (D82QBN)
        fail();
    }

    @Test
    public void testAbs() {
        // TODO (D82QBN)
        fail();
    }

    @Test
    public void testIsZero() {
        // TODO (CIKFWV)
        fail();
    }

    @Test
    public void testReduce() {
        // TODO (CIKFWV)
        fail();
    }

    @Test
    public void testToString() {
        // TODO (P8HR70)
        fail();
    }

    @Test
    public void testByteValue() {
        fail();
    }

    @Test
    public void testDoubleValue() {
        // TODO (ZFWGNT)
        fail();
    }

    @Test
    public void testFloatValue() {
        // TODO (ZFWGNT)
        fail();
    }

    @Test
    public void testIntValue() {
        // TODO (FFD0YV)
        fail();
    }

    @Test
    public void testLongValue() {
        // TODO (FFD0YV)
        fail();
    }

    @Test
    public void testShortValue() {
        fail();
    }

    @Test
    public void testClone() {
        fail();
    }

    @Test
    public void testHashCode() {
        fail();
    }

    @Test
    public void testEquals() {
        // TODO (H2VH7K)
        fail();
    }

}
