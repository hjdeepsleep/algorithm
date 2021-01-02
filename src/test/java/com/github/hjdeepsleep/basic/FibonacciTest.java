package com.github.hjdeepsleep.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    @DisplayName("n번째 피보나치 수 구하기")
    @Test
    public void fibonacci() throws Exception {
        //given
        Fibonacci al = new Fibonacci();

        //when
        int result = al.fibonacci(10);

        //then
        Assertions.assertTrue(result == 55);
    }
}
