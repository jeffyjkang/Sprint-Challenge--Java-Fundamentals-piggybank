package piggybank;

public class Dollar extends Money {
    private String name = "Dollar";
    private double value = 1.00;
    private double total;

    public Dollar(int quantity){
        this.quantity = quantity;
    }
    public Dollar(){
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
