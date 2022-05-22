/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.produto;

/**
 *
 * @author User
 */
public  abstract class Livro extends Publicacao{
    private String autor;
    private int ano;
    private String isbn;

    public Livro(String autor, int ano, String isbn, String titulo, String publicadora, float preco, String fornecedor, int codigo) {
        super(titulo, publicadora, preco, fornecedor, codigo);
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    
}
