package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CompteBancaireTest {
	@Test
	void testCrediterSolde() {
		CompteBancaire cb = new CompteBancaire();
		assertEquals(12, cb.crediterSolde(2));
	}

	@Test
	void testDebiterSolde() {
		CompteBancaire cb = new CompteBancaire();
		assertEquals(8, cb.debiterSolde(2));
	}

	@Test
	void testDebiterSoldeNegatif() {
		CompteBancaire cb = new CompteBancaire();
		assertEquals(10, cb.debiterSolde(-2));
	}

	@Test
	void testCreditérSoldeNegatif() {
		CompteBancaire cb = new CompteBancaire();
		assertEquals(10, cb.crediterSolde(-2));
	}
}
