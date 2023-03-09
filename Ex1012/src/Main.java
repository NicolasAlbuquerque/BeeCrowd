import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a,b,c;
        double triangulo,circulo,trapezio,quadrado,retangulo;
        a=read.nextDouble();
        b= read.nextDouble();
        c=read.nextDouble();

       triangulo=(a*c)/2;
       circulo =3.14159*(c*c);
       trapezio=((a+b)*c)/2;
       quadrado=b*b;
       retangulo=a*b;
        System.out.println(String.format("TRIANGULO: %.3f",triangulo));
        System.out.println(String.format("CIRCULO : %.3f",circulo));
        System.out.println(String.format("TRAPEZIO : %.3f",trapezio));
        System.out.println(String.format("QUADRADO: %.3f",quadrado));
        System.out.println(String.format("RETANGULO: %.3f",retangulo));

    }
}