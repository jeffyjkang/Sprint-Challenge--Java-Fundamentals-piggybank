package piggybank;

public class Nickel extends Money {
    public String name = "Nickel";
    private double value = .05;
    private int quantity = 1;
    private double total;

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
