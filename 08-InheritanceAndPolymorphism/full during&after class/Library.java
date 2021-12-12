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
        Book one = new Book("XYZ", "Polish Books", "Kraków", 1998, "Adam", "Smith", "fantasy");
        one.display();
        Book two = new Ebook("Lorem ipsum", "S.I.D. Publishing" ,"Kraków", "li.txt", 1889, "John", "Doe", "science");
        two.display();
        Book three = new Ebook("Sample text", "J.S. Publishing", "Kraków", "st.doc", 1729, "Jane", "Doe", "religious");
        three.display();
        Book four = new Audiobook("Dune", "IDK", "San Francisco", 192, 24, 2001, "Frank", "Herbert", "sci-fi");
        four.display();
        Book five = new Audiobook("not a book", "no publisher", "Kraków", 23, 10, 2021, "Ernest", "Kodyra", "thriller");
        five.display();
    }
}
