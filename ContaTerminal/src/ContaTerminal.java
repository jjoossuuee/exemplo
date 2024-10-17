import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) {
        int conta;
        String agencia,cliente ;
        double saldo = 5317.35;

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        cliente = ler.nextLine();
        System.out.print("Digite a sua Agencia:");
        agencia = ler.nextLine();
        System.out.print("Digite o Numero da Conta:"); 
        conta = ler.nextInt();

        System.out.println("Olá " +cliente+", obrigado por criar uma conta em nosso banco. Sua agência é: " +agencia+", conta: " +conta+ ". e seu Saldo de: R$" +saldo+ " já está disponível para saque.");
        
        

    }
}