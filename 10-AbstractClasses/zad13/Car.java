public class Car extends Vehicle
{
    
    private String model;
    
    Car(int maxSpeed, String model){
        super(maxSpeed);
        this.model = model;
    }
    public void displayInfo(){
        System.out.println("Model: " + model + "\nMax speed: " + maxSpeed + " km/h");
    }
    public void drive(){
        isRunning = true;
        System.out.println("The car is now being driven.");
    }
    public void stopDriving(){
        isRunning = false;
        System.out.println("The car is no longer being driven.");
    }
}
