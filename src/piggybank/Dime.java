package piggybank;

public class Dime extends Money {
    private String name = "Dime";
    private double value = .10;
    private double total;

    public Dime(int quantity){
        this.quantity = quantity;
    }
    public Dime(){
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
