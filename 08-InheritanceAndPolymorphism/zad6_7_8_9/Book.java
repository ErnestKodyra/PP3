public class Book
{
    private String title;
    private String author;
    
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void display(){
        System.out.println("Title: " + title + "\nAuthor: " + author);
    }
    
    public static void main(String[] book){
        Book one = new Book("XYZ", "Adam");
        one.display();
        Book two = new Book("ABC", "Ewa");
        two.display();
    }
}
