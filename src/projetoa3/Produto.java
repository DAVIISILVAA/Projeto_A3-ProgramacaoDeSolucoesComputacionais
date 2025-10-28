package projetoa3;

public class Produto {
    
    private int id = 0;
    private String nome;
    private String descricao;
    private float preco;
    private String cor;
    private float qtdEstoque;
    
    public Produto(){
    
    }

    public Produto(String nome, String descricao, float preco, String cor, float qtdEstoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.cor = cor;
        this.qtdEstoque = qtdEstoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getqtdEstoque() {
        return qtdEstoque;
    }

    public void setqtdEstoque(float qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
  
}
