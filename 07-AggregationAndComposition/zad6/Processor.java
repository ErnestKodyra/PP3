public class Processor
{
    private String model;
    private String architecture;
    private int price;
    private int usage;
    
    public String toString(){
        return "Model: " + model + "\nArchitecture: " + architecture + "\nPrice: " + price + "zł\nUsage: " + usage + "%";
    }
    
    public void setModel(String model){
        this.model = model;
    }
    public void setArchitecture(String architecture){
        this.architecture = architecture;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setUsage(int usage){
        this.usage = usage;
    }
}
