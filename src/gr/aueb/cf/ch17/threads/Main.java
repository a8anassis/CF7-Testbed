package gr.aueb.cf.ch17.threads;

public class Main {

    public static void main(String[] args) {
        WorkerThread workerThread = new WorkerThread();
        Thread thread = new Thread(workerThread);
        thread.start();

        System.out.println("Hello form main");
    }
}
