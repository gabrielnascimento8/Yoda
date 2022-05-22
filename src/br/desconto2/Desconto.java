/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.desconto2;

import br.produto.Produto;

/**
 *
 * @author User
 */
public abstract class Desconto {
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }
    
    public float calcular(Produto produto) {
        if(deveAplicar(produto)) {
            return efetuarCalculo(produto);
        }
        
        return proximo.calcular(produto);
    }
    
    protected abstract float efetuarCalculo(Produto produto);
    protected abstract boolean deveAplicar(Produto produto);
}
