import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chame o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();

        System.out.println("Chame o segundo: ");
        int parametroDois = sc.nextInt();

        try { 
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }


        sc.close();
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        
        if (parametroUm > parametroDois){
        throw new ParametrosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;

            System.out.println("A contagem será de " + contagem + " valores.");
            
            for (int i = 0; i <= contagem; i++) {
                System.out.println("Imprimindo o valor " + i);
            }
        }
    }
}
