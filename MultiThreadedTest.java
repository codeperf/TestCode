package multithreadedtest;

import java.util.Random;

/**
 *
 * @author Sandeep
 * The program will create 10 threads to increase load on CPU
 */
public class MultiThreadedTest implements Runnable{

    /**
     * @param args the command line arguments
     */
    public void run(){
        

    Random rand = new Random();
    while(true){
    int  n = rand.nextInt(50000) + 1;
    }

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1; i < 10; i++)
        {
            (new Thread(new MultiThreadedTest())).start();
        }
        
    }
    
}
