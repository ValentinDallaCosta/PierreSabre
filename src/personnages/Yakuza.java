package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 4;
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
	
	public int perdre() {
		int perte = argentPossede;
		argentPossede = 0;
		reputation --;
		parler("J’ai perdu mon duel et mes " + perte +" sous, snif . J'ai déshonoré le clan de "+clan+". ");
		return perte;
	}
	
	public int getReputation() {
		return reputation;
	}

	public void gagner(int gain) {
		argentPossede += gain;
		reputation ++;
		parler("Ce ronin pensait vraiment battre " + nom +" du clan de "+clan+" ? Je l'ai dépouillé de ses "+gain+" sous.");
	}
}
