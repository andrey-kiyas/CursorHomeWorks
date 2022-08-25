package HomeWork01.EX2;

public class Calculation {
    private int counter = 0;

    public synchronized void incr() {
        while (counter >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        counter++;
        CounterVal();
        notify();
    }

    public synchronized void decr() {
        while (counter < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        counter--;
        CounterVal();
        notify();
    }

    public synchronized void CounterVal() {
        System.out.println("Счетчик изменен потоком \"" + Thread.currentThread().getName() + "\" на: " + counter);
    }

}