/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.fabrica;

import factorymethod.carro.Argo;
import factorymethod.carro.Carro;
import factorymethod.carro.Cronos;
import factorymethod.interfaces.FabricaDeCarro;
import java.math.BigDecimal;

/**
 *
 * @author Alunos
 */
public class FabricaFiat implements FabricaDeCarro{

    @Override
    public Carro criarHatch(String versao, BigDecimal valor) {
        return new Argo(versao, valor);
    }

    @Override
    public Carro criarSedan(String versao, BigDecimal valor) {
        return new Cronos(versao, valor);
    
 }
}