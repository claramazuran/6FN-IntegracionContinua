package org.example;

import org.example.Entity.Alimento;
import org.example.Entity.Pato;
import org.example.Entity.TipoAlimento;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.junit.jupiter.api.Assertions.*;


public class PatoTest {

    private Pato pato;
    @Test
    public void testClasePatoExiste() {
        try {
            Class<?> clase = Class.forName("org.example.Entity.Pato");
            assertNotNull(clase, "La clase Pato debería existir");
        } catch (ClassNotFoundException e) {
            fail("No se encontró la clase Pato");
        }
    }

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

    @Test
    public void testAtributoPlumajePato() {
       try {
           assertEquals(String.class, Pato.class.getDeclaredField("plumajePato").getType());
       } catch (NoSuchFieldException e) {
            fail("No se encontró el atributo plumajePato");
        }
    }

    @Test
    public void testAtributoNombreCientificoPato() {
        try {
            assertEquals(String.class, Pato.class.getDeclaredField("nombreCientificoPato").getType());
        } catch (NoSuchFieldException e) {
            fail("No se encontró el atributo nombreCientificoPato");
        }
    }

    @Test
    public void testAtributoPesoMinPato() {
        try {
            assertEquals(Float.class, Pato.class.getDeclaredField("pesoMinPato").getType());
        } catch (NoSuchFieldException e) {
            fail("No se encontró el atributo pesoMinPato");
        }
    }

    @Test
    public void testAtributoPesoMaxPato() {
        try {
            assertEquals(Float.class, Pato.class.getDeclaredField("pesoMaxPato").getType());
        } catch (NoSuchFieldException e) {
            fail("No se encontró el atributo pesoMaxPato");
        }
    }

    @Test
    public void testAtributoIdPato() {
        try {
            assertEquals(Long.class, Pato.class.getDeclaredField("idPato").getType());
        } catch (NoSuchFieldException e) {
            fail("No se encontró el atributo idPato");
        }
    }

    @Test
    public void testClaseAlimentoExiste() {
        try {
            Class<?> clase = Class.forName("org.example.Entity.Alimento");
            assertNotNull(clase, "La clase Alimento debería existir");
        } catch (ClassNotFoundException e) {
            fail("No se encontró la clase Alimento");
        }
    }

    @Test
    public void testTipoAtributoStringParaNombreAlimento() {
        Alimento alimento = Alimento.builder().nombre("Lechuga").build();
        assertInstanceOf(String.class, alimento.getNombre(), "El nombre debería ser de tipo String");
    }

    @Test
    public void testClaseTipoAlimentoExiste() {
        try {
            Class<?> clase = Class.forName("org.example.Entity.TipoAlimento");
            assertNotNull(clase, "La clase TipoAlimento debería existir");
        } catch (ClassNotFoundException e) {
            fail("No se encontró la clase TipoAlimento");
        }
    }


}
