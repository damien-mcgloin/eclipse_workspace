package exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExercise {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("Damien");
		nameList.add("Damien");
		nameList.add("Damien");
		nameList.add("Damien");
		nameList.add("Damien");
		
		Queue<String> myQueue = new LinkedList<>(nameList);
		
		while(!myQueue.isEmpty()) {
			System.out.println(myQueue.poll());
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
