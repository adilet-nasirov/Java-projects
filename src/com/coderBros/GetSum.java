package com.coderBros;

public class GetSum {
    public int sumBetween(int a, int b) {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}
