package equipamentos;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
 
   public void imprimir() {
       System.out.println("imprimindo via equipamento multifuncional");
   }

   public void copiar() {
       System.out.println("copiando via equipemaneot multifuncional");
   }
  
   public void digitalizar() {
       System.out.println("digitalizando via equipamento multifuncional");
   }
}
