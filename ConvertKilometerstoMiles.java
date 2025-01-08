import java.util.Scanner;

public class ConvertKilometerstoMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in Kilometer : ");
        int kiloMeter = sc.nextInt();
        System.out.println("Total 5Miles is = "+kiloMeter*0.621371);
    }
}