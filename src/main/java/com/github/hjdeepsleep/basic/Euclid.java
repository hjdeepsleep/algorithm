package com.github.hjdeepsleep.basic;

/**
 * 최대공약수(GCD) 구하기  - 유클리드 알고리즘 이용
 * <p>
 * m>=n 인 두 양의 정수 m과 n에 대하여 m이 n의 배수이면 gcd(m,n) = n 이고,
 * 그렇지 않으면 gcd(m,n) = gdc(n, m%n) 이다.
 */
public class Euclid {

    public double gcd(int m, int n) {
        if (m < n) { // swap
            int tmp = m;
            m = n;
            n = tmp;
        }

        if (m % n == 0) {
            return n;
        }

        return gcd(n, m % n);
    }
}
