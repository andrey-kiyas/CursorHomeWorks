package HomeWork04;

public class Select02 {
    private int modelYear;
    private int modelYearQTY;

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setModelYearQTY(int modelYearQTY) {
        this.modelYearQTY = modelYearQTY;
    }

    @Override
    public String toString() {
        return "Select02{" +
                "modelYear=" + modelYear +
                ", modelQTY=" + modelYearQTY +
                '}';
    }
}