public class Bus extends Vehicle
{
    private int maxPeople;
    
    Bus(int maxSpeed, int maxPeople){
        super(maxSpeed);
        this.maxPeople = maxPeople;
    }
    
    public void displayInfo(){
        System.out.println("Max people capacity: " + maxPeople + "\nMax speed: " + maxSpeed + " km/h");
    }
    
    public void drive(){
        isRunning = true;
        System.out.println("The bus is now being driven.");
    }
    
    public void stopDriving(){
        isRunning = false;
        System.out.println("The bus is no longer being driven");
    }
}
