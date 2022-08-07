package HomeWork01.EX2;

public class CalcIncrDecr {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();

        Increment increment = new Increment(calculation);
        Decrement decrement = new Decrement(calculation);

        new Thread(increment).start();
        new Thread(decrement).start();
    }
}