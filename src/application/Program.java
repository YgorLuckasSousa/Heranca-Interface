package application;

import entities.Circle;
import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        String color1;

        System.out.print("Cor do retângulo: ");
        color1 = sc.nextLine();
        System.out.print("Insira a altura do retângulo: ");
        double width = sc.nextDouble();
        System.out.print("Insira a largura do retângulo: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(color1, width, height);
        System.out.printf("Area do retângulo: %.2f%n", rectangle.area() );


        System.out.println();
        System.out.print("Cor do circulo: ");
        sc.nextLine();
        color1 = sc.nextLine();
        System.out.print("Raio do circulo: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(color1, radius);
        System.out.printf("Area do circulo %.2f", circle.area());












        sc.close();
    }
}
