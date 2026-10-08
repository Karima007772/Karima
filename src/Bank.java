public class Bank {

    private Customer[] customers;
    private int numberOfCustomers;

    public Bank(int maxCustomer) {
        customers = new Customer[maxCustomer];
        numberOfCustomers = 0;
    }

    public void addCustomer(String firstName, String lastName) {

        if (numberOfCustomers < customers.length) {
            customers[numberOfCustomers] =
                    new Customer(firstName, lastName);

            numberOfCustomers++;
        } else {
            System.out.println("Bank sudah penuh!");
        }
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }
}