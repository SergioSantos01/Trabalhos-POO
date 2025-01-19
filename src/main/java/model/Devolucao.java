/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;



public class Devolucao {
    
    private Locacao locacao;
    private LocalDate dataDevolucao;
    private double multa;
    private double valorTotalFinal;
    
    private Devolucao (Locacao locacao, LocalDate dataDevolucao) {
        this.locacao = locacao;
        this.dataDevolucao = dataDevolucao;
        this.multa = locacao.calcularMulta(dataDevolucao);
        this.valorTotalFinal = locacao.calcularValorTotal() + multa;  
    }

    
    public double getMulta() {
        return multa;
    }

    
    public double getValorTotalFinal() {
        return valorTotalFinal;
    }
    
    public void alterarStatus() {
        locacao.getEquipamentos().forEach(e -> e.ajustarQuantidade(1));   
    }
}
