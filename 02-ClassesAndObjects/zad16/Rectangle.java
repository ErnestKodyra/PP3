public class Rectangle
{
    int width = 0;
    int height = 0;
    
    void displayDimensions(){
        System.out.println(width + "x" + height);
    }
    void displayPerimeter(){
        System.out.println("perimeter: " + 2*(width+height));
    }
    void displaySurfaceArea(){
        System.out.println("surface area: " + width*height);
    }
    
    public static void main(String[] args){
        Rectangle one = new Rectangle();
        one.width = 3;
        one.height = 4;
        one.displayDimensions();
        one.displayPerimeter();
        one.displaySurfaceArea();
        Rectangle two = new Rectangle();
        two.width = 2;
        two.height = 7;
        two.displayDimensions();
        two.displayPerimeter();
        two.displaySurfaceArea();
    }
}
