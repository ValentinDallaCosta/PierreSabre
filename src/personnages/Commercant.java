package personnages;

public class Commercant extends Humain {

	public Commercant(String nom) {
		super(nom, "thé", 0);
	}
	
	
	public int seFaireExtorquer() {
		int argentRetire = argentPossede;
		parler("J’ai tout perdu! Le monde est trop injuste ...");
		argentPossede = 0;
		return argentRetire;
	}
	
	public void recevoir(int argent) {
		argentPossede += argent;
		parler(argent + " sous ! Je te remercie généreux donateur!");
	}
}


