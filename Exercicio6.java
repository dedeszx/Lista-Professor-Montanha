// Davi Augusto Domingos da Silva Alves
// RA 1261944157
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) throws Exception {
        int n1;
        int multiplicador = 0;
        int resultado ;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n1 = entrada.nextInt();
        while (multiplicador <= 10) {
            resultado = n1*multiplicador;
            System.out.printf("\n "+n1+"x"+multiplicador+"="+resultado);
            
            multiplicador++;
        }
        entrada.close();
    }
}
