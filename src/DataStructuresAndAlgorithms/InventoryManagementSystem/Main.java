package DataStructuresAndAlgorithms.InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        InventoryManagement manager = new InventoryManagement();

        Product p1 = new Product(101,"iPhone",6,600000);
        Product p2 = new Product(102,"Samsung",4,300000);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.displayProducts();

        manager.updateProduct(
                101,"apple phone",7,690000
        );

        manager.displayProducts();
        manager.removeProduct(102);

        manager.displayProducts();
    }
}
