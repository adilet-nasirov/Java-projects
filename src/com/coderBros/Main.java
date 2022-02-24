package com.coderBros;
import java.util.LinkedList;
import java.util.Queue;

import java.util.*;

// Class for Min Queue Data Structure
class MinQueue {
    Queue<Integer> Q = new LinkedList<>(); // Queue to store the element
    Deque<Integer> D = new LinkedList<Integer>();  // Double ended Queue to get the minimum element in O(1)

    public void enque_element(int element) {  // Function to push element into the queue
        if(Q.size() == 0) {          // Chceck if there is no element in the queue
            Q.add(element);
            D.add(element);
        }
        else {
            Q.add(element);

            while(D.size() != 0 && D.peekLast() > element) {  //Remove the elements out until the element at back is greater than current element
                D.removeLast();     // Remove from last of the Deque
            }
            D.add(element);
        }
    }

    public void deque_element() {  // Function to remove the element out from the queue
        if(Q.peek() == D.peekFirst()) {  // Check if the Minimum element is the element at the front of the Deque
            Q.remove();
            D.removeFirst();          // remove from head of the Deque
        }
        else {
            Q.remove();
        }
    }

    public int getMin() {     // Function to get the minimum element from the queue
        return D.peekFirst();   // Insert in the front
    }
}

public class Main {

    public static void main(String args[]) {

        MinQueue k = new MinQueue();
        int[] arr = new int[]{ -2, 1,2,4,677,-5,-9,0, 18};
        Arrays.sort ( arr );
        System.out.println (arr[arr.length-1]);
        System.out.println (arr[0]);
//
//        for(int i=0; i<7; i++) {   // Loop to enque element
//            k.enque_element(arr[i]);
//        }
//        System.out.println("Minimum element is " + k.getMin());
//        System.out.println("Initial Queue " + k.Q);
//        k.deque_element();
//        System.out.println("After 1 iteration-> Queue " + k.Q);
//        System.out.println("Minimum element is " + k.getMin());
//        System.out.println("SIZE of the queue is " + k.Q.size());
    }
}


//public class Main {
//    public static void main(String []args) {


//        MinQueueData queue=new MinQueueData();
//        queue.add(10);
//        queue.add(12);
//        queue.add(13);
//        queue.add(19);
//        System.out.println(queue.remove());
//        System.out.println(queue.minQueue());
//        System.out.println(queue.remove());
//        System.out.println(queue.minQueue());
//        System.out.println(queue.remove());
//        System.out.println(queue.minQueue());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//    }
