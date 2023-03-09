import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFun;
        int horasTrab;
        double valorHoras;
        numFun=sc.nextInt();
        horasTrab=sc.nextInt();
        valorHoras= sc.nextDouble();
        double sal= horasTrab*valorHoras;

        System.out.println("NUMBER = "+ numFun);
        System.out.println(String.format("SALARY = U$ %.2f",sal));
    }
}