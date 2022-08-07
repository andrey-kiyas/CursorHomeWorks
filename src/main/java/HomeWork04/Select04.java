package HomeWork04;

public class Select04 {
    private String productName;
    private String categoryName;
    private String brandName;
    private double price;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Select04{" +
                "productName='" + productName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", price=" + price +
                '}';
    }
}