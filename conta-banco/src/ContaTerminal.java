import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir mensagem para o usuário
        System.out.println("Por favor, digite os dados da conta:");

        //Obter pelo Scanner os valores digitados no terminal
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Número da agência: ");
        String agencia = scanner.next();

        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.next();

        double saldo = 0;

        //Exibir a mensagem conta criada
        System.out.println("Conta criada com sucesso!");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}
