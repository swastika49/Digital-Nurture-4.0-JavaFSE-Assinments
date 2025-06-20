import java.util.*;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public void displayProduct() {
        System.out.println("ID: " + productId + ", Name: " + productName + ", Category: " + category);
    }
}

public class EcommerceSearch {
    public static int linearSearch(Product[] products, String targetName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(targetName)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String targetName) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);
            if (cmp == 0) return mid;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void sortProductsByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many products do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); // clear newline

        Product[] products = new Product[n];

        // Input each product
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1));
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();

            products[i] = new Product(id, name, category);
        }

        System.out.print("\nEnter product name to search: ");
        String target = sc.nextLine();

        //  Linear Search
        int linearResult = linearSearch(products, target);
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            products[linearResult].displayProduct();
        } else {
            System.out.println("Product not found.");
        }

        //  Sort and  Binary Search
        sortProductsByName(products);
        int binaryResult = binarySearch(products, target);
        System.out.println("\nBinary Search Result:");
        if (binaryResult != -1) {
            products[binaryResult].displayProduct();
        } else {
            System.out.println("Product not found.");
        }
    }
}
