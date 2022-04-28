package aqua;

import java.util.List;
import java.util.Arrays;

public class MaxSum {

    public static int findMaxSum(List<Integer> list) {
        
    	int one, two;
    	
    	if(list.get(0) > list.get(1)) {
    		one = list.get(0);
    		two = list.get(1);
    	} else {
    		one = list.get(1);
    		two = list.get(0);
    	}
    	
    	for (int i = 2; i<list.size(); i++) {
    		if (list.get(i) > one) {
    			two = one;
    			one = list.get(i);
    		} else if (list.get(i) > two && list.get(i) != one) {
    			two = list.get(i);
    		}
    	}
    	
    	return (one + two);
    	
    }
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        System.out.println(findMaxSum(list));
    }
	
}
