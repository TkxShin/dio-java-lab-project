import java.util.Scanner;
public class AparelhoTelefonico {
    private boolean respostaLigacaoFeita;
    private boolean iniciarCorreioVoz;   
    private boolean respostaLigacaoRecebida;


    public void Ligar(String numero, boolean resposta) {
        this.respostaLigacaoFeita = resposta;

        System.out.println("--Fazendo ligação para " + numero + "--");
        System.out.println("--Chamando...--");
        System.out.println("--Chamando..--");
        System.out.println("--Chamando...--");

        if (respostaLigacaoFeita ==  true) {
            System.out.println("Alô!");
        }else{
            System.out.println();
            System.out.println("Ligação não atendida. Deseja iniciar o correio de voz? 'Sim' ou 'Não'?");
             Scanner sc = new Scanner(System.in);
             String escolha = sc.nextLine();
             sc.close();

             if(escolha.equalsIgnoreCase("Sim")){
                CorreioVoz(true);
             }else{
                System.out.println("--Ligação Encerada.--");
             }
        }
    }


    public void CorreioVoz(boolean resposta2) {
        this.iniciarCorreioVoz = resposta2;

        if(iniciarCorreioVoz == true) {
            System.out.println("Iniciando correio de voz...");
        }else{
            System.out.println("--Ligação Encerada.--");
        }
    }


    public void ChamadaRecebida(boolean resposta3) {
        this.respostaLigacaoRecebida = resposta3;

        if(respostaLigacaoRecebida == true) {
            System.out.println("Alô!");
        }else{
            System.out.println("--Ligação Encerada.--");
        }
    }


}
