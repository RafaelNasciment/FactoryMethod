
package factorymethod.fabrica;

import factorymethod.cliente.Cliente;
import factorymethod.cliente.ClienteComum;
import factorymethod.cliente.ClientePreferencial;

/**
 *
 * @author Alunos
 */
public class ClienteFactory {
    public Cliente criarCliente(String nome, int idade) {
        Cliente c;
         if(idade>=65){
            c = new ClientePreferencial(nome, idade);
        }else{
            c = new ClienteComum(nome, idade);
        }
        return c;
    }
}
