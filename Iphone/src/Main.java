
import java.util.Scanner;



public class Main{
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int opção = -1;

        while(opção != 0) {

            System.out.println("==========================");
            System.out.println("1 - Tocar musica");
            System.out.println("2 - Pausar musica");
            System.out.println("3 - Selecionar musica");
            System.out.println("4 - Fazer uma ligação");
            System.out.println("5 - Atender ligação");
            System.out.println("6 - Iniciar correio de voz");
            System.out.println("7 - Exibir pagina da web");
            System.out.println("8 - Adicionar nova aba");
            System.out.println("9 - Atualizar pagina");
            System.out.println("0 - sair");
            System.out.println("==========================");
            opção = scanner.nextInt();

            switch(opção) {
                case 1: 
                iphone.tocar();
                break;
                case 2: 
                iphone.pausar();
                break;
                case 3: 
                iphone.selecionarMusica("Escape - Renascer Praise");
                break;
                case 4:
                iphone.ligar("(19)98709-4778");
                break;
                case 5:
                iphone.atender();
                break;
                case 6:
                iphone.iniciarCorreioVoz();
                break;
                case 7:
                iphone.exibirPagina("https://www.google.com");
                break;
                case 8: 
                iphone.adicionarNovaAba();
                break;
                case 9:
                iphone.atualizarPagina();
                break;
                case 0:
                System.out.println("saindo...");
                break;
                default:
                System.out.println("opção invalida");
                break;
            }
        }

    }
}
