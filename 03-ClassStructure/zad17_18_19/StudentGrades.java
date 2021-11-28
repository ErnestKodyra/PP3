import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    double lowestGrade(){
        double min = grades[0];  
        for (int i = 0; i < grades.length; i++) {  
           if(grades[i] < min)  
               min = grades[i];
    }
        return min;
    }
    double highestGrade(){
        double max = grades[0];  
        for (int i = 0; i < grades.length; i++) {  
           if(grades[i] > max)  
               max = grades[i];
    }
        return max;
    }
    int gradeNumber(){
        return grades.length;
    }
    double averageGrade(){
        double sum = 0;
        for (int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        return (sum/grades.length);
    }
    void displayInfo(){
        System.out.println("Student name: " + studentName);
        System.out.println("Student's grades: " + Arrays.toString(grades));
        System.out.println("Number of grades: " + gradeNumber());
        System.out.println("Lowest grade: " + lowestGrade());
        System.out.println("Highest grade: " + highestGrade());
        System.out.println("Grade point average: " + averageGrade());
    }
    StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
        Random random = new Random();
        int halfOrNot;
        double tempGrade;
        double[] tempGradeArray = new double[numberOfGrades]; 
        for (int i = 0; i < numberOfGrades; i++){
            tempGrade = 2 + random.nextInt(4);
            halfOrNot = random.nextInt(2);
            if(halfOrNot == 1){
                tempGrade += 0.5;
        }
            tempGradeArray[i] = tempGrade;
        }
        this.grades = tempGradeArray;
        
    }
    StudentGrades(String name){
        this.studentName = name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many grades you want to have");
        int arraySize = scanner.nextInt();
        double tempGrade = 0.0;
        double[] tempGradeArray = new double[arraySize];
        System.out.println("Then enter the grades between 2.0 and 5.5 (separated by spaces)");
        for(int i = 0; i < arraySize; i++){
            tempGradeArray[i] = scanner.nextDouble();
        }
        scanner.close();
        this.grades = tempGradeArray;
    }
    
    public static void main(String[] args){
        double[] amandaGrades = {3.5,4.5,4.0,2.0,5.0,3.5,3.5};
        StudentGrades amanda = new StudentGrades("Amanda", amandaGrades);
        double[] jamesGrades = {2.0,3.0,2.0,4.5,4.5};
        StudentGrades james = new StudentGrades("James", jamesGrades);
        amanda.displayInfo();
        james.displayInfo();
    }
}

