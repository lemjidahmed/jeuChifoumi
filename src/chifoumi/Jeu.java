package chifoumi;

public class Jeu {
	Joueur joueur1, joueur2;

	public Jeu(String nom1, String nom2, int scoreMax) {
		joueur1 = new Joueur(nom1);
		joueur2 = new Joueur(nom2);
		jouer(scoreMax);
	}

	public void jouer(int scoreMax){
		boolean fini = false;
		while (!fini) {
			tour();
			joueur1.ecrireScore();
			joueur2.ecrireScore();
			if (joueur1.getScore() ==scoreMax) {
				proclamer(joueur1);
				fini = true;
			}
			else if (joueur2.getScore() == scoreMax) {
				proclamer(joueur1);
				fini = true;
			}
		}
	}

	public void tour() {
		Choix choix1 = joueur1.choisir();
		Choix choix2 = joueur2.choisir();
		if (choix1 == Choix.CISEAUX) {
			if (choix2 ==  Choix.PAPIER) joueur1.crediter();
			else if  (choix2 ==  Choix.CAILLOU) joueur2.crediter();
		}
		else if (choix1 == Choix.PAPIER)  {
			if (choix2 ==  Choix.CAILLOU) joueur1.crediter();
			else if  (choix2 ==  Choix.CISEAUX) joueur2.crediter();
		}
		else if (choix1 == Choix.CAILLOU)  {
			if (choix2 ==  Choix.CISEAUX) joueur1.crediter();
			else if  (choix2 ==  Choix.PAPIER) joueur2.crediter();
		}
	}

	public void proclamer(Joueur joueur) {
		System.out.println(joueur.getNom() + " est le grand gagnant");
	}
}