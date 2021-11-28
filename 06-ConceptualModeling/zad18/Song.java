public class Song
{
    private String name;
    private String author;
    private String genre;
    private int duration;
    private int current;
    private boolean isPlaying;
    
    Song(String name, String author, String genre, int duration){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.duration = duration;
    }
    public void displayInfo(){
        System.out.println(name + " by " + author + "\nGenre: " + genre + "\nDuration: " + duration + "s");
        if(isPlaying==true){
            System.out.println("Currently playing");
            System.out.println(current + "s/" + duration + "s");
        }
    }
    public void play(){
        if(isPlaying==true){
            return;
        }
        else{
            isPlaying = true;
            System.out.println("Now playing: " + name + " by " + author);
        }
    }
    public void pause(){
        isPlaying = false;
    }
    public void stop(){
        isPlaying = false;
        current = 0;
    }
    public void rewind(int d){
        if(d>current){
            current = 0;
        }
        else current -= d;
    }
    public void forward(int d){
        if(d+current>duration){
            current = duration;
        }
        else current += d;
    }
}
