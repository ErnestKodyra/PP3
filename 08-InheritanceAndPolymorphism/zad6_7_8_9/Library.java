import java.util.ArrayList;

public class Library
{
    private ArrayList<Book> contents = new ArrayList<Book>();
    
    public void addBook(Book b){
        contents.add(b);
    }
    
    public void display(){
        for(int i = 0; i < contents.size(); i++){
            Book b = contents.get(i);
            b.display();
        }
    }
    
    public static void main(String[] args){
        Book one = new Book("XYZ", "Adam");
        one.display();
        Book two = new Ebook("Lorem ipsum", "John", "li.txt");
        two.display();
        Book three = new Ebook("Sample text", "Jane", "st.doc");
        three.display();
        Book four = new Audiobook("Dune", "Frank Herbert",192,24);
        four.display();
        Book five = new Audiobook("not a book", "me", 23,10);
        five.display();
    }
}
