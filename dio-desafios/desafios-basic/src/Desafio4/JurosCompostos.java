package Desafio4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
        
    System.out.println("Qual o seu valor de depósito para rendimento?");
    double valorInicial = scanner.nextDouble();
        
    System.out.println("Qual a taxa de juros?");
    double taxaJuros = scanner.nextDouble();

    taxaJuros /= 100;
        
    System.out.println("Quanto tempo deixará aplicado em anos?");
    int periodo = scanner.nextInt();
     
    double valorFinal = valorInicial * (Math.pow(1 + taxaJuros,periodo));

    System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
    scanner.close();

    }
}
