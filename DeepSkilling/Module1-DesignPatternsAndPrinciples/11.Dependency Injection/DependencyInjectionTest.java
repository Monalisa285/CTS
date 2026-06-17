public class DependencyInjectionTest {

    public static void main(String[] args) {

        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerService(repository);

        System.out.println(
                "Customer Name: "
                + service.getCustomerById(101)
        );

        System.out.println(
                "Customer Name: "
                + service.getCustomerById(102)
        );

        System.out.println(
                "Customer Name: "
                + service.getCustomerById(103)
        );
    }
}