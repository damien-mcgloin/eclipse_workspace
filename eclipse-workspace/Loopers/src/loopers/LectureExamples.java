/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class LectureExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num;
		num=998;
		
		num = num + 2;
		System.out.println(num);
		
		// or this looks better in an interview!
		num+=2;
		System.out.println(num);
		
		// not just addition but...
		num-=2;
		System.out.println(num);
		
		num*=2;
		System.out.println(num);
		
		num/=2;
		System.out.println(num);
		
		num%=3;
		System.out.println(num);
		
		// increments or decrements by 1
		System.out.println("increment or decrement...");
		num++;
		System.out.println(num);

		 num--;
		System.out.println(num);
		
		// post & prefix
		System.out.println("post & pre fix");
		num = 2;
		// post
		System.out.println("post fix");
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		
		// pre
		System.out.println("pre fix");
		System.out.println(num);
		System.out.println(++num);
		System.out.println(num);
		
		// mod explain
		int ans = 10%3;
		System.out.println(ans);
		
		

	}

}
