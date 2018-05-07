/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.fabrica;

import factorymethod.carro.Carro;
import factorymethod.carro.Onix;
import factorymethod.carro.Prisma;
import factorymethod.interfaces.FabricaDeCarro;
import java.math.BigDecimal;

/**
 *
 * @author Alunos
 */
public class FabricaChevrolet implements FabricaDeCarro{

    @Override
    public Carro criarHatch(String versao, BigDecimal valor) {
        return new Onix(versao, valor);
    }

    @Override
    public Carro criarSedan(String versao, BigDecimal valor) {
        return new Prisma(versao, valor);
    }
    
}
