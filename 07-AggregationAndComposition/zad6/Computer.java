public class Computer
{
    private String model;
    private int memorySize;
    private boolean isOn;
    private Processor processor = new Processor();
    
    Computer(String model, int memorySize, boolean isOn, String procModel, String architecture, int price, int usage){
        this.model = model;
        this.memorySize = memorySize;
        this.isOn = isOn;
        processor.setModel(procModel);
        processor.setArchitecture(architecture);
        processor.setPrice(price);
        processor.setUsage(usage);
    }
    
    public void turnOn(){
        isOn = true;
        System.out.println("The computer has been turned on.");
    }
    
    public void turnOff(){
        isOn = false;
        System.out.println("The computer has been turned off.");
    }
    
    public String toString(){
        return "Model: " + model + "\nMemory size: " + memorySize + "MB\n Processor info:\n" + processor.toString() + "\nIs the computer on? " + isOn;  
    }
    
    public static void main(String[] args){
        Computer comp = new Computer("Packard-Bell X2300", 1024, false, "Intel Pentium 350", "x86", 900, 0);
        comp.toString();
        comp.turnOn();
        comp.toString();
    }
}
