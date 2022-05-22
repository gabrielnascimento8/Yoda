/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.produto;

/**
 *
 * @author User
 */
public class LivroFisico extends Livro{
   private int peso;
   private int tamanho;

    public LivroFisico(int peso, int tamanho, String autor, String midia, int ano, String isbn, String titulo, String publicadora, float preco, String fornecedor, int codigo) {
        super(autor, ano, isbn, titulo, publicadora, preco, fornecedor, codigo);
        this.peso = peso;
        this.tamanho = tamanho;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
   
   
}
