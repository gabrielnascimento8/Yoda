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
public class SemDesconto extends Desconto{

    public SemDesconto() {
        super(null);
    }

    @Override
    public float efetuarCalculo(Produto produto) {
       return 0f;
    }
    
    @Override
    public boolean deveAplicar(Produto produto) {
        return true;
    }
    
}
