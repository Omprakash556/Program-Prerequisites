import java.util.Scanner;

public class CelsiustoFahrenheitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius :");
        int Celsius = sc.nextInt();
        System.out.println("Fahrenheit is :"+(Celsius * 9/5) + 32.);
    }
}