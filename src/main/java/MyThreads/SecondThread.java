package MyThreads;

public class SecondThread extends Thread {
    public void run(){
        int i = 0;
        while(i < 1000){
            System.out.println("SecondThread " + i);
            i++;
        }
    }
}
