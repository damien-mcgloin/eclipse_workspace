package namers;

public class ThreadNames {

    public static void main(String[] args) {
        
        ThreadOutputsName n = new ThreadOutputsName();
        Thread t = new Thread(n, "Wee thread");
        
        t.start();
        
    }

}
