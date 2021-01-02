package com.github.hjdeepsleep.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FibonacciTest {

    @DisplayName("n번째 피보나치 수 구하기")
    @ParameterizedTest
    @CsvSource(value = {"1:1", "3:2", "7:13", "10:55"}, delimiter = ':')
    public void fibonacci(int n, int expect) throws Exception {
        //given
        Fibonacci al = new Fibonacci();

        //when
        int result = al.fibonacci(n);

        //then
        Assertions.assertTrue(result == expect);
    }
}
