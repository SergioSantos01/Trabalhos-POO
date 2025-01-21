
package model;

public class Equipamentos {
    
    private static int codigoGenerator = 1; 
    private int codigo;
    private String nome;
    private String  descricao;
    private double valorDiaria;
    private boolean status;
    private int quantidade;
    
    public Equipamentos (String nome, String descricao, double valorDiaria, int quantidade){
        
        this.codigo = codigoGenerator++ ;
        this.nome = nome;
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
        this.status = quantidade > 0;
        this.quantidade = quantidade;
    }

    
    public int getCodigo() {
        return codigo;
    }

   
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

   
    public double getValorDiaria() {
        return valorDiaria;
    }

    
    public void setValorDiaria(int valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    
    public boolean isStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }

    
    public int getQuantidade() {
        return quantidade;
    }

   
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
  
    public void ajustarQuantidade (int ajuste) {
        this.quantidade += ajuste;
        this.status = quantidade > 0;
    }
    
}

