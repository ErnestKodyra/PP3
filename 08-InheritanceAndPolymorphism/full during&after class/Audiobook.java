public class Audiobook extends Book
{
    private int minutes;
    private int seconds;
    
    Audiobook(String title, String name, String city, int minutes, int seconds, int yearOfPublication, String firstName, String lastName, String genre){
        super(title, name, city, yearOfPublication, firstName, lastName, genre);
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
        System.out.println("Title: " + getTitle() + "\nDuration: " + minutes + ":" + seconds + "\nPublisher name: " + pub.getName() +
        "\nPublished in: " + pub.getCity() + "\nYear of publication: " + getYearOfPublication() + "\nAuthor name: " + writ.getFirstName()
        + writ.getLastName() + "\nGenre: " + writ.getGenre()); 
    }
    
    public static void main(String[] audiobook){
        Book one = new Book("XYZ", "Polish Books", "Kraków", 1998, "Adam", "Smith", "fantasy");
        one.display();
        Audiobook two = new Audiobook("Dune", "IDK", "San Francisco", 192, 24, 1990, "Frank", "Herbert", "sci-fi");
        two.display();
        Audiobook three = new Audiobook("not a book", "no publisher", "Kraków", 23, 10, 1829, "Ernest", "Kodyra", "thriller");
        three.display();
    }
}
