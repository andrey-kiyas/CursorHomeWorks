package HomeWork01.EX2;

public class Increment implements Runnable {
    Calculation calculation;

    Increment(Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            calculation.Incr();
        }
    }
}
