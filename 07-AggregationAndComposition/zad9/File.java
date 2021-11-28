public class File
{
    private String name;
    private int size;
    
    public void displayInfo(){
        System.out.println("Filename: " + name + "\nSize: " + size + " bytes\n");
    }
    
    File(String name, int size){
        this.name = name;
        this.size = size;
    }
    
    public String getName(){
        return name;
    }
}
