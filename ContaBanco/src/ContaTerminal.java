import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO : Conhecer e importar a classe scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o número da sua agência: ");
        String agencia = sc.nextLine();
        System.out.println("Digite o número da conta:");
        int conta = sc.nextInt();
        System.out.println("Agora digite seu nome");
        sc.next();
        String nome = sc.nextLine();
        System.out.println("Digite seu saldo");
        Double saldo = sc.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma agência "+ agencia +" em nosso banco, conta " +
                conta + " e seu saldo R$"+saldo+" já está disponível para saque");

        sc.close();
    }
}
