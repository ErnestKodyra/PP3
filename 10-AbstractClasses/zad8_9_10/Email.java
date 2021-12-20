public class Email extends Message
{
    private User user = new User();
    private String subject;
    
    Email(String text, String address, String subject){
        super(text);
        user.email = address;
        this.subject = subject;
    }
    
    public void send(){
        System.out.println("Recipient: " + user.email + "\nSubject: " + subject + "\nMessage: " + getText());
    }
    
    public String getAddress(){
        return user.email;
    }
    
    public String getSubject(){
        return subject;
    }
    
    public void setAddress(String address){
        user.email = address;
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
