
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o numero da sua conta: ");
        long numeroConta = scanner.nextLong();

        System.out.println("Por favor, digite o numero da sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o saldo da sua conta: "); 
        double saldo = scanner.nextDouble ();

        // Exibir mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " reais já está disponível para saque.");
        
        scanner.close();
    }
}
