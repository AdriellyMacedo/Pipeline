import static org.junit.Assert.assertEquals;

import org.junit.*;

public class SubtracaoTeste {
    @Test
    public void TesteSubb() {
    	Subtracao calculator = new Subtracao();
        assertEquals(6, calculator.subtract(6, 2)); 
    }
	
}
