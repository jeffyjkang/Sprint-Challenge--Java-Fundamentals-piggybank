package piggybank;

public class Quarter extends Money {
    private String name = "Quarter";
    private double value = .25;
    private double total;

    public Quarter(int quantity){
        this.quantity = quantity;
    }
    public Quarter() {
        this.quantity = 1;
    }

    @Override
    public String getName()
    {
        return name;
    }
    @Override
    public int getQuantity()
    {
        return quantity;
    }
    @Override
    public double getTotal()
    {
        return total;
    }
}
