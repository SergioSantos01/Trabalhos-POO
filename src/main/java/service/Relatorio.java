
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
                .flatMap(locacao -> locacao.getEquipamentos().stream()) 
                .collect(Collectors.groupingBy(equipamento -> equipamento.getNome(), Collectors.counting())); 
    }
    
    public static List<Cliente> gerarRelatorioMultaClientes (List<Cliente> clientes) {
        return clientes.stream()
                .filter(cliente -> cliente.getLocacoes().stream() 
                        .anyMatch(locacao -> locacao.calcularMulta(LocalDate.now()) > 0)) 
                .collect(Collectors.toList());
    } 
}


