/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.carro;

import java.math.BigDecimal;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Cronos extends Carro{

    public Cronos(String versao, BigDecimal valor) {
        super(versao, valor);
    }

    @Override
    public void mostrarDados() {
         NumberFormat nf = NumberFormat.getCurrencyInstance();
        JOptionPane.showMessageDialog(null, "Carro: FIAT CRONOS !\n versao: "
                                  + super.getVersao() + "\n Valor: " +nf.format(super.getValor()));
    }
    
}
