import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String nome=sc.nextLine();
       double salario=sc.nextDouble();
       double totalDeVendas=sc.nextDouble();
       double salfin= ((totalDeVendas*15)/100+salario);
        System.out.println(String.format("TOTAL = R$ %.2f",salfin));

    }
}