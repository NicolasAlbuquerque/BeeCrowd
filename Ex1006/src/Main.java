import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double media= ((2*a)+(3*b)+(5*c))/10;
        System.out.println(String.format("MEDIA = %.1f", media));

    }
}