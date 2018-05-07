
package factorymethod;

import factorymethod.carro.Argo;
import factorymethod.carro.Carro;
import factorymethod.carro.Fiesta;
import factorymethod.carro.Gol;
import factorymethod.carro.Onix;
import factorymethod.cliente.Cliente;
import factorymethod.constant.ModelosCarros;
import factorymethod.fabrica.CarroFactory;
import factorymethod.fabrica.ClienteFactory;
import java.math.BigDecimal;
import javax.swing.JOptionPane;


public class FactoryMethod { 
    
    public static void main(String[] args) {
      /*  
                CERTO
       String nome = JOptionPane.showInputDialog("Informe o nome do Cliente");
       int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
        
        ClienteFactory fabrica = new ClienteFactory();
        Cliente c = fabrica.criarCliente(nome, idade);
        c.mostrarDados();
       */
      
        /*
        Problema: Responsabilidades que não é desta classe
        Cliente c;
        if(idade>=65){
            c = new ClientePreferencial(nome, idade);
        }else{
            c = new ClienteComum(nome, idade);
        }
        c.mostrarDados();
       */
        /*
        Problema: Responsabilidades que não é desta classe
        int modelo = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu veiculo: "
                                                      + " \n1-Argo\n2-Fiesta \n3-Gol \n4-Onix"));
        
        Carro c = null;
        
        switch(modelo){
            case ModelosCarros.ARGO:
                c = new Argo("Drive 1.3", new BigDecimal("3000000"));
               
                break;
                
            case ModelosCarros.FIESTA:
                 c = new Fiesta("SE 1.6",new BigDecimal("3500000"));
                 
                break;
                
            case ModelosCarros.GOL:
                 c = new Gol("Trendline 1.0", new BigDecimal("3000000"));
                 
                break;
            case ModelosCarros.ONIX:
                 c = new Onix("Advantage 1.4", new BigDecimal("3000000"));
                 
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida!!!");
        }
        c.mostrarDados();
        */  
        
         int categoria = Integer.parseInt(JOptionPane.showInputDialog("Escolha a categoria do seu veiculo: "
                                                      + " \n1-HATCH \n2-SEDAN"));
         CarroFactory fabrica = new CarroFactory();
         Carro c = fabrica.criarCarro(categoria);
         c.mostrarDados();
        
         /*int modelo = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu veiculo: "
                                                      + " \n1-Argo\n2-Fiesta \n3-Gol \n4-Onix"));
         CarroFactory fabrica = new CarroFactory();
         Carro c = fabrica.criarCarro(modelo);
         c.mostrarDados();*/
         
    }
   
}
