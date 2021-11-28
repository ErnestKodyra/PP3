import java.util.ArrayList;

public class Book
{
    private String title;
    private Writer author;
    private int pages;
    private boolean isOpen;
    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();
    
    Book(String title, Writer author, int pages, boolean isOpen){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isOpen = isOpen;
    }
    
    public String toString(){
        return "Title: " + title + "\nAuthor: " + author.toString() + "\nNo of pages: " + pages + "\nIs book open? " + isOpen;
    }
    
    public static void main(String[] args){
        Writer wrt = new Writer("Adam", "Kowalski", 28, 2);
        Book bk = new Book("XYZ", wrt, 420, false);
        System.out.println(bk);
    }
    
    public String getTitle(){
        return title;
    }
    
    public void addChapter(String title, int pages, int startingPageNo){
        Chapter c = new Chapter(title, pages, startingPageNo);
        chapters.add(c);
    }
    
    public void displayChapters(){
        System.out.println("Chapters:");
        for(int i = 0; i < chapters.size(); i++){
            Chapter c = chapters.get(i);
            System.out.println(c);
        }
    }
}
