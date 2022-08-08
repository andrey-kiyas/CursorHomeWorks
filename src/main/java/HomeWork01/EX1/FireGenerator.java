package HomeWork01.EX1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class FireGenerator implements Runnable {

    public BlockingQueue<String> bq;

    FireGenerator() {
        bq = new ArrayBlockingQueue<>(3);
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("- Поступил сигнал о пожаре: " + i);
                bq.put("" + i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}