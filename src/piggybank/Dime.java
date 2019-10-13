package piggybank;

public class Dime extends Money {
    private String name = "Dime";
    private double value = .10;
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
