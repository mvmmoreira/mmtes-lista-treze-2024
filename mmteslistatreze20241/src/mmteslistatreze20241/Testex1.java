package mmteslistatreze20241;

import static org.junit.Assert.*;
import org.junit.Test;

class Testex1 {

	 @Test
	    public void testSetNome() {
	        usuario usuario = new usuario();
	        usuario.setNome("Marcos");
	        assertEquals("Marcos", usuario.getNome());
	    }

	    @Test
	    public void testSetCpf() {
	        usuario usuario = new usuario();
	        usuario.setCpf("12345678901");
	        assertEquals("12345678901", usuario.getCpf());
	    }

	    @Test
	    public void testSetIdade() {
	        usuario usuario = new usuario();
	        usuario.setIdade(20);
	        assertEquals(20, usuario.getIdade());
	    }

	    @Test
	    public void testValidarCPF() {
	        assertTrue(main.validarCPF("12345678901")); // CPF válido
	        assertFalse(main.validarCPF("123")); // CPF com menos de 11 dígitos

	    }
	}
