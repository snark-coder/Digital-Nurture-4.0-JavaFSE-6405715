package DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {
        // Mocked data - normally this would query a database
        return "Customer #" + id + " - XYZ";
    }
}

