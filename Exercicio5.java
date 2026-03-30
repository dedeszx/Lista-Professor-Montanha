// Davi Augusto Domingos da Silva Alves
// RA 1261944157
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        int n1;
        int soma = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número (0 para parar): ");
        n1 = entrada.nextInt();
        while (n1 != 0) {
           soma += n1;
        System.out.println("Digite um número (0 para parar): ");
        n1 = entrada.nextInt();
            }
            System.out.println("a soma dos números é: "+soma);
    entrada.close();
        }
    
}
