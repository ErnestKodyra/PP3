public class Main
{
    public static void main(String[] args){
        Car car = new Car(240, "Mitsubishi");
        car.displayInfo();
        Bus bus = new Bus(100, 40);
        bus.displayInfo();
        Truck truck = new Truck(120, 5000);
        truck.displayInfo();
    }
}
