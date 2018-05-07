/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class ClientePreferencial  extends Cliente{

    public ClientePreferencial(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void mostrarDados() {
        JOptionPane.showMessageDialog(null, "Cliente Preferencial Instanciado!\n Nome: "
                                  + super.getNome() + "\n Idade: " + super.getIdade());
        
      }
}