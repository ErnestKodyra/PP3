public abstract class Vehicle
{
    protected int maxSpeed;
    protected boolean isRunning;
    
    abstract void displayInfo();
    abstract void drive();
    abstract void stopDriving();
    
    Vehicle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
}
