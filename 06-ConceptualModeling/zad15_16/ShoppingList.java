import java.util.Arrays;
import java.util.Scanner;
public class ShoppingList
{
    private String[] list = {};
    
    public void displayList(){
        if(list.length == 0){
            System.out.println("Your shopping list is empty.");
        }
        else System.out.println(java.util.Arrays.toString(list));
    }
    public void displayProductNo(){
        int count = list.length;
        System.out.println("There are " + count + " products in your list.");
    }
    public void addProduct(String product){
        String[] tempArray = new String[list.length+1];
        for(int i = 0; i < list.length; i++){
            tempArray[i] = list[i];
        }
        tempArray[list.length] = product;
        list = tempArray;
    }
    public void inputAddProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your product");
        String product = scanner.nextLine();
        String[] tempArray = new String[list.length+1];
        for(int i = 0; i < list.length; i++){
            tempArray[i] = list[i];
        }
        tempArray[list.length] = product;
        list = tempArray;
    }
    public static void main(String[] args){
        ShoppingList shoplist = new ShoppingList();
        shoplist.displayList();
        shoplist.displayProductNo();
        shoplist.addProduct("Bacon");
        shoplist.addProduct("Tomato");
        shoplist.addProduct("Lettuce");
        shoplist.displayList();
        shoplist.displayProductNo();
        shoplist.addProduct("Bread");
        shoplist.displayList();
        shoplist.displayProductNo();
    }
}
