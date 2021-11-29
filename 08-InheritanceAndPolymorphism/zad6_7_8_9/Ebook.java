public class Ebook extends Book
{
    private String fileName;
    
    Ebook(String title, String author, String fileName){
        super(title, author);
        this.fileName = fileName;
    }
    
    public String getFileName(){
        return fileName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    
    public void display(){
        System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nFile name: " + fileName);
    }
    
    public static void main(String[] ebook){
        Book one = new Book("XYZ", "Adam");
        one.display();
        Ebook two = new Ebook("Lorem ipsum", "John", "li.txt");
        two.display();
        Ebook three = new Ebook("Sample text", "Jane", "st.doc");
        three.display();
    }
}
