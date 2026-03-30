// Davi Augusto Domingos da Silva Alves
// RA 1261944157
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Escreva um número para a contagem: ");
        n = entrada.nextInt();
        while (n >= 0) {
            if (n == 0) {
                System.out.println("o valor de N deve ser Maior que 0");
                
            }
            else{System.out.println(n);}
            n--;
        }
        entrada.close();
    }
}
