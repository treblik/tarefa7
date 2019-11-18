
package registroproduto;

import java.util.Scanner;


public class RegistroProduto {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       Produto cad = new Produto();
        System.out.println("Cadastre um produto");
        System.out.println("Digite o nome do produto");
        String nome = sc.nextLine();
        System.out.println("Digite o código do produto");
        String codigo = sc.nextLine();
        System.out.println("Digite o a quantidade em estoque");
        int estoque = sc.nextInt();
        System.out.println("Digite o preço do produto");
        float preco = sc.nextFloat();
        
        cad.setNome(nome);
        cad.setCodigo(codigo);
        cad.setEstoque(estoque);
        cad.setPreco(preco);
        
        System.out.println("Nome"+cad.getNome());
        System.out.println("Codigo"+cad.getCodigo());
        System.out.println("Estoque"+cad.getEstoque());
        System.out.println("Preço"+cad.getPreco());
        
        
        
        
        
    }
    
}
