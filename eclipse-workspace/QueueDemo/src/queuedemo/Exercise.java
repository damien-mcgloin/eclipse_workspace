package queuedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
        // populate with the names of six family members
        list.add("Aidan");
        list.add("Claire");
        list.add("Niamh");
        list.add("Una");
        list.add("Annie");
        
        // convert to a queue
        Queue<String> myQ = new PriorityQueue<>(list);
        
        // dequeue every 2 seconds
        while (!myQ.isEmpty()) {
            System.out.println(myQ.poll());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }       

	}

}
