package piggybank;

public class Quarter extends Money {
    private String name = "Quarter";
    private double value = .25;
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
