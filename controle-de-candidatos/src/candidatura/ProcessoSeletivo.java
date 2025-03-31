package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
	/*System.out.println("Processo Seletivo");
	analisarCandidato(1900.0);
	analisarCandidato(2200.0);
	analisarCandidato(2000.0);*/
	
	//selecaoDeCandidatos();
	//imprimirSelecionados();
		
		String[] candidatos = {"Felipe","Marcia",
				"Paulo","Julia","Augusto"};
		
		for(String candidato:candidatos) {
			
			entrandoEmContato(candidato);
		}
  }
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas=1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			//elas precisarão sofre alterações
			
			atendeu = atender();
			continuarTentando= !atendeu;
			
			if(continuarTentando) 
				tentativasRealizadas++;
			
			else 
				System.out.println("Contato Realizado Com Sucesso");
			
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("Conseguimos Contato Com "
		+ candidato
		+ " Na "
		+tentativasRealizadas);
		
	else		
		System.out.println("Não conseguimos realizar "
			+ "contato com "+ candidato +","
			+ " número máximo de tentativas "
			+ tentativasRealizadas);
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	
static void imprimirSelecionados() {
	
	String[] candidatos = {"Felipe","Marcia",
			"Paulo","Julia","Augusto"};
	
	for(int indice=0;indice<candidatos.length;indice++) {
		System.out.println("O candidato de n°  "+ (indice+1)+ "é o "+ candidatos[indice]);
	}
	
	System.out.println("Forma abreviada de interação for each");
	
	for(String candidato:candidatos) {
		System.out.println("O candidato selecionado foi  "+ candidato);
	}
}


	static void selecaoDeCandidatos() {
		String[]candidatos = 
			   {"Felipe","Marcia",
				"Paulo","Julia",
				"Augusto","Monica",
				"Fabricio","Mirela",
				"Daniela","Jorge"};
		
		int candidatosSelecionados=0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		while (candidatosSelecionados<5 && candidatoAtual<candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato "+ candidato +
					" solicitou este valor de salário "+
					salarioPretendido);
			
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato "+ candidato +
						" foi selecionado para a vaga");
			}
			candidatoAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
	double salarioBase = 2000.0;
	
	if(salarioBase>salarioPretendido) {
		System.out.println("Ligar para candidato");
	}else if(salarioBase==salarioPretendido) {
		System.out.println("Ligar para candidato com contra proposta");
	}else {
		System.out.println("Aguardando o resultado dos demais candidatos");
	}
}
}
