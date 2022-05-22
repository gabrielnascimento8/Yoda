/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.desconto;

import br.produto.Produto;

/**
 *
 * @author User
 */
public class Desconto15 implements Desconto{
    public float AplicarDesconto(Produto produto) {
        return produto.getPreco() * 0.15f;
    }
}
