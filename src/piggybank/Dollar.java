package piggybank;

public class Dollar extends Money {
    private String name = "Dollar";
    private double value = 1.00;
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
