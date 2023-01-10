package ru.devalkone.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.devalkone.leetcode.common.ListNode;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Day3Test {
    @ParameterizedTest
    @MethodSource("mergeTwoListsSource")
    public void mergeTwoLists(ListNode list1, ListNode list2, ListNode expected) {
        assertThat(Day3.mergeTwoLists(list1, list2)).isEqualTo(expected);
    }

    private static Stream<Arguments> mergeTwoListsSource() {
        return Stream.of(
//                Arguments.of(
//                        new ListNode(1,
//                                new ListNode(2,
//                                        new ListNode(3))),
//                        new ListNode(1,
//                                new ListNode(3,
//                                        new ListNode(4))),
//                        new ListNode(1,
//                                new ListNode(1,
//                                        new ListNode(2,
//                                                new ListNode(3,
//                                                        new ListNode(4,
//                                                                new ListNode(4))))))),
                Arguments.of(new ListNode(1), new ListNode(), null)
        );
    }

    @ParameterizedTest
    @MethodSource("reverseListSource")
    public void reverseList(ListNode list1, ListNode expected) {
        assertThat(Day3.reverseList(list1)).isEqualTo(expected);
    }

    private static Stream<Arguments> reverseListSource() {
        return Stream.of(
                Arguments.of(
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(4,
                                                        new ListNode(5))))), null)
        );
    }
}