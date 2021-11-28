public class Seller
{
    private String name;
    private boolean isCompany;
    private boolean isVerified;
    private double averageRating;
    private int ratingNo;
    private int offeredProducts;
    
    Seller(String name, boolean isCompany, boolean isVerified, double averageRating, int ratingNo, int offeredProducts){
        this.name = name;
        this.isCompany = isCompany;
        this.isVerified = isVerified;
        this.averageRating = averageRating;
        this.ratingNo = ratingNo;
        this.offeredProducts = offeredProducts;
    }
    
    public void displayInfo(){
        System.out.println("Name: " + name);
        if(isCompany==true){
            System.out.println("Is a company");
        }
        if(isVerified = true){
            System.out.println("Verified");
        }
        System.out.println("Average rating: " + averageRating + " out of " + ratingNo + " reviews\nOffers " + offeredProducts + " products");
    }
    public void sendReview(int score, String message){
        if(score<1||score>5){
            System.out.println("Please submit a score from 1 to 5 and try again.");
        }
        else{
            ratingNo += 1;
            System.out.println("Thank you for your review!");
        }
    }
}
