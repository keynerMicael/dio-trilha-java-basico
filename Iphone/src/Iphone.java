public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando Musica...");
    }

    @Override
    public void pausar(){
        System.out.println("Musica pausada!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("chamando.. " + numero);
    }

    @Override
    public void atender(){
        System.out.println("Atendendo chamada ");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz ");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina " + url);
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Pagina atualizada!");
    }

}
