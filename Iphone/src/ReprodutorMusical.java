public class ReprodutorMusical {
    private String status;
    private String musica;


    public void play() {
        this.status = "A música está tocando...";
        System.out.println(status);
    }

    public void off() {
        this.status = "A música está pausada.";
        System.out.println(status);
    }

    public void escolherMusica(String musica) {
        this.musica = musica;
        System.out.println("A música " + this.musica + " foi selecionada.");
    }
    
}
