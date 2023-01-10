package ru.devalkone.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Day2Test {
    @ParameterizedTest
    @MethodSource("isIsomorphicSource")
    public void isIsomorphic(String first, String second, boolean expected) {
        assertThat(Day2.isIsomorphic(first, second)).isEqualTo(expected);
    }

    private static Stream<Arguments> isIsomorphicSource() {
        return Stream.of(
                Arguments.of("egg", "add", true),
                Arguments.of("foo", "bar", false),
                Arguments.of("paper", "title", true),
                Arguments.of("badc", "baba", false)
        );
    }

    @ParameterizedTest
    @MethodSource("isSubsequenceSource")
    public void isSubsequence(String first, String second, boolean expected) {
        assertThat(Day2.isSubsequence(first, second)).isEqualTo(expected);
    }

    private static Stream<Arguments> isSubsequenceSource() {
        return Stream.of(
                Arguments.of("ace", "abcde", true),
                Arguments.of("ace", "aec", false),
                Arguments.of("abc", "ahbgdc", true),
                Arguments.of("axc", "baahbgdcba", false)
        );
    }

}