
package Controler;

import Controler.Gestor;
import model.Equipamentos;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class GestorTeste {
    
    @Test
    public void testCadastrarEquipamento() {
        Gestor gestor = new Gestor();

        gestor.cadastrarEquipamento("Betoneira", "Betoneira de 400L", 150.0, 5);

        List<Equipamentos> equipamentos = gestor.getEquipamentosDisponiveis();

        assertEquals(1, equipamentos.size());
        assertEquals("Betoneira", equipamentos.get(0).getNome());
        assertEquals(150.0, equipamentos.get(0).getValorDiaria());
        assertTrue(equipamentos.get(0).isStatus());
    }

    @Test
    public void testCadastrarEquipamentoComQuantidadeZero() {
        Gestor gestor = new Gestor();

        gestor.cadastrarEquipamento("Compactador", "Compactador de solo", 100.0, 0);

        List<Equipamentos> equipamentos = gestor.getEquipamentosDisponiveis();

        assertTrue(equipamentos.isEmpty());
    }

    @Test
    public void testRegistrarLocacao() {
        Gestor gestor = new Gestor();

        gestor.cadastrarEquipamento("Betoneira", "Betoneira de 400L", 150.0, 5);

        gestor.registrarLocacao("João Silva", "12345678900", "123456789", 
                                 List.of(gestor.getEquipamentosDisponiveis().get(0)),
                                 java.time.LocalDate.of(2025, 1, 10),
                                 java.time.LocalDate.of(2025, 1, 15), 10.0);

        assertEquals(1, gestor.buscarLocacaoPorCpf("12345678900").size());
    }   
}

