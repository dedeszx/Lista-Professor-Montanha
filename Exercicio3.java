// Davi Augusto Domingos da Silva Alves
// RA 1261944157
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) throws Exception {
    double a;
    double b;
    double resultado;
    int operacao;
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Calculadora com switch case");
       System.out.println("Escreva o primeiro nùmero: ");
       a = entrada.nextDouble();
       System.out.println("Escreva o segundo número: ");
       b = entrada.nextDouble();
       System.out.println("Escolha a operação desejada: 1-adição 2-subtração 3-mutiplicação 4-divisão");
       operacao = entrada.nextInt();
      switch (operacao) {
        case 1: 
            resultado = a + b ; 
            System.out.println("Adição: "+ resultado);
            
            break;
      
        case 2: 
          resultado = a - b ;
         System.out.println("Subtração: "+resultado);
            break;
            case 3 :
            resultado = a*b ;
            System.out.println("Multiplicação: "+resultado);
            break;
            case 4: 
            resultado = a/b ;
            System.out.printf("Divisão: %.2f%n",resultado);
            default :
            System.out.println("Não é possível realizar a operação desejada, ERROR !!!!!!!");
            break;
            
      }
      entrada.close();
    }
}
