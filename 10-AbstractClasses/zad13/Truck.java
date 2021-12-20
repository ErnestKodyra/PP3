public class Truck extends Vehicle
{
    private int maxCargo;
    
    Truck(int maxSpeed, int maxCargo){
        super(maxSpeed);
        this.maxCargo = maxCargo;
    }
    
    public void displayInfo(){
        System.out.println("Max cargo: " + maxCargo + " kg\nMax speed: " + maxSpeed + " km/h");
    }
    
    public void drive(){
        isRunning = true;
        System.out.println("The truck is now being driven.");
    }
    
    public void stopDriving(){
        isRunning = false;
        System.out.println("The truck is no longer being driven.");
    }
}
