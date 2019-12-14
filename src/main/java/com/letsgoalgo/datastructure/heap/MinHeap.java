package com.letsgoalgo.datastructure.heap;

import java.util.PriorityQueue;

public class MinHeap {
    PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

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
