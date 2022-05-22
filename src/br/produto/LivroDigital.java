/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.produto;

/**
 *
 * @author User
 */
public class LivroDigital extends Livro{
    private String midia;
    private int tamanhoBytes;

    public LivroDigital(String midia, int tamanhoBytes, String autor, int ano, String isbn, String titulo, String publicadora, float preco, String fornecedor, int codigo) {
        super(autor, ano, isbn, titulo, publicadora, preco, fornecedor, codigo);
        this.midia = midia;
        this.tamanhoBytes = tamanhoBytes;
    }

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }

    public int getTamanhoBytes() {
        return tamanhoBytes;
    }

    public void setTamanhoBytes(int tamanhoBytes) {
        this.tamanhoBytes = tamanhoBytes;
    }
    
    
}
