package com.dxc;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // List example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("List: " + list);

        // Set example
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("Set: " + set);

        // Map example
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("Map: " + map);

        // Queue example
        Queue<String> queue = new LinkedList<>();
        queue.add("John");
        queue.add("Alice");
        queue.add("Bob");
        System.out.println("Queue: " + queue);

        // Stack example
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println("Stack: " + stack);

        // Deque example
        Deque<Character> deque = new ArrayDeque<>();
        deque.addFirst('A');
        deque.addLast('Z');
        deque.addFirst('B');
        System.out.println("Deque: " + deque);
    }
}
