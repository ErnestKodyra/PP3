public class PurchasedProduct
{
    private String name;
    private String category;
    private double price;
    private boolean paidFor;
    private String shippingAddress;
    
    PurchasedProduct(String name, String category, double price, boolean paidFor, String shippingAddress){
        this.name = name;
        this.category = category;
        this.price = price;
        this.paidFor = paidFor;
        this.shippingAddress = shippingAddress;
    }
    public void displayInfo(){
        System.out.println("Name: " + name + "\nCategory: " + category + "\nPrice: " + price + "zł");
        if(paidFor==true){
            System.out.println("Has been paid for");
        }
        else System.out.println("Has not yet been paid for");
        System.out.println("Shipping address: " + shippingAddress);
    }
    public void payFor(){
        if(paidFor==true){
            System.out.println("This product has already been paid for.");
        }
        else{
            paidFor = true;
            System.out.println("This product has successfully been paid for.");
        }
    }
}
