package projetoa3;

public class Produto {

    private static int incremental = 0;
    private int id = incremental++;
    private String nome;
    private String descricao;
    private float preco;
    private String cor;
    private int qtdEstoque;
    
    public Produto(){
    
    }

    public Produto(String nome, String descricao, float preco, String cor, int qtdEstoque) {
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
        if (id <0){
            throw new illegalArgumentException ("ID deve ser maior que zero.");
        }
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw nre IllegalArgumentException("Nome não pode ser vazio.")
        }
        this.nome = nome;
    }

    public String getDescricao() {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException ("Descrição não pode ser vazia.");
        }
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco < 0) {
            throw illegalArgumentException ("Preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.trim().isEmpty()){
            throw new illegalArgumentException("Cor não pode ser vazia");
        }
        this.cor = cor;
    }

    public int getqtdEstoque() {
        return qtdEstoque;
    }

    public void setqtdEstoque(int qtdEstoque) {
        if (qtdEstoque < 0){
            throw illegalArgumentException ("Quandidade em estoque não pode ser negativa.");
        }
        this.qtdEstoque = qtdEstoque;
    }
  
}
