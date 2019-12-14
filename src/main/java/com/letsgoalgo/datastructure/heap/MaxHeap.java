package com.letsgoalgo.datastructure.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

    public void insert(int n) {
        this.queue.add(n);
    }

    public int poll() {
        return this.queue.poll();
    }

    public int peek() {
        return this.queue.peek();
    }

    public int size() {
        return this.queue.size();
    }
}
