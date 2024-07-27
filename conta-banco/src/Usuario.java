import java.util.Locale;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Seja bem-vindo ao nosso banco.");

        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Quanto deseja depositar para ser seu saldo inicial? ");
        double saldoCliente = scanner.nextDouble();

        // Criando uma instância da classe ContaTerminal
        
        ContaTerminal minhaConta = new ContaTerminal(nomeCliente, numeroAgencia, numeroConta, saldoCliente);
    }
}
