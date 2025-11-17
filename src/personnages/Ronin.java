package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boissonFav, int argentPossede) {
		super(nom, boissonFav, argentPossede);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = argentPossede / 10;
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
	}
}
