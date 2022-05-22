/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yoda;
import br.desconto2.*;
import br.produto.*;


/**
 *
 * @author User
 */
public class Yoda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Produto livro1 = new LivroDigital("kindle", 2056, "Machado de Assis", 1910, "1234", "Dom Casmurro", "Editora ABC", 100f, "Fornecedor X", 123);
        Produto livro2 = new LivroFisico(500, 2, "Jorge Amado", "impresso", 1930, "1267", "Capitães de Areia", "Editora XYZ", 100f, "Zé das Couves", 126);
        Produto jogo = new JogoTabuleiro("Monopoly", 220f, "Estrela", 111);
        
        CalculadoraDesconto calcDesc = new CalculadoraDesconto();
        
        System.out.println(calcDesc.calcular(jogo));
        System.out.println(calcDesc.calcular(livro1));
        System.out.println(calcDesc.calcular(livro2));
    }
    
}
