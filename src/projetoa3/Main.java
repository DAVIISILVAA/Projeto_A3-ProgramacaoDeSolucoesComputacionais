package projetoa3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        boolean continuar = true;
        
        Estoque meuEstoque = new Estoque();
  
        
        while(continuar == true){
            
            System.out.println("----------------------\n" +
                               "Escolha uma das opções:\n" +
                               "\n1 - adicionar produto" +
                               "\n2 - remover produto" +
                               "\n3 - atualizar produto" +
                               "\n4 - visualizar estoque" +
                               "\n5 - encerrar" + 
                               "\n----------------------\n"
                               );
            
            String entradaOpcao = teclado.nextLine(); 
            
            byte opcoes = Byte.parseByte(entradaOpcao);
            
            switch(opcoes){
                
                case 1:
                    System.out.println("");
                    System.out.println("--- Adicionando Novo Produto ---");

                    System.out.print("Nome: ");
                    String AddNome = teclado.nextLine();

                    System.out.print("Descrição: ");
                    String AddDesc = teclado.nextLine();

                    System.out.print("Preço: ");
                    float AddPreco = Float.parseFloat(teclado.nextLine());

                    System.out.print("Cor: ");
                    String AddCor = teclado.nextLine();

                    System.out.print("Quantidade: ");
                    float addQtd = Float.parseFloat(teclado.nextLine());

                    meuEstoque.Inserir(AddNome,AddDesc,AddPreco,AddCor,addQtd);
                break;
                
                case 2: 
                    System.out.println("Removendo produto\n");
                break;
                
                case 3: 
                    System.out.println("Atualizando produto\n");
                break;
                
                case 4: 
                    System.out.println("Visualizando Estoque\n");
                break;
                
                case 5: 
                    System.out.println("Encerrando...");
                    continuar = false;
                break;
                
                default:
                    System.out.println("Nenhuma das opções validas selecionadas.\n");
                    
            }        
        
        }
        
        teclado.close();
        
    }
        
}
