public class Flashlight
{
    private boolean switchedOn = false;
    private int battery = 0;
    
    public void status(){
        if(switchedOn == true){
            System.out.println("The flashlight is on.");
        }
        else System.out.println("The flashlight is off.");
        if(battery==0){
            System.out.println("The battery is dead.");
        }
        else if(battery<=15){
            System.out.println("The battery is low. Consider charging it!");
        }
    }
    public void switchOn(){
        if(switchedOn == true){
            System.out.println("The flashlight is already on.");
        }
        else if (switchedOn == false && battery > 0){
            switchedOn = true;
            System.out.println("The flashlight has been turned on.");
        }
        else System.out.println("The battery is dead, flashlight cannot be turned on.");
    }
    public void switchOff(){
        if(switchedOn == false){
            System.out.println("The flashlight is already off.");
        }
        else{
            switchedOn = false;
            System.out.println("The flashlight has been turned off.");
        }
    }
    public void chargeBattery(int amount){
        battery += amount;
    }
    public void dischargeFully(){
        battery = 0;
    }
    public static void main(String[] args){
        Flashlight flash = new Flashlight();
        flash.status();
        flash.switchOn();
        flash.chargeBattery(13);
        flash.status();
        flash.switchOn();
        flash.status();
        flash.switchOff();
        flash.status();
    }
}
