package projetoa3;

import java.util.Scanner;

public class Estoque {
    
    Produto[] estoque = new Produto[1];
    int tamanhoEstoque = 0;
    
    public void Inserir(String addNome, String addDesc, float addpreco, String addCor, float addQtd){
        
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
        
        estoque[tamanhoEstoque] = produto;
        
        tamanhoEstoque++;
        
        System.out.println("\nProduto " + produto.getNome() + " foi Adicionado com sucesso!\n");
        System.out.println("Tamanho estoque: " + estoque.length);
        
        for(int i = 0; i < tamanhoEstoque; i++){
            Produto p = estoque[i];
            
            System.out.println("Índice [" + i + "]: ID: " + p.getId() + " | Nome: " + p.getNome());
        }
     
    }
    
    public void Remover(){
    
    }
    
    public void AtualizarLista(){
        
    }
    
    public void BuscarPorId(){
    
    }
    
    public void RetornarInfo(){
    
    }
    
    public void RetornarIndice(){
    
    }  
}
