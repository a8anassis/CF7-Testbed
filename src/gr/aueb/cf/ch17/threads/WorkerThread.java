package gr.aueb.cf.ch17.threads;

public class WorkerThread implements Runnable  {

    @Override
    public void run() {

        for (int i = 1; i <= 1_000_000_000; i++) {
            if (i == 1_000_000_000) {
                System.out.println("Hello from thread!");
            }
        }
    }
}
