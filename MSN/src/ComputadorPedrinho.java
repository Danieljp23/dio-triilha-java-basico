import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoDeMensagemInstantanea;
import apps.Telegran;

public class ComputadorPedrinho {

	public static void main(String[] args) {
		
ServicoDeMensagemInstantanea smi = null;

String appEscolhido = "msn";

if(appEscolhido.equals("msn")) {
	smi = new MSNMessenger();
}
else if(appEscolhido.equals("fbm")) {
	smi = new FacebookMessenger();
}
else if (appEscolhido.equals("tlg")) {
	smi = new Telegran();
}

smi.enviarMensagem();
smi.receberMensagem();
	}

}
