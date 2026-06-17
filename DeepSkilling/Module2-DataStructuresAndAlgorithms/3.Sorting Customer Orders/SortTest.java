public class SortTest {

    public static void main(String[] args) {

        Order[] orders1 = {
                new Order(101, "Monalisa", 2500),
                new Order(102, "Rahul", 1200),
                new Order(103, "Kiran", 4500),
                new Order(104, "Sneha", 3000)
        };

        System.out.println("Bubble Sort:");

        BubbleSort.sort(orders1);

        for (Order order : orders1) {
            order.display();
        }

        Order[] orders2 = {
                new Order(101, "Monalisa", 2500),
                new Order(102, "Rahul", 1200),
                new Order(103, "Kiran", 4500),
                new Order(104, "Sneha", 3000)
        };

        System.out.println("\nQuick Sort:");

        QuickSort.sort(orders2, 0, orders2.length - 1);

        for (Order order : orders2) {
            order.display();
        }
    }
}