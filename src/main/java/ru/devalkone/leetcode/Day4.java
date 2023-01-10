package ru.devalkone.leetcode;

import ru.devalkone.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Day4 {
    public static ListNode middleNode(ListNode head) {


//        var list = new ArrayList<ListNode>();
//        while (head != null) {
//            list.add(head);
//            head = head.next;
//        }
//
//        return list.get(list.size() / 2);

        var slowHead = head;

        while (head.next != null) {
            slowHead = slowHead.next;
            head = head.next;
            if (head.next != null) {
                head = head.next;
            }
        }

        return slowHead;
    }

    public static ListNode detectCycle(ListNode head) {
        var hs = new HashSet<ListNode>();
        while (head != null && hs.add(head)) {
            head = head.next;
        }
        return head;
    }
}
