public abstract class Message
{
    private String text;
    
    Message(){
        text = "";
    }
    
    Message(String text){
        this.text = text;
    }
    
    public String getText(){
        return text;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    public int charNumber(){
        return text.length();
    }
    
    public abstract void send();
}
