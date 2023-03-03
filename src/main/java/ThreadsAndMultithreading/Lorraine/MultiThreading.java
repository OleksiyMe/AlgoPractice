package ThreadsAndMultithreading.Lorraine;

public class MultiThreading {
    int counter = 1;
    static int N;
    
    public void printOddNumber(){
        synchronized (this) {
            while (counter < N) {
                
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                
                System.out.print(counter + " <-ThreadNumber "+Thread.currentThread().getId()+" \n");
                
                counter++;
                
                notify();
            }
        }
    }

    // Function to print even numbers
    public void printEvenNumber() {
        synchronized (this)
        {
            while (counter <=N) {
                
                while (counter % 2 == 1) {

                    try {
                        wait();
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(counter + " <-ThreadNumber "+Thread.currentThread().getId()+" \n");
                
                counter++;
                
                notify();
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {
       
        N = 10;
        
        MultiThreading mt = new MultiThreading();
        
        Thread t1 = new Thread(() -> mt.printEvenNumber());

        Thread t2 = new Thread(() -> mt.printOddNumber());
        
        t1.start();
        t2.start();
    }
}