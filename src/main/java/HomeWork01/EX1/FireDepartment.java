package HomeWork01.EX1;

public class FireDepartment {
    public static void main(String[] args) {
        FireGenerator fireGenerator = new FireGenerator();
        FireMachine fireMachine = new FireMachine(fireGenerator);

        Thread fireGen = new Thread(fireGenerator);
        Thread fireMach = new Thread(fireMachine);

        fireGen.start();
        fireMach.start();
    }
}
