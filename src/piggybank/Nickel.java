package piggybank;

public class Nickel extends Money {
    public String name = "Nickel";
    private double value = .05;
    private double total;

    public Nickel(int quantity){
        this.quantity = quantity;
    }
    public Nickel(){
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
