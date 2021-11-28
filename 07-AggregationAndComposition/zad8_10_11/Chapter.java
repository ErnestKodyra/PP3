public class Chapter
{
    private String title;
    private int pages;
    private int startingPageNo;
    
    Chapter(String title, int pages, int startingPageNo){
        this.title = title;
        this.pages = pages;
        this.startingPageNo = startingPageNo;
    }
    
    public String toString(){
        return "Chapter title: " + title + "\nPages: " + pages + "\nStarting page number: " + startingPageNo;
    }
}
