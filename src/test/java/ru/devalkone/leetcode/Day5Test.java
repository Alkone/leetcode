package ru.devalkone.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.devalkone.leetcode.common.ListNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Day5Test {

    @ParameterizedTest
    @MethodSource("maxProfitSource")
    void maxProfit(int[] days, int profit) {
        Assertions.assertThat(Day5.maxProfit(days)).isEqualTo(profit);
    }

    private static Stream<Arguments> maxProfitSource() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5),
                Arguments.of(new int[]{1, 8, 3, 4, 9, 5}, 8),
                Arguments.of(new int[]{3, 8, 1, 2, 4, 5}, 5)

        );
    }

    @ParameterizedTest
    @MethodSource("longestPalindromeSource")
    void longestPalindrome(String s, int expected) {
        Assertions.assertThat(Day5.longestPalindrome(s)).isEqualTo(expected);
    }

    private static Stream<Arguments> longestPalindromeSource() {
        return Stream.of(
                Arguments.of("abccccdd", 7),
                Arguments.of("a", 1),
                Arguments.of("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth", 983)
        );
    }
}