
package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Locacao {
    
    private static int geradorcodigo = 1;
    private int codigo;
    private Cliente cliente;
    private List<Equipamentos> equipamentos;
    private LocalDate datainicio;
    private LocalDate datatermino;
    private double multadiaria;
    private double valorTotal;
    
    public Locacao (Cliente cliente, List<Equipamentos> equipamentos, LocalDate datainicio, LocalDate datatermino, double multadiaria) {
        
        this.cliente = cliente;
        this.equipamentos = equipamentos;
        this.datainicio = datainicio;
        this.datatermino = datatermino;
        this.multadiaria = multadiaria;
        this.codigo = geradorcodigo++;
        equipamentos.forEach(e -> e.ajustarQuantidade(-1));
        this.valorTotal = calcularValorTotal();
    }

    
    public int getCodigo() {
        return codigo;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

    
    public List<Equipamentos> getEquipamentos() {
        return equipamentos;
    }

   
    public LocalDate getDatainicio() {
        return datainicio;
    }

    
    public LocalDate getDatatermino() {
        return datatermino;
    }
    
    public double calcularDiasAluguel (){
        return ChronoUnit.DAYS.between(datainicio, datatermino);
    }
    
    public double calcularValorTotal () {
        return equipamentos.stream().mapToDouble(Equipamentos::getValorDiaria).sum() * calcularDiasAluguel();    
    }
    
    public double calcularMulta(LocalDate dataDevolucao){
    long diasAtraso = ChronoUnit.DAYS.between(datatermino, dataDevolucao);
    if (diasAtraso > 0){
        return equipamentos.stream()
                .mapToDouble(e -> e.getValorDiaria() * (multadiaria / 100) * diasAtraso)
                .sum();
    }
    return 0;
}

    public double getValorTotal() {
        return valorTotal;
    }
    
}

