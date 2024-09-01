import java.util.Scanner;
import java.util.InputMismatchException;

// Classe para representar a conta do cliente criada pelo terminal
public class ContaTerminal {

    private int numero_conta;
    private float saldo;
    private String agencia; 
    private String nome_cliente;

    public ContaTerminal(int numero_conta, String agencia, String nome_cliente, float saldo){
        this.numero_conta = numero_conta;
        this.agencia = agencia;
        this.nome_cliente = nome_cliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero_conta;
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

    public void setNumero(int numero_conta) {
        this.numero_conta = numero_conta;
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

        int numero_conta =  verificaInt(scanner);

        System.out.println("Por favor, digite o numero da Agencia");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente");
        String nome_cliente = scanner.nextLine();

        float saldo = verificaFloat(scanner);

        // Criando a conta com as informações coletadas

        var cliente = new ContaTerminal(numero_conta, agencia, nome_cliente, saldo);

        // Encerrando o Scanner 
        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.\n", cliente.nome_cliente, cliente.agencia, cliente.numero_conta, cliente.saldo);

    }
    
    /**
     * Verifica se a entrada fornecida pelo teclado é um numero inteiro e retorna o mesmo.
     * @param scanner leitor para entrada do teclado
     * @return numero inteiro validado pelo sistema
    */
    public static int verificaInt(Scanner scanner) {
        int numero_conta = 0;
        boolean operacao_sucesso = false;

        do {

            try {

                System.out.println("Por favor, digite o Numero da conta");
                numero_conta =  scanner.nextInt();
                operacao_sucesso = true;

            } catch (InputMismatchException erro_input) {
                System.out.println("\n[ERRO] É preciso que o campo seja preenchido com numerais. Tente novamente!\n");
            }

            scanner.nextLine();

        } while (!operacao_sucesso);

        return numero_conta;
    }

    /**
     * Verifica se a entrada fornecida pelo teclado é um numero real e retorna o mesmo.
     * @param scanner leitor para entrada do teclado
     * @return numero real validado pelo sistema
    */
    public static float verificaFloat(Scanner scanner) {
        float saldo = 0;
        boolean operacao_sucesso = false;

        do {

            try {

                System.out.println("Por favor, digite o Saldo da conta");
                saldo =  scanner.nextFloat();
                operacao_sucesso = true;

            } catch (InputMismatchException erro_input) {
                System.out.println("\n[ERRO] É preciso que o campo seja preenchido com numerais. Tente novamente!");
                System.out.println("Caso continue tendo problemas, utilize a ',' para as casas decimais.\n");
            }

            scanner.nextLine();

        } while (!operacao_sucesso);

        return saldo;
    }

}