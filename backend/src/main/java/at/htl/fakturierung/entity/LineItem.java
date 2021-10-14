package at.htl.fakturierung.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;

@Entity
public class LineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @ManyToOne
    @Cascade(CascadeType.ALL)
    public Product product;
    @ManyToOne
    @Cascade(CascadeType.ALL)
    public Invoice invoice;
    public int amount;

    public LineItem() {}

    public LineItem(Long id, Product product, Invoice invoice, int amount) {
        this.id = id;
        this.product = product;
        this.invoice = invoice;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "id=" + id +
                ", product=" + product +
                ", invoice=" + invoice +
                ", amount=" + amount +
                '}';
    }
}
