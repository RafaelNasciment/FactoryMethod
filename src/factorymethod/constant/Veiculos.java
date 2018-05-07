/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.constant;

/**
 *
 * @author Alunos
 */
public enum Veiculos {
    ARGO(1),FIESTA(2), GOL(3), ONIX(4), PRISMA(5), VIRTUS(6), FIESTASEDAN(7), CRONOS(8);
    
    private int valor;
    private Veiculos(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }
    public static Veiculos getVeiculo(int valor){
        for (Veiculos v : Veiculos.values()) {
            if(v.getValor()==valor){
                return v;
            }
        }
        return null;
    }
}
