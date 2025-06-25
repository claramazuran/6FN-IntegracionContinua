package org.example;

import org.example.Entity.Pato;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PatoTest {

    private Pato pato;

    @Test
    void testClasePatoExiste() {
        try {
            Class<?> clase = Class.forName("org.example.Entity.Pato");
            assertNotNull(clase, "La clase Pato debería existir");
        } catch (ClassNotFoundException e) {
            fail("No se encontró la clase Pato");
        }
    }

    @Test
    void testAtributoPlumajePato() {
       try {
           assertEquals(String.class, Pato.class.getDeclaredField("plumajePato").getType());
       } catch (NoSuchFieldException e) {
            fail("No se encontró el atributo plumajePato");
        }
    }

    @Test
    void testAtributoNombreCientificoPato() {
        try {
            assertEquals(String.class, Pato.class.getDeclaredField("nombreCientificoPato").getType());
        } catch (NoSuchFieldException e) {
            fail("No se encontró el atributo nombreCientificoPato");
        }
    }

    @Test
    void testAtributoPesoMinPato() {
        try {
            assertEquals(Float.class, Pato.class.getDeclaredField("pesoMinPato").getType());
        } catch (NoSuchFieldException e) {
            fail("No se encontró el atributo pesoMinPato");
        }
    }

    @Test
    void testAtributoPesoMaxPato() {
        try {
            assertEquals(Float.class, Pato.class.getDeclaredField("pesoMaxPato").getType());
        } catch (NoSuchFieldException e) {
            fail("No se encontró el atributo pesoMaxPato");
        }
    }

    @Test
    void testAtributoIdPato() {
        try {
            assertEquals(Long.class, Pato.class.getDeclaredField("idPato").getType());
        } catch (NoSuchFieldException e) {
            fail("No se encontró el atributo idPato");
        }
    }


}
