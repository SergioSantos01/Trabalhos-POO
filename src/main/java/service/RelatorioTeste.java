
package service;

import Controler.Gestor;
import model.Cliente;
import model.Equipamentos;
import model.Locacao;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class RelatorioTeste {
    
       @Test
    public void testGerarRelatorioMaisAlugados() {
        Gestor gestor = new Gestor();
        gestor.cadastrarEquipamento("Betoneira", "Betoneira de 400L", 150.0, 5);
        gestor.cadastrarEquipamento("Compactador", "Compactador de solo", 100.0, 5);

        gestor.registrarLocacao("João Silva", "12345678900", "123456789", 
                                 List.of(gestor.getEquipamentosDisponiveis().get(0)),
                                 LocalDate.of(2025, 1, 10), 
                                 LocalDate.of(2025, 1, 12), 10.0);

        Map<String, Long> relatorio = Relatorio.gerarRelatorioEquipamentos(gestor.getLocacoes());

        assertEquals(1, relatorio.get("Betoneira"));
        assertNull(relatorio.get("Compactador"));
    }

    @Test
    public void testGerarRelatorioClientesComMultas() {
        Gestor gestor = new Gestor();
        gestor.cadastrarEquipamento("Betoneira", "Betoneira de 400L", 150.0, 5);

        gestor.registrarLocacao("João Silva", "12345678900", "123456789", 
                                 List.of(gestor.getEquipamentosDisponiveis().get(0)),
                                 LocalDate.of(2025, 1, 10), 
                                 LocalDate.of(2025, 1, 15), 10.0);

        List<Cliente> clientesComMultas = Relatorio.gerarRelatorioMultaClientes(gestor.getClientes());

        assertTrue(clientesComMultas.isEmpty());
    }
    
}
