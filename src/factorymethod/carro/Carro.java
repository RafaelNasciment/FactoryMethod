/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.carro;

import java.math.BigDecimal;

/**
 *
 * @author Alunos
 */
public abstract class Carro {
    private String versao;
    private BigDecimal valor;

    public Carro(String versao, BigDecimal valor) {
        this.versao = versao;
        this.valor = valor;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public abstract void mostrarDados();
}
