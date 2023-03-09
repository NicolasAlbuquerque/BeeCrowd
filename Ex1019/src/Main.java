import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int horas;
        int min;
        int seg;
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        horas = n /3600;
        min= (n%3600)/60;
        seg= (n%3600)%60;

        System.out.println(horas+":"+min+":"+seg);

    }
}