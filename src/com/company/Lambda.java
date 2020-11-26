package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda{
    private static List<Integer> primeNumToN(int n) {
        return IntStream.rangeClosed(2, n)
                .filter(Lambda::isPrime).boxed()
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) (Math.sqrt(number)))
                .filter(n -> (n & 0X1) != 0)
                .allMatch(n -> number % n != 0);
    }

    private static int countOfOne(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') count++;
        }
        return count;
    }

    public static int maxOneBinary(int n) {
        List<Integer> primeNumbers = primeNumToN(n);

        return primeNumbers.stream().reduce(2, (x, y) -> {
            String a = Integer.toBinaryString(x);
            String b = Integer.toBinaryString(y);
            return countOfOne(a) > countOfOne(b) ? x : y;
        });
    }
}


