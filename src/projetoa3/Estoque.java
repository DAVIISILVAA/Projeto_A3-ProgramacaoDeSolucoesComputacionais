package projetoa3;

import java.util.Scanner;

public class Estoque {
    
    Produto[] estoque = new Produto[1];
    int tamanhoEstoque = 0;
    int incrementaId = 1;
    
    public void Inserir(String addNome, String addDesc, float addpreco, String addCor, int addQtd){
        
        if (estoque.length == tamanhoEstoque){
            
            System.out.println("\nSem espaço, aumentando o estoque...");
            
            int novoTamanho = tamanhoEstoque * 2;
            
            Produto[] novoEstoque = new Produto[novoTamanho];
            
            for(int i = 0; i < tamanhoEstoque; i++){
                
            novoEstoque[i] = estoque[i];
            
            }
           estoque = novoEstoque;
        }
        
        Produto produto = new Produto(addNome,addDesc,addpreco,addCor,addQtd);
        produto.setId(incrementaId);
        incrementaId ++;
        
        estoque[tamanhoEstoque] = produto;
        
        tamanhoEstoque++;
        
        System.out.println("\nProduto " + produto.getNome() + " foi Adicionado com sucesso!\n");
        System.out.println("Tamanho estoque: " + estoque.length);
        
    }
    
    public void Remover(int id){
        
        int posicao = BuscarPorId(id);

        if(posicao == -1){
            System.out.println("Produto não encontrado");
        }
        else {
            for(int i = posicao; i < tamanhoEstoque - 1; i++){
                estoque[i] = estoque[i + 1];
            }
            estoque[tamanhoEstoque - 1] = null;
            tamanhoEstoque--;
            System.out.println("Produto removido com sucesso");
        }
    }
    
    public void AtualizarLista(int atuId, int escolha, String novoValor){
                 
         Produto p = estoque[BuscarPorId(atuId)];

        try{
        switch(escolha){
            case 1:
                p.setNome(novoValor);
                System.out.println("Nome atualizado com sucesso!");
            break;

            case 2: 
                p.setDescricao(novoValor);
                System.out.println("Descrição atualizada com sucesso!");
            break;

            case 3:
                Float atuPreco = Float.parseFloat(novoValor);
                p.setPreco(atuPreco);
                System.out.println("Preço atualizado com sucesso!");
            break;

            case 4:
                p.setCor(novoValor);
                System.out.println("Cor atualizada com sucesso!");
            break;

            case 5:
                int atuqtd = Integer.parseInt(novoValor);
                p.setqtdEstoque(atuqtd);
                System.out.println("Quantidade atualizada com sucesso!");
            break;

            default:
                System.out.println("Nenhuma das opções validas selecionadas.\n");
        }

        System.out.println("\nProduto " + p.getNome() + " foi atualizado com sucesso!\n");
        
        } catch (NumberFormatException e) {
        System.out.println(">>> ERRO DE FORMATO: Você digitou letras em um campo numérico!");

        } catch (IllegalArgumentException e) {
            System.out.println(">>> ERRO DE VALIDAÇÃO: " + e.getMessage());
        
        } catch (Exception e) {
            System.out.println(">>> ERRO AO ATUALIZAR.");
        }
    }
    
    public void VisualizarEstoque(){
        
        if(tamanhoEstoque == 0){
            System.out.println("Estoque está vazio.");
        }else{
            
            System.out.println("Tamanho estoque: " + estoque.length);
        
            for(int i = 0; i < tamanhoEstoque; i++){
            
            Produto p = estoque[i];
            
            System.out.println("\nÍndice [" + i + "]: ID: " + p.getId() + 
                               " | Nome: " + p.getNome() + 
                               " | Descrição: " + p.getDescricao() + 
                               " | Preço: " + p.getPreco() + 
                               " | Cor: " + p.getCor() +
                               " | Quantidade: " + p.getqtdEstoque());
            }
        }
    }
    
    public int BuscarPorId(int id) {
        
        for (int i = 0; i < tamanhoEstoque; i++) {
            if (estoque[i].getId() == id) {
                return i; 
            }
        }
        return -1; 
    }
    
}
