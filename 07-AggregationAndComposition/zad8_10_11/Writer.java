public class Writer
{
    private String name;
    private String surname;
    private int age;
    private int writtenBooks;
    
    Writer(String name, String surname, int age, int writtenBooks){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.writtenBooks = writtenBooks;
    }
    
    public String toString(){
        return "Full name: " + name + " " + surname + "\nAge: " + age + "\nNumber of books written: " + writtenBooks;
    }
}
