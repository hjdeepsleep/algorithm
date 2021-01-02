package com.github.hjdeepsleep.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EuclidTest {

    @DisplayName("유클리드를 이용한 최대 공약수 구하기")
    @ParameterizedTest
    @CsvSource(value = {"10:5:5", "20:5:5", "100:8:4", "8:100:4"}, delimiter = ':')
    public void gcd(int m, int n, double expect) throws Exception {
        //given
        Euclid euclid = new Euclid();

        //when
        int result = euclid.gcd(m, n);

        //then
        Assertions.assertTrue(result == expect);
    }

    @DisplayName("유클리드를 이용한 최대 공약수 구하기")
    @ParameterizedTest
    @CsvSource(value = {"10:5:5", "20:5:5", "100:8:4", "8:100:4"}, delimiter = ':')
    public void gcd2(int m, int n, double expect) throws Exception {
        //given
        Euclid euclid = new Euclid();

        //when
        int result = euclid.gcd2(m, n);

        //then
        Assertions.assertTrue(result == expect);
    }
}
