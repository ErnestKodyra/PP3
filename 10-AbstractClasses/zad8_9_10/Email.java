public class Email extends Message
{
    private String address;
    private String subject;
    
    Email(String text, String address, String subject){
        super(text);
        this.address = address;
        this.subject = subject;
    }
    
    public void send(){
        System.out.println("Recipient: " + address + "\nSubject: " + subject + "\nMessage: " + getText());
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getSubject(){
        return subject;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setSubject(String subject){
        this.subject = subject;
    }
    
    public static void main(String[] args){
        Email one = new Email("Click here to see", "johnkowalski@hotmail.com", "Sample text");
        System.out.println(one.charNumber());
        one.send();
        Email two = new Email("Lorem ipsum dolor sit amet", "dukenukem@interia.pl", "free memes online");
        System.out.println(two.charNumber());
        two.send();
    }
}
