public class Microwave
{
    private String model;
    private String manufacturer;
    private double price;
    private boolean hasDefrosting;
    private int maxPower;
    
    public String getModel(){
        return model;
    }
   public String getManufacturer(){
        return manufacturer;
    }
   public double getPrice(){
        return price;
    }
   public boolean getHasDefrosting(){
        return hasDefrosting;
    }
   public int getMaxPower(){
        return maxPower;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setHasDefrosting(boolean hasDefrosting){
        this.hasDefrosting = hasDefrosting;
    }
    public void setMaxPower(int maxPower){
        this.maxPower = maxPower;
    }
}
