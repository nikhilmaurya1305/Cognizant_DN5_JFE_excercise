package DataStructuresAndAlgorithms.InventoryManagementSystem;

import java.util.HashMap;

public class InventoryManagement {
    private HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductID(), product);
        System.out.println("Product Added");
    }

    public void removeProduct(int productId) {
        if(inventory.remove(productId) != null){
            System.out.println("Product Removed");
        }
        else{
            System.out.println("Product Not Found");
        }
    }

    public void updateProduct(int productID, String productName,int quantity, double productPrice) {
        Product product = inventory.get(productID);

        if(product != null){
            product.setProductName(productName);
            product.setQuantity(quantity);
            product.setPrice(productPrice);
            System.out.println("Product Updated");
        }
        else{
            System.out.println("Product Not Found");
        }
    }

    public void displayProducts() {
        for(Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
