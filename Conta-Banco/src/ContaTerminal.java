import java.util.Scanner;

import scanner.nextInt;

public class ContaTerminal {
    public static <nextString> void main(String[] args) throws Exception {
        // TODO:"conhecer e importar a classe scanner"
     
        Scanner scanner = new Scanner(System.in);      
    
        // TODO:"exibir as mensagens para o nosso usuario"
        // TODO:"obter pela scanner os valores digitados no terminal"
System.out.println("Digite seu numero:");
int numero = scanner.nextInt();

System.out.println("Digite sua agencia:");
String agencia = scanner.next();

System.out.println("Digite o nome do cliente:");
String nomeCliente = scanner.next();

double saldo= 237.48;

// TODO:"imprimir para usuario que a conta foi criada o numero da agencia e saldo da conta"

System.out.println
("Olá "+nomeCliente+
", obrigado por criar uma conta em nosso banco, sua agência é "
+agencia+", conta "+numero+" e seu saldo "+saldo+
" já etstá disponível para saque");

    }
}
