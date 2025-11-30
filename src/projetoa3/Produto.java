package projetoa3;

public final class Produto {
    
    private int id = 0;
    private String nome;
    private String descricao;
    private float preco;
    private String cor;
    private int qtdEstoque;
    
    public Produto(){
    
    }

    public Produto(String nome, String descricao, float preco, String cor, int qtdEstoque) {
        setNome(nome);           
        setDescricao(descricao); 
        setPreco(preco);         
        setCor(cor);             
        setqtdEstoque(qtdEstoque);
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
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException ("Descrição não pode ser vazia.");
        }
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco < 0) {
            throw new IllegalArgumentException ("Preço não pode ser negativo ou zerada");
        }
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.trim().isEmpty()){
            throw new IllegalArgumentException("Cor não pode ser vazia");
        }
        this.cor = cor;
    }

    public int getqtdEstoque() {
        return qtdEstoque;
    }

    public void setqtdEstoque(int qtdEstoque) {
        if (qtdEstoque < 0){
            throw new IllegalArgumentException ("Quandidade em estoque não pode ser negativa.");
        }
        this.qtdEstoque = qtdEstoque;
    }
  
}
