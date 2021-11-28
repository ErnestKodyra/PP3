public class ComputerFile
{
    private String name;
    private String location;
    private long size;
    private boolean readable;
    private boolean writable;
    
    public void displayAttributes(){
        System.out.println("Name: " + name + "\nLocation on disk: " + location + "\nSize: " + size + " bytes");
        if(readable == true && writable == false){
            System.out.println("Read only");
        }
        else if(readable == false && writable == true){
            System.out.println("Write only");
        }
        else if(readable == false && writable == false){
            System.out.println("No permission to modify");
        }
        else if(readable == true && writable == true){
            System.out.println("Fully modifiable");
        }
    }
    ComputerFile(String name, String location, long size, boolean readable, boolean writable){
        this.name = name;
        this.location = location;
        this.size = size;
        this.readable = readable;
        this.writable = writable;
    }
    public static void main(String[] args){ 
        ComputerFile myFile = new ComputerFile("presentation.pptx","C://Users/Ernest",932941,true,false);
        myFile.displayAttributes();
    }
}
