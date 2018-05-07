
package factorymethod.cliente;

/**
 *
 * @author Alunos
 */
public abstract class Cliente {
    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome=nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public abstract void mostrarDados();
}
