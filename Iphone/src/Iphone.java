public class Iphone {
    public static void main(String[] args) {
        
        ReprodutorMusical musicPlayer = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorNaInternet navegador = new NavegadorNaInternet();

        musicPlayer.escolherMusica("Cosmic");
        musicPlayer.play();
        musicPlayer.off();

        System.out.println();
        telefone.Ligar("65324-5132",false);

        System.out.println();
        System.out.println("~Telefone tocando~");
        telefone.ChamadaRecebida(true);
        System.out.println("Recebi seu recado!");

        System.out.println();
        navegador.exibirQntPaginas();
        navegador.adicionarAba();
        navegador.adicionarAba();
        navegador.exibirQntPaginas();
        navegador.atualizarPagina();
        navegador.removerAba();
        navegador.exibirQntPaginas();
        navegador.exibirPagina();
    }
}
