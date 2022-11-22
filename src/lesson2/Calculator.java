package lesson2;

import java.math.BigDecimal;

public class Calculator {
    static double sum(int l1, int l2) {
        return (double) l1 + l2;
    }

    static double sum(long l1, long l2) {
        return (double) l1 + l2;
    }

    static double sum(double l1, double l2) {
        return l1 + l2;
    }

    static double div(int l1, int l2) {
        return (double) l1 / l2;
    }

    static double div(long l1, long l2) {
        return (double) l1 / l2;
    }

    static double div(double l1, double l2) {
        return l1 / l2;
    }

    static double sub(int l1, int l2) {
        return (double) l1 - l2;
    }

    static double sub(long l1, long l2) {
        return (double) l1 - l2;
    }

    static double sub(double l1, double l2) {
        BigDecimal lb1 = new BigDecimal(String.valueOf(l1));
        BigDecimal lb2 = new BigDecimal(String.valueOf(l2));
        return lb1.subtract(lb2).doubleValue();
    }

    static double mul(int l1, int l2) {
        return (double) l1 * l2;
    }

    static double mul(long l1, long l2) {
        return (double) l1 * l2;
    }

    static double mul(double l1, double l2) {
        return l1 * l2;
    }
}
