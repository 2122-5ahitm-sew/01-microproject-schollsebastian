package at.htl.fakturierung.entity;

public class LineItem {
    public Product product;
    public Invoice invoice;
    public int amount;

    public LineItem() {}

    public LineItem(Product product, int amount, Invoice invoice) {
        this.product = product;
        this.amount = amount;
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "product=" + product +
                ", invoice=" + invoice +
                ", amount=" + amount +
                '}';
    }
}
