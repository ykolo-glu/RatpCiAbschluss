package htl.steyr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @Test
    void addwithPositiveNumbers() {
        Number numberPositive = new Number(1);
        Number otherPositive = new Number(2);
        assertEquals(3, numberPositive.add(otherPositive));

        Number numberPositive2 = new Number(6);
        Number otherPositive2 = new Number(7);
        assertEquals(13, numberPositive2.add(otherPositive2));
    }

    @Test
    void addwithNegativeNumbers() {
        Number numberNegative = new Number(-1);
        Number otherNegative = new Number(-2);
        assertEquals(-3, numberNegative.add(otherNegative));

        Number numberNegative2 = new Number(-6);
        Number otherNegative2 = new Number(-7);
        assertEquals(-13, numberNegative2.add(otherNegative2));
    }

    @Test
    void addwithNull() {
        Number number = new Number(1);
        assertThrows(NullPointerException.class, () -> {
            number.add(null);
        });
    }

    @Test
    void divide() {
        Number number = new Number(10);
        Number other = new Number(2);
        assertEquals(5, number.divide(other));
        Number number2 = new Number(12);
        Number other2 = new Number(6);
        assertEquals(2, number2.divide(other2));
    }

    @Test
    void divideWithZero() {
        Number number = new Number(10);
        assertThrows(IllegalArgumentException.class, () -> {
            number.divide(new Number(0));
        });

    }

    @Test
    void isPrime() {
        assertTrue(new Number(11).isPrime());
        assertTrue(new Number(2).isPrime());
        assertTrue(new Number(13).isPrime());
    }

    @Test
    void isNotPrime() {
        assertFalse(new Number(12).isPrime());
        assertFalse(new Number(14).isPrime());
        assertFalse(new Number(15).isPrime());
    }

    @Test
    void isOnePrime() {
        assertFalse(new Number(1).isPrime());
    }

    @Test
    void isZeroPrime() {
        assertFalse(new Number(0).isPrime());
    }

}