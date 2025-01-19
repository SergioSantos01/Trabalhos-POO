/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.time.LocalDate;
import model.Cliente;
import model.Locacao;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Relatorio {
    public static Map<String, Long> gerarRelatorioEquipamentos(List<Locacao> locacoes) {
        return locacoes.stream()
                .flatMap(locacao -> locacao.getEquipamentos().stream()) // Equipamentos alugados
                .collect(Collectors.groupingBy(equipamento -> equipamento.getNome(), Collectors.counting())); // Agrupa por nome
    }
    
    public static List<Cliente> gerarRelatorioMultaClientes (List<Cliente> clientes) {
        return clientes.stream()
                .filter(cliente -> cliente.getLocacoes().stream() // Locações do cliente
                        .anyMatch(locacao -> locacao.calcularMulta(LocalDate.now()) > 0)) // Verifica se há multas
                .collect(Collectors.toList());
    } 
}
