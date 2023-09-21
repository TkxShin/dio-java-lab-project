public class NavegadorNaInternet {
    private int n = 0;  

    public void adicionarAba() {
        n++;
    }

    public void removerAba(){
        if(n != 0) {
            n--;
        }
    }

    public void exibirQntPaginas () {
        System.out.println("Quantidade de páginas no navegador: " + n);
    }

    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");;
    }

}
