import java.util.Scanner;

public class ContaTerminal {

    private int numero;
    private float saldo;
    private String agencia; 
    private String nome_cliente;

    public ContaTerminal(int numero_conta, String agencia, String nome_cliente, float saldo){
        this.numero = numero_conta;
        this.agencia = agencia;
        this.nome_cliente = nome_cliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nome_cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
      this.agencia = agencia;
    }

    public void setNomeCliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public void setSaldo(float saldo) {
      this.saldo = saldo;
    }

    static public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Coletando os dados para a  criação do conta do cliente

        System.out.println("Por favor, digite o Numero da conta");
        int numero_conta =  scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o numero da Agencia");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente");
        String nome_cliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo da conta");
        float saldo = scanner.nextFloat();

        // Criando o cliente com as informações coletadas

        var cliente = new ContaTerminal(numero_conta, agencia, nome_cliente, saldo);

        // Encerrando o Scanner 
        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.\n", cliente.nome_cliente, cliente.agencia, cliente.numero, cliente.saldo);

    }
    
}