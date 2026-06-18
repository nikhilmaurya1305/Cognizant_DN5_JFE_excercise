package DataStructuresAndAlgorithms.SearchAlgorithms;

public class Main {
    public static void main(String[] args) {
        Product[] products = {

                new Product(101,
                        "Keyboard",
                        "Electronics"),

                new Product(102,
                        "Laptop",
                        "Electronics"),

                new Product(103,
                        "Mouse",
                        "Electronics"),

                new Product(104,
                        "Phone",
                        "Electronics"),

                new Product(105,
                        "Tablet",
                        "Electronics")
        };

        Product result1 =
                SearchOperations.linearSearch(
                        products,
                        "Mouse"
                );

        System.out.println(
                "Linear Search Result:"
        );

        System.out.println(result1);

        System.out.println();

        Product result2 =
                SearchOperations.binarySearch(
                        products,
                        "Mouse"
                );

        System.out.println(
                "Binary Search Result:"
        );

        System.out.println(result2);
    }
}
