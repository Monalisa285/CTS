public class DecoratorTest {

    public static void main(String[] args) {

        // Base notifier (Email only)
        Notifier notifier = new EmailNotifier();

        System.out.println("=== Email Only ===");
        notifier.send("Hello User!");

        System.out.println("\n=== Email + SMS ===");
        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Hello User!");

        System.out.println("\n=== Email + SMS + Slack ===");
        Notifier fullNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()
                        )
                );

        fullNotifier.send("Hello User!");
    }
}