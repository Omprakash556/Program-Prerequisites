import java.util.Scanner;

public class PerimeterofaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of a Rectangle : ");
        int length = sc.nextInt();
        System.out.println("Enter the width of a Rectangle : ");
        int width = sc.nextInt();
        System.out.println("Perimeter of a Rectangle is = "+2*(length+width));
    }
}