package HomeWork01.EX1;

import java.util.concurrent.TimeUnit;

class FireMachine implements Runnable {

    FireGenerator generator;

    public FireMachine(FireGenerator generator) {
        this.generator = generator;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("+ Тушим пожар: " + generator.bq.poll(1, TimeUnit.SECONDS));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
