
package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    private String nome;
    private String CPF;
    private String telefone;
    private List<Locacao> locacoes;
    
    public Cliente (String nome, String CPF, String telefone) {
        
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.locacoes = new ArrayList<>();
                
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCPF() {
        return CPF;
    }

    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    
    public String getTelefone() {
        return telefone;
    }

    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public List<Locacao> getLocacoes() {
        return locacoes;
    }
    
    public void adicionarLocacao (Locacao locacao) {
        
        this.getLocacoes().add(locacao);
        
    }
    
}

