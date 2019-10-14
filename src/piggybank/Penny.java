package piggybank;

public class Penny extends Money {
    private String name = "Penny";
    private double value = .01;
    private double total;

    public Penny(int quantity){
        this.quantity = quantity;
    }
    public Penny(){
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
