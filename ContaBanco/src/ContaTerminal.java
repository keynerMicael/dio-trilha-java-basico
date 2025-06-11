
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Ola, por favor digite o numero da Conta!");
        var conta = scanner.nextInt();
        System.out.println("Digite o numero da agência ex:(000-0)");
        var agencia = scanner.next();
        System.out.println("Digite o seu nome");
        var nome = scanner.next();
        System.out.println("Digite seu saldo");
        var saldo = scanner.nextDouble();
        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo de %s reais ja esta disponivel para saque!", nome, agencia, conta, saldo);
        scanner.close();
    }
}
