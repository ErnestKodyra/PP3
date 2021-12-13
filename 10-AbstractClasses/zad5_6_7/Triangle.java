public class Triangle extends Shape
{
    double base;
    double sideA;
    double sideB;
    double height;
    
    double area(){
        return base*height*0.5;
    }
    
    double perimeter(){
        return sideA+sideB+base;
    }
    
    Triangle(double base, double sideA, double sideB, double height){
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }
}
