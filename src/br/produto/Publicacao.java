/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.produto;

/**
 *
 * @author User
 */
public abstract class Publicacao extends Produto {
    
    private String titulo;
    private String publicadora;

    public Publicacao(String titulo, String publicadora, float preco, String fornecedor, int codigo) {
        super(preco, fornecedor, codigo);
        this.titulo = titulo;
        this.publicadora = publicadora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPublicadora() {
        return publicadora;
    }

    public void setPublicadora(String publicadora) {
        this.publicadora = publicadora;
    }
    
    
    
}
