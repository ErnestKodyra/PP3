public class Rectangle extends Shape
{
    double width;
    double height;
    
    double area(){
        return width*height;
    }
    
    double perimeter(){
        return 2*(width+height);
    }
    
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
}
