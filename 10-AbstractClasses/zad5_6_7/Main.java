public class Main
{
    public static void main(String[] args){
        Circle c = new Circle(5.0);
        Triangle t = new Triangle(3.0,6.0,8.0,4.0);
        Rectangle r = new Rectangle(2.0,10.0);
        System.out.println("Circle area: " + c.area());
        System.out.println("Triangle area: " + t.area());
        System.out.println("Rectangle area: " + r.area());
        System.out.println("Circle perimeter: " + c.perimeter());
        System.out.println("Triangle perimeter: " + t.perimeter());
        System.out.println("Rectangle perimeter: " + r.perimeter());
    }
}
