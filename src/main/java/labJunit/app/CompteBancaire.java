package labJunit.app;

public class CompteBancaire {
	double solde = 10;

	public double debiterSolde(double montant) {
		if (montant < 0) {
			return solde;
		}
		solde -= montant;

		return solde;
	}

	public double crediterSolde(double montant) {
		if (montant < 0) {
			return solde;
		}
		solde += montant;
		return solde;
	}
}
