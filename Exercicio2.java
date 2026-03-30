// Davi Augusto Domingos da Silva Alves
// RA 1261944157
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        float a;
        float b;
        float c;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para ler os lados do triangulo");
        System.out.println("escreva o lado A: ");
        a = entrada.nextFloat();
        System.out.println("escreva o lado B: ");
        b = entrada.nextFloat();
        System.out.println("escreva o lado C: ");
        c = entrada.nextFloat();
        
        if (a == b && a == c) {
            System.out.println("Este é um triângulo equilátero ");
            
        }
        else if (a == b || b == c || a == c) {
            System.out.println(" Este é um triângulo Isóceles");

        }
        else {
            System.out.println(" Este é um triângulo escaleno");
        }
        entrada.close();
    }
}
