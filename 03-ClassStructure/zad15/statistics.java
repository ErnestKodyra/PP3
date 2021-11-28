public class statistics
{
    static void ItemNumber(int firstBoundary, int secondBoundary){
        int range = secondBoundary - firstBoundary + 1;
        System.out.println("The numbers of items in given range is " + range);
    }
    static void NumberSum(int firstBoundary, int secondBoundary){
        int current = firstBoundary;
        int sum = 0;
        while(current <= secondBoundary){
            sum +=  current;
            current += 1;
        }
        System.out.println("The sum of numbers in given range is " + sum);
    }
    static void ArithmeticMean(int firstBoundary, int secondBoundary){
        double current = firstBoundary;
        double sum = 0;
        while(current <= secondBoundary){
            sum +=  current;
            current += 1;
        }
        double range = secondBoundary - firstBoundary + 1;
        double mean = sum/range;
        System.out.println("The arithmetic mean of numbers in given range is " + mean);
    }
    
    public static void main(String[] args){
        ItemNumber(5,10);
        NumberSum(5,10);
        ArithmeticMean(5,10);
    }
}
