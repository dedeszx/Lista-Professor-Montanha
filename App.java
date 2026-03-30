// Davi Augusto Domingos da Silva Alves
// RA 1261944157

import java.util.Scanner ;
public class App {
    public static void main(String[] args) throws Exception {
    
    int n1;
    Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para falar se o numero é par ou impar");
        System.out.println("Digite um número inteiro: ");
        n1 =entrada.nextInt();
        if (n1%2 == 0) {
            System.out.println("O número "+n1+" é par");
        }
        else { System.out.println("O número "+n1+" é impar");}
        entrada.close();
    }
}
