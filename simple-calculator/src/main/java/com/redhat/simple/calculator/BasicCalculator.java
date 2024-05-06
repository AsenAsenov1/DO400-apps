package com.redhat.simple.calculator;

<<<<<<< HEAD
import java.util.*;

public class BasicCalculator {
    public int divide(int dividend, int divisor) {
        if (divisor == 0)
            return Integer.MAX_VALUE;
        else
            return dividend / divisor;
    }

    public int subs(int minuend, int subtrahend) {
        return minuend-subtrahend;
    }

    public int sum(int addendA, int addendB) {
        return addendA+addendB;
    }

    public int multiply(int multiplicand, int multiplier) {
        return multiplicand*multiplier;
    }

    public int Random() {
        Random r = new Random();

        return r.nextInt();
    }
}
=======
import java.util.Random;

public final class BasicCalculator extends Calculator {

    private final Random randomService = new Random();

    public int random() {
        return randomService.nextInt();
    }
}
>>>>>>> cd26c9ed54c0d8e5c46dbf1be2517a20f4d7f9a1
