package com.letsgoalgo.problems.arrays;

import com.letsgoalgo.datastructure.heap.MaxHeap;
import com.letsgoalgo.datastructure.heap.MinHeap;

public class MedianOfStream {
    MaxHeap max = new MaxHeap();
    MinHeap min = new MinHeap();
    int length = 0;
    float median = 0;

    public float calcMedian(int n) {
        this.length++;
        
        if(length == 1) {
            this.max.insert(n);
            this.median = n;
        }
        else if(this.max.size() > this.min.size()) {
            if(n < this.median) {
                this.min.insert(this.max.poll());
                this.max.insert(n);
            } else {
                this.min.insert(n);
            }
            this.median = (float) (this.min.peek() + this.max.peek()) / 2;
        }
        else if(this.min.size() == this.max.size()) {
            if(n < this.median) {
                this.max.insert(n);
                this.median = this.max.peek();
            } else {
                this.min.insert(n);
                this.median = this.min.peek();
            }
        }
        else {
            if(n > this.median) {
                this.max.insert(this.min.poll());
                this.min.insert(n);
            } else {
                this.max.insert(n);
            }
            this.median = (float)(this.min.peek() + this.max.peek()) / 2;
        }

        return this.median;
    }

    public static void main(String[] args) {
        MedianOfStream obj = new MedianOfStream();

        System.out.println(obj.calcMedian(10));

        System.out.println(obj.calcMedian(1));

        System.out.println(obj.calcMedian(8));

        System.out.println(obj.calcMedian(2));

        System.out.println(obj.calcMedian(7));

        System.out.println(obj.calcMedian(6));

        System.out.println(obj.calcMedian(13));

        System.out.println(obj.calcMedian(2));
    }
}