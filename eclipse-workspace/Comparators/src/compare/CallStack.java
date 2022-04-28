package compare;

public class CallStack {
	
	public static void method3() {
        System.out.println("Start 3");
        System.out.println("End 3");
    }
    public static void method2() {
        System.out.println("Start 2");
        method3();
        System.out.println("End 2");
    }
    public static void method1() {
        System.out.println("Start 1");
        method2();
        System.out.println("End 1");
    }
    public static void main(String[] args) {
        System.out.println("Main start");
        method1();
        System.out.println("Main done");
    } // end of program...

}
