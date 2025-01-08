import java.util.Scanner;

public interface VolumeofaCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius for a Cylinder :");
        int radius = sc.nextInt();
        System.out.println("Enter height for a Cylinder :");
        int height = sc.nextInt();
        System.out.println("Volume of a Cylinder is = "+3.14*radius*radius*height);
    }
}