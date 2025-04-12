package carro;

public class Carro extends Veiculo{

public void ligar() {
	conferindoCombustivel();
	confereCambio();
	System.out.println("ligado");
}
private void conferindoCombustivel() {
	System.out.println("conferindo combustivel");
}
private void confereCambio() {
	System.out.println("conferindo cambio em P");
}
}
