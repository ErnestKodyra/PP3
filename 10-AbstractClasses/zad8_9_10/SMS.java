public class SMS extends Message
{
    private String phoneNo;
    
    SMS(String text, String phoneNo){
        super(text);
        this.phoneNo = phoneNo;
    }
    
    public void send(){
        System.out.println("Recipient: " + phoneNo + "\nMessage: " + getText());
    }
    
    public String getPhoneNo(){
        return phoneNo;
    }
    
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
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
