package com.github.hjdeepsleep.basic;

/**
 * 피보나치 수열
 */
public class Fibonacci {

    /**
     * n번째 피보나치 수 구하기
     */
    public int fibonacci(int n) {
        if (n < 2) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
