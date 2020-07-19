package MyThreads;

public class MainThread {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        firstThread.start();
        secondThread.start();
    }
}
