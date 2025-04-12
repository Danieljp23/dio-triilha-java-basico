
public class Pessoa {
private String nome;
private String cpf;
private String endereco;

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setEndereco(String newEndereco) {
	this.endereco = endereco;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getCpf() {
	return cpf;
}
public String getEndereco() {
	return endereco;
}

public Pessoa (String cpf, String  nome,String endereco) {
	this.cpf = cpf;
	this.nome = nome;
	this.endereco = endereco;
}

}
