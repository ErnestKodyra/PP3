public class Product
{
    private String name;
    private boolean vegetarian;

    public void setName(String name){
        this.name = name;
    }
    public void setVegetarian(boolean vegetarian){
        this.vegetarian = vegetarian;
    }
    public String getName(){
        return name;
    }
    public boolean getVegetarian(){
        return vegetarian;
    }
    public static void main(String[] args){
        Product l = new Product();
        l.setName("Lettuce");
        l.setVegetarian(true);
        System.out.println(l.getName());
    }
}
