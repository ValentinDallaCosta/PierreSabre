package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	public Yakuza(String nom, String boissonFav, int argentPossede, String clan) {
		super(nom, boissonFav, argentPossede);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler("Marco, si tu tiens à la vie donne moi ta bourse !");
		int argent = victime.seFaireExtorquer();
		argentPossede += argent;
		parler("J’ai piqué les " + argent +" sous de "+victime.getNom() +", ce qui me fait "+argentPossede+" sous dans ma poche. Hi ! Hi !");
	}
}
