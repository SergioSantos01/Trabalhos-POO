
package model;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class LocacaoTeste {
    
    @Test
    public void testCalcularMultaSemAtraso() {
        Equipamentos equipamento = new Equipamentos("Betoneira", "Betoneira de 400L", 150.0, 5);
        Locacao locacao = new Locacao(new Cliente("João", "12345678900", "123456789"), 
                                      List.of(equipamento),
                                      LocalDate.of(2025, 1, 10), 
                                      LocalDate.of(2025, 1, 15), 10.0);

        double multa = locacao.calcularMulta(LocalDate.of(2025, 1, 15));
        assertEquals(0.0, multa);
    }

    @Test
    public void testCalcularMultaComAtraso() {
        Equipamentos equipamento = new Equipamentos("Betoneira", "Betoneira de 400L", 150.0, 5);
        Locacao locacao = new Locacao(new Cliente("João", "12345678900", "123456789"), 
                                      List.of(equipamento),
                                      LocalDate.of(2025, 1, 10), 
                                      LocalDate.of(2025, 1, 15), 10.0);

        double multa = locacao.calcularMulta(LocalDate.of(2025, 1, 18));
        assertEquals(45.0, multa); 
    }
    
}
