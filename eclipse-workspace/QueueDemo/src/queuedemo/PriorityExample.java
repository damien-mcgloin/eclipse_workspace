package queuedemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityExample {

	public static void main(String[] args) {
		
        Queue<Double> q = new PriorityQueue<>();
        // add in any order
        q.add(10.1);
        q.add(3.3);
        q.add(5.2);
        System.out.println("Order "+q.toString());
        
        int loop=1;
        while(loop<=q.size()){
            // view then remove by order
            System.out.println("Peeking ..."+q.peek());
            q.poll();  // similar to remove but returns null if queue is empty 
        }
    }

}
