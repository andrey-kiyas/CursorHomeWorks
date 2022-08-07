package HomeWork04;

public class Select05 {
    private String categoryName;
    private double price;

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Select04{" +
                "categoryName='" + categoryName + '\'' +
                ", price=" + price +
                '}';
    }
}