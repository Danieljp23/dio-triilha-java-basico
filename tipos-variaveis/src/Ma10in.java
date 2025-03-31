// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  
import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        System.out.println("Digite o valor do saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        // Entrada das três transações
        System.out.println("Digite o valor da primeira transação (negativo para saque, positivo para depósito):");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o valor da segunda transação:");
        double valor2 = scanner.nextDouble();

        System.out.println("Digite o valor da terceira transação:");
        double valor3 = scanner.nextDouble();

        // Cálculo do saldo final
        saldoInicial += valor1 + valor2 + valor3;

        // Exibição do saldo final
        System.out.printf("Saldo final: %.2f\n", saldoInicial);

        scanner.close();
    }
}