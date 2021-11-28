
public class Lamp
{
    boolean isLampOn = false;
    
    void switchOn(){
        isLampOn = true;
    }
    void switchOff(){
        isLampOn = false;
    }
    void displayInfo(){
        if(isLampOn == true){
            System.out.println("Lamp is on.");
        }
        else{
            System.out.println("Lamp is off.");
        }
    }
    
    public static void main(String[] args){
        Lamp one = new Lamp();
        Lamp two = new Lamp();
        one.switchOff();
        two.switchOn();
        one.displayInfo();
        two.displayInfo();
    }
}
