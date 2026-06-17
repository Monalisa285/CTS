import java.util.HashMap;

public class InventoryManager {

    private HashMap<Integer, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully");
    }

    public void updateProduct(int id, int quantity, double price) {

        Product product = inventory.get(id);

        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product Updated Successfully");
        } else {
            System.out.println("Product Not Found");
        }
    }

    public void deleteProduct(int id) {

        if (inventory.remove(id) != null) {
            System.out.println("Product Deleted Successfully");
        } else {
            System.out.println("Product Not Found");
        }
    }

    public void displayProducts() {

        System.out.println("\nInventory:");

        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}