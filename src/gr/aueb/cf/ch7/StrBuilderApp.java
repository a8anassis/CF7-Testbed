package gr.aueb.cf.ch7;

public class StrBuilderApp {

    public static void main(String[] args) {
        String concatStr = "";
        long timeStart = 0L;
        long timeEnd = 0L;
        double elapsedTime = 0.0;
        double sbElapsedTime = 0.0;
        StringBuilder sb = new StringBuilder();

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 50_000; i++) {
            concatStr = concatStr + i;
        }
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;


        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 50_000; i++) {
            sb.append(i);
        }
        timeEnd = System.currentTimeMillis();
        sbElapsedTime = (timeEnd - timeStart) / 1000.0;

        System.out.println("String elapsed time: " + elapsedTime + " seconds");
        System.out.println("Sb elapsed time: " + sbElapsedTime + " seconds");
    }
}
