import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência!");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o Nome da sua Agencia!");
        agencia = sc.nextLine();
        
        System.out.println("Por favor, digite o seu Nome!");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o seu Saldo!");
        saldo = sc.nextDouble();

        System.out.println("Ola "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agencia "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" ja esta disponivel para saque");
    }
}
