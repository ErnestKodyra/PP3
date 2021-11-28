
public class Counter
{
    int currentValue = 0;
    int initialValue = currentValue;
    
    void incrementOne(){
        ++currentValue;
    }
    void decrementOne(){
        --currentValue;
    }
    void incrementTen(){
        currentValue += 10;
    }
    void decrementTen(){
        currentValue -= 10;
    }
    void reset(){
        currentValue = initialValue;
    }
    void display(){
        System.out.println(currentValue);
    }
    
    public static void main(String[] args){
        Counter one = new Counter();
        one.display();
        one.incrementTen();
        one.incrementTen();
        one.incrementOne();
        one.incrementOne();
        one.incrementOne();
        one.display();
        Counter two = new Counter();
        two.display();
        two.decrementTen();
        two.decrementTen();
        two.decrementTen();
        two.decrementTen();
        two.decrementTen();
        two.incrementOne();
        two.incrementOne();
        two.incrementOne();
        two.display();
    }
}
