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
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t’ai eu petit yakusa !");
			argentPossede += adversaire.perdre();
			honneur++;
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			honneur --;
			adversaire.gagner(argentPossede);
			argentPossede = 0;
		}
	}
}
