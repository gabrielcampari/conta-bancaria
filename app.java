import java.util.Scanner;

public class contabancaria {
    public contabancaria() {
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Gabriel Campari";
        String conta = "Corrente";
        double saldo = 2500.0;
        int opcao = 0;
        System.out.println("*************************");
        System.out.println("DADOS D0 CLIENTE:");
        System.out.println("NOME: " + nome);
        System.out.println("TIPO CONTA: " + conta);
        System.out.println("SALDO INICIAL: R$ " + saldo);
        System.out.println("*************************");
        String operacoes = "\nOperações: \n\n1 - Consultar Saldo\n2 - Depositar valores\n3 - Transferir valores\n4 - Sair\n";
        System.out.println(operacoes);

        while(opcao != 4) {
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("\nSeu saldo atual é de: " + saldo);
            } else {
                double transferir;
                if (opcao == 2) {
                    System.out.println("\nQuanto deseja depositar em sua conta atual:  ");
                    transferir = leitura.nextDouble();
                    saldo += transferir;
                    System.out.println("\nSeu novo saldo atual é de: " + saldo);
                } else if (opcao == 3) {
                    System.out.println("\nQuanto deseja tranferir de sua conta: ");
                    transferir = leitura.nextDouble();
                    if (transferir > saldo) {
                        System.out.println("Não é possível concluir a operação por saldo insuficiente!");
                    } else {
                        saldo -= transferir;
                        System.out.println("\nSeu novo saldo atual é de: " + saldo);
                    }
                } else if (opcao != 4) {
                    System.out.println("Opção inválida!");
                }
            }
        }

    }
}
