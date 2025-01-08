import java.util.Scanner;

public class AreaofaCircle {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius for a circle :");
        double radius = sc.nextDouble();
        System.out.println("Area of this circle is = "+3.14*radius*radius);
    }
}