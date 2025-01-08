import java.util.Scanner;

public class CalculateAverageofThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Here we find average of three number ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int firstNum = sc.nextInt();
        System.out.println("Enter second number : ");
        int secondNum = sc.nextInt();
        System.out.println("Enter third number : ");
        int thirdNum = sc.nextInt();
        System.out.println("Average of this three Number is = "+(firstNum+secondNum+thirdNum)/3);
    }
}