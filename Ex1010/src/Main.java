import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo1 = sc.nextInt();
        int numPecas1=sc.nextInt();
        double valor1=sc.nextDouble();

        double item1=numPecas1*valor1;

        int codigo2 = sc.nextInt();
        int numPecas2=sc.nextInt();
        double valor2=sc.nextDouble();
        double item2=numPecas2*valor2;
        double pagar=(item1+item2);

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f",pagar));



    }
}