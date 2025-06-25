package org.example;

import org.example.Entity.Alimento;
import org.example.Entity.TipoAlimento;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PatoTest {

    @Test
    public void crearTipoAlimento(){

        TipoAlimento tipoAlimento = TipoAlimento.builder().nombre("Verdura").build();

        assertNotNull(tipoAlimento, "El objeto no debería ser null");
        assertEquals("Verdura", tipoAlimento.getNombre(),
                "El nombre debería ser 'Verdura'");

    }

    @Test
    public void modificarTipoAlimento(){

        TipoAlimento tipoAlimento = TipoAlimento.builder().nombre("Verdura").build();

        tipoAlimento.setNombre("Carnecita");

        assertEquals("Carnecita", tipoAlimento.getNombre(),
                "El nombre debería ser 'Carnecita'");

    }

    @Test
    public void crearAlimento(){

        TipoAlimento tipoAlimento = TipoAlimento.builder().nombre("Verdura").build();

        Alimento alimento = Alimento.builder().nombre("Lechuga").tipoAlimento(tipoAlimento).build();

        assertNotNull(alimento, "El objeto no debería ser null");
        assertEquals("Lechuga", alimento.getNombre(),
                "El nombre debería ser 'Verdura'");
        assertEquals(tipoAlimento, alimento.getTipoAlimento(),
                "El tipo de alimento debería ser 'Verdura'");

    }

}
