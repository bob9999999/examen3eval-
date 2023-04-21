package base;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PrincipalTest {

	@Test
	void testSolicitarPermiso() {
	    boolean a = Principal.solicitarPermiso(20);
        assertFalse(a);

        boolean b = Principal.solicitarPermiso(90);
        assertTrue(b);
    
	}

}
