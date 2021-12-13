public class Circle extends Shape
{
    double radius;
    
    double area(){
        return radius*radius*3.14159265359;
    }
    
    double perimeter(){
        return 2*radius*3.14159265359;
    }
    
    Circle(double radius){
        this.radius = radius;
    }
}
