package ru.devalkone.leetcode;

import ru.devalkone.leetcode.common.ListNode;

import javax.print.attribute.standard.SheetCollate;
import java.util.Arrays;
import java.util.LinkedList;

public class Day3 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var rootNode = new ListNode();
        var lastNode = rootNode;
        while (list1 != null || list2 != null) {
            if (list1 == null || (list2 != null && list2.val < list1.val)) {
                lastNode.next = list2;
                list2 = list2.next;
            } else {
                lastNode.next = list1;
                list1 = list1.next;
            }

            lastNode = lastNode.next;
        }

        return rootNode.next;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode previousNode = null;
        ListNode nextNode = null;
        while (head.next != null) {
            nextNode = head.next;
            head.next = previousNode;
            previousNode = head;
            head = nextNode;
        }

        head.next = previousNode;
        return head;
    }
}
