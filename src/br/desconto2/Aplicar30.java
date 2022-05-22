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
public class Aplicar30 extends Desconto{

    public Aplicar30(Desconto proximo) {
        super(proximo);
    }
    
    
    @Override
    public float efetuarCalculo(Produto produto) {
       return produto.getPreco() * 0.30f;
    }
    
    @Override
    public boolean deveAplicar(Produto produto) {
        return produto.getClass().getSimpleName().equals("LivroDigital");
    }
    
}
