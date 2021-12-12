public class Book
{
    private String title;
    protected Publisher pub;
    private int yearOfPublication;
    protected Writer writ;
    
    Book(String title, String name, String city, int yearOfPublication, String firstName, String lastName, String genre){
        this.title = title;
        pub = new Publisher(name, city);
        this.yearOfPublication = yearOfPublication;
        writ = new Writer(firstName, lastName, genre);
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getYearOfPublication(){
        return yearOfPublication;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }
    
    public void display(){
        System.out.println("Title: " + title + "\nPublisher name: " + pub.getName() + "\nPublished in: " +
        pub.getCity() + "\nYear of publication: " + yearOfPublication + "\nAuthor name: " + writ.getFirstName()
        + writ.getLastName() + "\nGenre: " + writ.getGenre());
    }
    
    public static void main(String[] book){
        Book one = new Book("XYZ", "Polish Books", "Kraków", 2020, "Adam", "Nowak", "science");
        one.display();
        Book two = new Book("ABC", "PubPol", "Warszawa", 2000, "Arnold", "Kowalski", "fantasy");
        two.display();
    }
}
