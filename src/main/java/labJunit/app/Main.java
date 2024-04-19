package labJunit.app;

public class Main {

	public static void main(String[] args) {
		Calculatrice c = new Calculatrice();

		double s = c.somme(10, 20);
		System.out.println("La somme de 10 et 20 : " + s);

		double p = c.produit(10, 20);
		System.out.println("Le produit de 10 et 20 : " + p);

		CompteBancaire cb = new CompteBancaire();

		double cr = cb.crediterSolde(2);
		System.out.println("Le solde après crédit est de : " + cr);

		double d = cb.debiterSolde(5);
		System.out.println("Le solde après débit est de : " + d);

	}

}
