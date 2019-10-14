package piggybank;

public abstract class Money {
    protected int quantity;

    public Money(int quantity) {
        this.quantity = quantity;
    }

    public Money() {
    }

    public abstract String getName();
    public abstract int getQuantity();
    public abstract double getTotal();
}
