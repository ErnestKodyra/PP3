
public class InternetDevice
{
    String name;
    boolean connected;
    static int connectedDevices = 0;
    
    InternetDevice(String name){
        this.name = name;
        connected = true;
        connectedDevices += 1;
    }
    
    void connect(){
        if(connected = false){
            connectedDevices += 1;
        }
        connected = true;
    }
    
    void disconnect(){
        if(connected == true){
            connectedDevices -= 1;
        }
        connected = false;
    }
    boolean isConnected(){
        return connected;
    }
    void displayStatus(){     
        if(connected == true){
            System.out.println("Device " + name + " is connected");
        }
        else{
            System.out.println("Device " + name + " is disconnected");
        }
    }
    static void displayConnections(){
        System.out.println("The number of connected devices is " + connectedDevices);
    }
    
    public static void main(String[] args){
        InternetDevice phone = new InternetDevice("Xiaomi Redmi Note 9");
        InternetDevice printer = new InternetDevice("Canon Printer");
        InternetDevice fridge = new InternetDevice("LG Fridge");
        InternetDevice laptop = new InternetDevice("Lenovo ideapad");
        InternetDevice tv = new InternetDevice("Sony TV");
        tv.disconnect();
        fridge.disconnect();
        phone.displayStatus();
        printer.displayStatus();
        fridge.displayStatus();
        laptop.displayStatus();
        tv.displayStatus();
        displayConnections();
    }
}
