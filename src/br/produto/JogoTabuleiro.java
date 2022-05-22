/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.produto;

/**
 *
 * @author User
 */
public class JogoTabuleiro extends Produto{
   private String nome;

    public JogoTabuleiro(String nome, float preco, String fornecedor, int codigo) {
        super(preco, fornecedor, codigo);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
   
}
