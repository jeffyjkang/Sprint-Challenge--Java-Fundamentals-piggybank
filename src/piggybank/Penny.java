package piggybank;

public class Penny extends Money {
    private String name = "Penny";
    private double value = .01;
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
