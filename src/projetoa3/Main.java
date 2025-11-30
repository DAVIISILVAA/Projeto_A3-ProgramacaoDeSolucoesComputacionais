package projetoa3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        boolean continuar = true;
        
        Estoque meuEstoque = new Estoque();
  
        while(continuar == true){
            
            System.out.println("\n----------------------\n" +
                               "Escolha uma das opções:\n" +
                               "\n1 - adicionar produto" +
                               "\n2 - remover produto" +
                               "\n3 - atualizar produto" +
                               "\n4 - visualizar estoque" +
                               "\n5 - encerrar" + 
                               "\n----------------------\n"
                               );
            
            String entradaOpcao = teclado.nextLine(); 
            
            try{
            byte opcoes = Byte.parseByte(entradaOpcao);
            
            switch(opcoes){
                
                case 1:
                    try {
                    System.out.println("");
                    System.out.println("--- Adicionando Novo Produto ---");

                    System.out.print("Nome: ");
                    String addNome = teclado.nextLine();

                    System.out.print("Descrição: ");
                    String addDesc = teclado.nextLine();

                    System.out.print("Preço: ");
                    float addPreco = Float.parseFloat(teclado.nextLine());

                    System.out.print("Cor: ");
                    String addCor = teclado.nextLine();

                    System.out.print("Quantidade: ");
                    int addQtd = Integer.parseInt(teclado.nextLine());

                    meuEstoque.Inserir(addNome,addDesc,addPreco,addCor, addQtd);
                    
                    } catch (NumberFormatException e) {
                    // 1º CATCH: Captura EXCLUSIVAMENTE erros de conversão (letras em números)
                    System.out.println("\n>>> ERRO DE FORMATO: Você digitou letras em um campo numérico!");
        
                    } catch (IllegalArgumentException e) {
                        // 2º CATCH: Captura os seus "throws" da classe Produto (filtros)
                        System.out.println("\n>>> ERRO DE VALIDAÇÃO: " + e.getMessage());
                        System.out.println(">>> O produto NÃO foi cadastrado.");
    
                    } catch (Exception e) {
                        // 3º CATCH: Captura qualquer outra coisa que sobrar
                        System.out.println("\n>>> ERRO DESCONHECIDO: " + e.getMessage());
                    }
                break;
                
                case 2: 
                    
                    if (meuEstoque.tamanhoEstoque == 0) { 
                    System.out.println("Estoque vazio! Não há nada para atualizar.");
                    } else {
                        
                        System.out.println("--- Removendo produto... ---\n");
                        
                        System.out.println("Digite o Id que deseja remover");
                        int remId = Integer.parseInt(teclado.nextLine());
      
                        int indiceEncontrado = meuEstoque.BuscarPorId(remId);
                        
                        if (indiceEncontrado == -1) {
                            System.out.println("\nProduto com ID " + remId + " não existe!");
                        } else{
                        meuEstoque.Remover(remId); 
                        } 
                    }
                break;
                
                case 3:
                    
                    System.out.println("--- Atualizar Produto ---");
                    
                    if (meuEstoque.tamanhoEstoque == 0) { 
                    System.out.println("Estoque vazio! Não há nada para atualizar.");
                    } else {
                    
                        System.out.println("Digite o ID do produto que deseja atualizar: ");
                        int atuId = Integer.parseInt(teclado.nextLine());
                        
                        int indiceEncontrado = meuEstoque.BuscarPorId(atuId);

                        if (indiceEncontrado == -1) {
                            System.out.println("\nProduto com ID " + atuId + " não existe!");
                        } else {

                        System.out.println("----------------------\n" +
                                   "Escolha uma das opções:\n" +
                                   "\n1 - Nome" +
                                   "\n2 - Descrição" +
                                   "\n3 - Preço" +
                                   "\n4 - Cor" +
                                   "\n5 - Quantidade" + 
                                   "\n----------------------\n"
                                   );

                        int escolha = Integer.parseInt(teclado.nextLine());

                        String novoValor;

                        switch(escolha){

                            case 1:
                                System.out.print("Nome: ");
                                novoValor = teclado.nextLine();
                                meuEstoque.AtualizarLista(atuId, escolha, novoValor);
                            break;

                            case 2:
                                System.out.print("Descrição: ");
                                novoValor = teclado.nextLine();
                                meuEstoque.AtualizarLista(atuId, escolha, novoValor);
                            break;

                            case 3:
                                System.out.print("Preço: ");
                                novoValor = teclado.nextLine();
                                meuEstoque.AtualizarLista(atuId, escolha, novoValor);
                            break;

                            case 4:
                                System.out.print("Cor: ");
                                novoValor = teclado.nextLine();
                                meuEstoque.AtualizarLista(atuId, escolha, novoValor);
                            break;

                            case 5:
                                System.out.print("Quantidade: ");
                                novoValor = teclado.nextLine();
                                meuEstoque.AtualizarLista(atuId, escolha, novoValor);
                            break;

                            default:
                                System.out.println("Nenhuma opção valida selecionada.");
                            }
                        }
                    }    
                break;
                
                case 4: 
                    System.out.println("--- Visualizar Estoque ---\n");
                    meuEstoque.VisualizarEstoque();
                break;
                
                case 5: 
                    System.out.println("Encerrando...");
                    continuar = false;
                break;
                
                default:
                    System.out.println("Nenhuma das opções validas selecionadas.\n");
                    
            } 
            
            }catch (NumberFormatException e) {
                System.out.println("\n>>> Erro: Digite apenas números de 1 a 5!");
            }
                 
        }     
        teclado.close();       
    }       
}
