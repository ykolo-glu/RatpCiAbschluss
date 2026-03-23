package htl.steyr;

public class Number {
    private int value;

    public Number(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }

    public int add(Number other) {
      return getValue() + other.getValue();
    }

    public int divide(Number other) {
        if (other.getValue() == 0) {
            throw new IllegalArgumentException("Division durch 0 ist nicht erlaubt");
        }

        return getValue() / other.getValue();
    }

    public boolean isPrime() {
        if (getValue() <= 1) return false;
        
        for (int i = 2; i < getValue(); i++) {
            if (getValue() % i == 0) return false;
        }

        return true;
    }
}