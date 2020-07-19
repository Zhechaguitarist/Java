package MyThreads;

public class FirstThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i < 1000){
            System.out.println("FirstThread " + i);
            i++;
        }
    }
}
