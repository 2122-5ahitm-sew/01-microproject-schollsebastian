package at.htl.fakturierung.entity;

public class Invoice {
    public Customer customer;

    public Invoice() {}

    public Invoice(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "customer=" + customer +
                '}';
    }
}
