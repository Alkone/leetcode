package ru.devalkone.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.devalkone.leetcode.common.ListNode;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Day4Test {
    @ParameterizedTest
    @MethodSource("middleNodeSource")
    public void middleNode(ListNode list1, ListNode expected) {
        assertThat(Day4.middleNode(list1)).isEqualTo(expected);
    }

    private static Stream<Arguments> middleNodeSource() {
        return Stream.of(
                Arguments.of(new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(6)))))), null)
        );
    }

    @ParameterizedTest
    @MethodSource("detectCycleSource")
    void detectCycle(ListNode list1, ListNode expected) {
        assertThat(Day4.detectCycle(list1)).isEqualTo(expected);
    }

    private static Stream<Arguments> detectCycleSource() {
        var node1 = new ListNode(3);
        var node2 = new ListNode(2);
        var node3 = new ListNode(0);
        var node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        return Stream.of(
                Arguments.of(node1, node2)
        );
    }
}