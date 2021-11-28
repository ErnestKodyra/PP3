import java.util.ArrayList;

public class Bookcase
{
    private ArrayList<Book> contents = new ArrayList<Book>();
    
    public void addBook(Book book){
        contents.add(book);
    }
    
    public void removeBookByTitle(String title){
        for(int i = 0; i < contents.size(); i++){
            Book b = contents.get(i);
            if(b.getTitle() == title){
                contents.remove(b);
            }
        }
    }
    
    public void displayContents(){
        System.out.println("Bookcase contents:");
        for(int i = 0; i < contents.size(); i++){
            Book b = contents.get(i);
            System.out.println(b);
            b.displayChapters();
        }
    }
    
    public static void main(String[] args){
        Writer wrt = new Writer("Adam", "Kowalski", 28, 2);
        Book bk = new Book("XYZ", wrt, 420, false);
        Bookcase bkcs = new Bookcase();
        bkcs.addBook(bk);
        bkcs.displayContents();
        bk.addChapter("Lorem Ipsum", 20, 3);
        bkcs.displayContents();
        bkcs.removeBookByTitle("XYZ");
        bkcs.displayContents();
    }
}
