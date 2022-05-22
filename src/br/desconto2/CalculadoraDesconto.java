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
public class CalculadoraDesconto {
    public float calcular(Produto produto) {
        Desconto desc = new Aplicar15(new Aplicar30(new SemDesconto()));
        
        return desc.calcular(produto);
    }
}
