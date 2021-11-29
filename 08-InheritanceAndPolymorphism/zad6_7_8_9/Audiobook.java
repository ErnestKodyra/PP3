public class Audiobook extends Book
{
    private int minutes;
    private int seconds;
    
    Audiobook(String title, String author, int minutes, int seconds){
        super(title, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public int getMinutes(){
        return minutes;
    }
    
    public int getSeconds(){
        return seconds;
    }
    
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    
    public void setSeconds(int seconds){
        this.seconds = seconds;
    }
    
    public void display(){
        System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nDuration: " + minutes + ":" + seconds); 
    }
    
    public static void main(String[] audiobook){
        Book one = new Book("XYZ", "Adam");
        one.display();
        Audiobook two = new Audiobook("Dune", "Frank Herbert",192,24);
        two.display();
        Audiobook three = new Audiobook("not a book", "me", 23,10);
        three.display();
    }
}
