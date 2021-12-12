public class Ebook extends Book
{
    private String fileName;
    
    Ebook(String title, String name, String city, String fileName, int yearOfPublication, String firstName, String lastName, String genre){
        super(title, name, city, yearOfPublication, firstName, lastName, genre);
        this.fileName = fileName;
    }
    
    public String getFileName(){
        return fileName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    
    public void display(){
        System.out.println("Title: " + getTitle() + "\nFile name: " + fileName+ "\nPublisher name: " + pub.getName() +
        "\nPublished in: " + pub.getCity() + "\nYear of publication: " + getYearOfPublication() + "\nAuthor name: " + writ.getFirstName()
        + writ.getLastName() + "\nGenre: " + writ.getGenre());
    }
    
    public static void main(String[] ebook){
        Book one = new Book("XYZ", "Polish Books", "Kraków", 1920, "Jane", "Doe", "sci-fi");
        one.display();
        Ebook two = new Ebook("Lorem ipsum", "Booksy", "London", "li.txt", 1975, "Francis", "Smith", "science");
        two.display();
        Ebook three = new Ebook("Sample text", "Bkstr", "Amsterdam", "st.doc", 1809, "Hubert", "Cornelius", "religious");
        three.display();
    }
}
