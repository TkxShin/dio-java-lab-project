package Desafio2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList < String > ativos = new ArrayList < > ();

        System.out.println("Entre com a quantidade de ativos:");
        int quantidadeAtivos = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < quantidadeAtivos; i++) {
        System.out.println("Qual é o ativo " + (i+1) + "?");
        String codigoAtivo = scanner.nextLine();
        ativos.add(codigoAtivo);
        }

        Collections.sort(ativos);

        for (String ordem : ativos) {
            System.out.println(ordem);
        }

        scanner.close();
    }
}
