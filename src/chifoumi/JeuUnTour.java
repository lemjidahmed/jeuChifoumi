package chifoumi;

public class JeuUnTour {
	private Joueur joueur1,joueur2;
	public JeuUnTour(String nom1,String nom2)
	{
		joueur1=new Joueur(nom1);
		joueur2=new Joueur(nom2);
		jouer();
		conclure();
	}
	public void jouer()
	{
		tour();
		joueur1.ecrireScore();
		joueur2.ecrireScore();
	}
	public void tour()
	{
		Choix choixJoueur1=joueur1.choisir();
		Choix choixJoueur2=joueur2.choisir();
		if(choixJoueur1 == Choix.PAPIER)
		{
			if (choixJoueur2==Choix.CAILLOU)
				joueur1.crediter();
			else if(choixJoueur2==Choix.CISEAUX)
				joueur2.crediter();
		}
		else if(choixJoueur1 == Choix.CAILLOU)
		{
			if (choixJoueur2==Choix.CISEAUX)
				joueur1.crediter();
			else if(choixJoueur2==Choix.PAPIER)
				joueur2.crediter();
		}
		else if(choixJoueur1 == Choix.CISEAUX)
		{
			if (choixJoueur2==Choix.PAPIER)
				joueur1.crediter();
			else if(choixJoueur2==Choix.CAILLOU)
				joueur2.crediter();
		}	
	}
	public void conclure()
	{
		if(joueur1.getScore()>joueur2.getScore())
		{
			System.out.println(joueur1.getNom()+ " est le gagnant! ");
			
		}
		else if(joueur1.getScore()<joueur2.getScore())
		{
			System.out.println(joueur2.getNom()+ " est le gagnant? ");
		}
		else
		{
			System.out.println("les deux joueurs font une partie nulle!");
		}
	}
	
}
