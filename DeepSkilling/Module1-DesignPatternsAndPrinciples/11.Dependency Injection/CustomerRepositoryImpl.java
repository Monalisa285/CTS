public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if (id == 101) {
            return "Monalisa";
        } else if (id == 102) {
            return "Rahul";
        } else {
            return "Customer Not Found";
        }
    }
}