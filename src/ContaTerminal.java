import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome, agencia;
        int numeroConta;
        double saldo;

        System.out.println("Seja bem-vindo(a). Por favor informe o seu nome:\n");
        nome = scanner.nextLine();

        System.out.println("\nPor favor insira o número de sua conta:\n");
        numeroConta = scanner.nextInt();

        System.out.println("\nPor favor insira o número de sua agência:\n");
        agencia = scanner.next();

        System.out.println("\nPor favor insira o saldo que deseja depositar:\n");
        saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência" +  
        " é: " + agencia + ", conta " + numeroConta + ". Seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
