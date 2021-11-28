public class Book
{
    String name = "";
    String author = "";
    String releaseYear = "";
    String genre = "";
    String ISBN = "";
    int pageNo = 0;
    boolean hasPolishTranslation = true;
    
    void displayInfo(){
        System.out.println(name + "\nby: " + author + "\nReleased in: " + releaseYear + "\nGenre: " + genre + "\nISBN: " + ISBN + "\nno. of pages: " + pageNo);
        if(hasPolishTranslation == true){
            System.out.println("Book has a Polish translation");
        }
        else{
            System.out.println("Book doesn't have a Polish translation");
        }
    }
    
    public static void main(String[] args){
        Book bookone = new Book();
        bookone.name = "ABC";
        bookone.author = "me";
        bookone.releaseYear = "1984";
        bookone.genre = "fantasy";
        bookone.ISBN = "20192834042423";
        bookone.pageNo = 135;
        bookone.hasPolishTranslation = true;
        bookone.displayInfo();
        Book booktwo = new Book();
        booktwo.name = "XYZ";
        booktwo.author = "you";
        booktwo.releaseYear = "2020";
        booktwo.genre = "sci-fi";
        booktwo.ISBN = "69999201453211";
        booktwo.pageNo = 191;
        booktwo.hasPolishTranslation = false;
        booktwo.displayInfo();
    }
}
