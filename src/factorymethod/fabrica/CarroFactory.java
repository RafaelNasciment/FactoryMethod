/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.fabrica;

import factorymethod.carro.Argo;
import factorymethod.carro.Carro;
import factorymethod.carro.Fiesta;
import factorymethod.carro.Gol;
import factorymethod.carro.Onix;
import factorymethod.constant.ModelosCarros;
import factorymethod.constant.Veiculos;
import factorymethod.interfaces.FabricaDeCarro;
import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class CarroFactory {
    //Usar enun
    public Carro criarCarro(int categoria){
        FabricaDeCarro fabrica;
        //Carro c = null ;
        if(categoria == 1){
             int modelo = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu veiculo: "
                                                      + " \n1-Argo\n2-Fiesta \n3-Gol \n4-Onix"));
      
        try {
            
        
        switch(Veiculos.getVeiculo(modelo)){
            
            case ARGO:
                fabrica  = new FabricaFiat();
               // c = fabrica.criarCarro("Drive 1.3", new BigDecimal("3000000"));
                return fabrica.criarHatch("Drive 1.3", new BigDecimal("3000000"));
                //break;
            case FIESTA:
                fabrica = new FabricaFord();
               // c = fabrica.criarCarro("SE 1.6",new BigDecimal("3500000"));
                return fabrica.criarHatch("SE 1.6",new BigDecimal("3500000"));
               //break;
            case GOL:
                fabrica = new FabricaWolkswagen();
                //c = fabrica.criarCarro("Trendline 1.0", new BigDecimal("3000000"));
                return fabrica.criarHatch("Trendline 1.0", new BigDecimal("4500000"));
                 //break;
            case ONIX:
                 fabrica = new FabricaChevrolet();
                 //c = fabrica.criarCarro("Advantage 1.4", new BigDecimal("3000000"));
                 return fabrica.criarHatch("Advantage 1.4", new BigDecimal("6400000"));
                //break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida!!!");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Opção invalida!!!");
        }
        
        
        }else if(categoria == 2){
              int modelo = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu veiculo: "
                                                      + " \n5-Prisma\n6-Virtus \n7-Fiesta sedan \n8-Cronos"));
      
        try {
            
        
        switch(Veiculos.getVeiculo(modelo)){
            
            case PRISMA:
                fabrica  = new FabricaChevrolet();
               // c = fabrica.criarCarro("Drive 1.3", new BigDecimal("3000000"));
                return fabrica.criarSedan("LTZ", new BigDecimal("6000000"));
                //break;
            case VIRTUS:
                fabrica = new FabricaWolkswagen();
               // c = fabrica.criarCarro("SE 1.6",new BigDecimal("3500000"));
                return fabrica.criarSedan("Highline 200 TSI",new BigDecimal("6500000"));
               //break;
            case FIESTASEDAN:
                fabrica = new FabricaFord();
                //c = fabrica.criarCarro("Trendline 1.0", new BigDecimal("3000000"));
                return fabrica.criarSedan("SEL 1.6", new BigDecimal("5500000"));
                 //break;
            case CRONOS:
                 fabrica = new FabricaFiat();
                 //c = fabrica.criarCarro("Advantage 1.4", new BigDecimal("3000000"));
                 return fabrica.criarHatch("Precision", new BigDecimal("6400000"));
                //break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida!!!");
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Opção invalida!!!");
        }  
                
       
        }else{
            JOptionPane.showMessageDialog(null, "Opção invalida!!!");
        } 
     return null;
    }
}
    /*
    public Carro criarCarro(int modelo){
    
        
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
        return c;
    }*/
 

