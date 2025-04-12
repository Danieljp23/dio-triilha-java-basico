package apps;

public class MSNMessenger extends ServicoDeMensagemInstantanea {
@Override
public void enviarMensagem() {
	validarConectadoInternet();
	System.out.println("enviado pelo msn");
	
}
@Override
	public void receberMensagem() {
		System.out.println("recebido pelo msn");
		
	}
}