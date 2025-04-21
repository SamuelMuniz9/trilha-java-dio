import java.util.Scanner;

public class ContaTerminal {

    int Numero;
    String Agencia;
    String NomeCliente;
    Double Saldo;


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Conhecer e importar a classse Scanner
      
        Scanner Lendo = new Scanner (System.in); 

      
        //Exibir as mensagens para o nosso usuario e pegar os valores 
        System.out.println("Olá seja bem-vindo ao banco Digital");
        System.out.println("Por favor, digite o número da sua conta: ");
        int Numero= Lendo.nextInt();

        Lendo.nextLine(); // Consumir a quebra de linha pendente.

        System.out.println("Por favor, digite o número da sua agência: ");
        String Agencia = Lendo.next();

        Lendo.nextLine(); // Consumir a quebra de linha pendente.
        System.out.println("Por favor, digite o seu nome: ");
        String NomeCliente = Lendo.next();

        Lendo.nextLine(); // Consumir a quebra de linha pendente.
        
        System.out.println("Por favor, digite o seu saldo: ");
        Double Saldo = Lendo.nextDouble();
  

        //Exibir a mensagem conta criada com sucesso
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo de R$" + Saldo + " já está disponível para saque.");
        //Fechar o scanner
        Lendo.close();
      
    }
}
