import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Agência: ");
        String agencia = sc.nextLine();
        System.out.print("Conta: ");
        int conta = sc.nextInt();
        System.out.print("Nome do titular: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Qual o saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.println();
        System.out.println("Obrigada por utilizar nosso Banco. Os dados da sua conta são:");
        System.out.println("Agência: " + agencia + " - Conta: " + conta);
        System.out.println("Nome do titular: " + nome);
        System.out.printf("Saldo: %.2f", saldo);




    }
}
