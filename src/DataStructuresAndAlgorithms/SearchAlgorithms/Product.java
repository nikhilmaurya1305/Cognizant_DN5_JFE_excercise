package DataStructuresAndAlgorithms.SearchAlgorithms;

public class Product {
    private int productID;
    private String productName;
    private String productCategory;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }

    public Product(int productID, String productName, String productCategory) {
        this.productID = productID;
        this.productName = productName;
        this.productCategory = productCategory;
    }
}
