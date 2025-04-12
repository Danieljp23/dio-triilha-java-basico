package apps;

public class FacebookMessenger extends ServicoDeMensagemInstantanea {
	
	
public void enviarMensagem() {
	validarConectadoInternet();
		System.out.println("enviado pelo facebookMessenger");
		
	}
	public void receberMensagem() {
		System.out.println("recebido pelo facebook messenger");
		
	}
}
