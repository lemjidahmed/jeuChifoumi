package chifoumi;

public class Joueur {
	public String nom;
	private int score;
	private IHMSaisie saisie;
	public Joueur(String nom)
	{
		this.nom=nom;
		saisie=new IHMSaisie(nom);
	}
	public void crediter()
	{
		this.score++;
	}
	public Choix choisir()
	{
		return(this.saisie.proposerChoix());
	}
	public int getScore()
	{
		return(this.score);
	}
	public void ecrireScore()
	{
		System.out.println("le score de "+this.nom+" est "+this.score);
	}
	public String getNom()
	{
		return(this.nom);
	}
}
