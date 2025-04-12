package apps;

public class Telegran extends ServicoDeMensagemInstantanea {
	@Override
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("recebido pelo telegran");
		
	}@Override
	public void enviarMensagem() {
	System.out.println("enviado pelo telegran");
		
	}
}
