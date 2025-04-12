import java.util.Scanner;

public class SistemaDeCadastro {
     public  static void main(String[]args) {
	   
     Scanner scanner = new Scanner(System.in);
	
     System.out.println("Digite o nome:");
     String nome = scanner.nextLine();
     
     System.out.println("Digite o cpf:");
     String cpf = scanner.nextLine();
     
     System.out.println("Digite o endereço");
     String endereco = scanner.nextLine();
     
     Pessoa pessoa= new Pessoa(cpf, nome, endereco);
     
     System.out.println(pessoa.getNome()+
    		 "\n"+pessoa.getCpf()+
    		 "\n"+pessoa.getEndereco());
}
}
