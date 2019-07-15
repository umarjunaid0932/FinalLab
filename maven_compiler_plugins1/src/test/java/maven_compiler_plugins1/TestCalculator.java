package maven_compiler_plugins1;

import static org.junit.Assert.*;

import org.junit.Test;



public class TestCalculator {

		
		
		@Test
		public void correctmax() {
			calculator c=new calculator();
			int s=c.findMax(10, 12, 14);
			assertEquals(14,s);
		}
		
		@Test
		public void incorrect() {
			calculator c=new calculator();
			int s=c.findMax(10, 12, 14);
			assertNotEquals(10,s);
		}
		
		
	

}
