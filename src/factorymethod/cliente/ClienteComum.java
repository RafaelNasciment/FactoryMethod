
package factorymethod.cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class ClienteComum extends Cliente {

    public ClienteComum(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void mostrarDados() {
        JOptionPane.showMessageDialog(null, "Cliente Comum Instanciado!\n Nome: "
                                  + super.getNome() + "\n Idade: " + super.getIdade());
        
        
   
    }
}
