package HomeWork01.EX2;

public class Decrement implements Runnable {
    Calculation calculation;

    Decrement(Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public void run() {
        for (int d = 1; d <= 5; d++) {
            calculation.decr();
        }
    }
}