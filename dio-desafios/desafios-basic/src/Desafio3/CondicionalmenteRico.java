package Desafio3;
import java.util.Scanner;

public class CondicionalmenteRico {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Favor entrar com o seu saldo total.");
    int saldoTotal = scanner.nextInt();

    System.out.println("Quanto deseja sacar?");
    int valorSaque = scanner.nextInt();

    if (valorSaque > saldoTotal) {
        System.out.println("Saldo insuficiente. Saque não realizado!");
    }else {
        saldoTotal -= valorSaque;
        System.out.println("Saque realizado com sucesso! Novo saldo:" + saldoTotal);
    }

    scanner.close();
  }
}

