import java.util.ArrayList;

public class Folder
{
    private String name;
    private String location;
    private ArrayList<File> files = new ArrayList<File>();
    
    Folder(String name, String location){
        this.name = name;
        this.location = location;
    }
    
    public void displayContents(){
        System.out.println("Folder name: " + name + "\nLocation on disk: " + location);
        for(int i = 0; i < files.size(); i++){
            File f = files.get(i);
            f.displayInfo();
        }
    }
    
    public void addFile(String name, int size){
        File f = new File(name, size);
        files.add(f);
    }
    
    public void removeFile(String filename){
        for(int i = 0; i < files.size(); i++){
            File f = files.get(i);
            if(f.getName() == filename){
                files.remove(f);
            }
        }
    }
    
    public static void main(String[] args){
        Folder folder = new Folder("homework","C:/Users/Ernest/");
        folder.addFile("essay.doc",59320);
        folder.addFile("presentation.pptx", 199203);
        folder.displayContents();
        folder.addFile("program.java", 10224);
        folder.displayContents();
        folder.removeFile("essay.doc");
        folder.displayContents();
    }
}
