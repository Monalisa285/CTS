public class ProxyTest {

    public static void main(String[] args) {

        Image image1 = new ProxyImage("photo1.jpg");

        System.out.println("First call:");
        image1.display();   // loads from server

        System.out.println("\nSecond call:");
        image1.display();   // uses cache

        System.out.println("\nThird call:");
        image1.display();   // uses cache again
    }
}