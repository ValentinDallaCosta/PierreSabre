package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	protected int argentPossede;

	public Humain(String nom, String boissonFav, int argentPossede) {
		super();
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argentPossede = argentPossede;
	}

	public String getNom() {
		return nom;
	}

	protected void parler(String texte) {
		System.out.println("[" + nom + "] - " + texte);
	}

	public String getBoissonFav() {
		return boissonFav;
	}

	public void direBonjour() {
		parler("Bonjour je m'appelle " + nom + " et j’aime boire du " + boissonFav + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix > argentPossede) {
			parler("Je n'ai plus que " + argentPossede + " sous en poche." + " Je ne peux même pas m'offrir un " + bien
					+ " à " + prix + " sous.");
		} else {
			parler("J'ai " + argentPossede + " sous en poche. " + "Je vais pouvoir m'offrir un " + bien + " à " + prix
					+ " sous");
			perdreArgent(prix);
		}

	}

	private void gagnerArgent(int gain) {
		argentPossede += gain;
	}

	private void perdreArgent(int perte) {
		argentPossede -= perte;
	}
}
