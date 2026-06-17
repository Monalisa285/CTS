public class InventoryTest {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101,
                "Laptop",
                20,
                55000);

        Product p2 = new Product(102,
                "Mouse",
                100,
                500);

        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.displayProducts();

        manager.updateProduct(101,
                25,
                58000);

        manager.displayProducts();

        manager.deleteProduct(102);

        manager.displayProducts();
    }
}