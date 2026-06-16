public class StripeGateway {

    public void makeTransaction(double amount) {
        System.out.println("Payment of $" + amount + " processed via Stripe");
    }
}