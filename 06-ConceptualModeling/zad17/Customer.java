public class Customer
{
    private String name;
    private String nick;
    private String address;
    private int age;
    
    Customer(String name, String nick, String address, int age){
        this.name = name;
        this.nick = nick;
        this.address = address;
        this.age = age;
    }
    
    public void displayInfo(){
        System.out.println("Full name: " + name + "\nScreen name: " + nick + "\nAddress: " + address + "\nAge: " + age);
    }
    public boolean isAdult(){
        if(age>=18){
            return true;
        }
        else return false;
    }
}
