package HomeWork04;

public class Select03 {
    private String productName;
    private String categoryName;
    private double price;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Select03{" +
                "product_name='" + productName + '\'' +
                ", category_name='" + categoryName + '\'' +
                ", price=" + price +
                '}';
    }
}