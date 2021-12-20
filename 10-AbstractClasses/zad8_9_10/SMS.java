public class SMS extends Message
{
    private User user = new User();
    
    SMS(String text, String phoneNo){
        super(text);
        user.phoneNo = phoneNo;
    }
    
    public void send(){
        System.out.println("Recipient: " + user.phoneNo + "\nMessage: " + getText());
    }
    
    public String getPhoneNo(){
        return user.phoneNo;
    }
    
    public void setPhoneNo(String phoneNo){
        user.phoneNo = phoneNo;
    }
    
    public static void main(String[] args){
    SMS one = new SMS("Hello world!","910228492");
    System.out.println(one.charNumber());
    one.send();
    SMS two = new SMS("Sample text lorem ipsum", "509165537");
    System.out.println(two.charNumber());
    two.send();
    }
}
