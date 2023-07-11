import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        int conta;
        String agencia, nomeCliente;
        float saldo = 50f;

        //TODO: Exibir as mensagens para o nosso usuário
        //TODO: Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite seu nome completo !");
        nomeCliente = scanner.nextLine().toUpperCase();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        conta = scanner.nextInt();


        //TODO: Exibir a mensagem
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, conta, saldo);
    }
}