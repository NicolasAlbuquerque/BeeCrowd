import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        double pi = 3.14159;
        r=sc.nextDouble();
        double volume= (4/3.0)*pi*Math.pow(r,3);
        System.out.println(String.format("VOLUME = %.3f",volume));


    }
}