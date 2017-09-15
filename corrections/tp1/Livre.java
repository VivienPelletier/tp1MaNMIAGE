public class Livre {

    public static int compare2(Livre l1, Livre l2) {

	return l1.compare(l2);

    }

    private static Comptable comptable = new Comptable();

    public static double getPrixTotal() {
	
	return comptable.getSomme();
	
    }
    
    // Données membres
    private String titre, auteur;
    private int nbPages;
    private double prix;
    private boolean prixInitialise = false;
    
    // Constructeur
    public Livre() {}
    
    public Livre(String unAuteur, String unTitre) {
	
	auteur = unAuteur;
	titre = unTitre;
	
    }
    
    public Livre(String unAuteur, String unTitre, int nbPages) {
	
	auteur = unAuteur;
	titre = unTitre;
	this.nbPages = nbPages;
	
    }

    public Livre(String unAuteur, String unTitre, int nbPages, double prix) {

	auteur = unAuteur;
	titre = unTitre;
	this.nbPages = nbPages;
	this.prix = prix;
	prixInitialise = true;
	comptable.comptabilise(this);

    }
    
    // Accesseur
    public String getAuteur() {
	
	return auteur;
	
    }
    
    // Modificateur
    public void setNbPages(int nb) {
	
	if(nb < 1) {
	    
	    System.err.println("[EE] Un nombre de page doit être un entier positif");
	    
	} else {
	    
	    nbPages = nb;

	}

    }

    public int getNbPages() {
	return nbPages;
    }

    public String getTitre() {
	return titre;
    }

    public void setAuteur(String auteur) {
	this.auteur = auteur;
    }

    public void setTitre(String titre) {
	this.titre = titre;
    }

    public boolean isPrixInitialise() {

	return prixInitialise;

    }

    public double getPrix() {

	if(!prixInitialise) {

	    System.err.println("Prix pas encore initialisé");

	}

	return prix;

    }

    public void setPrix(double prix) {

	if(prixInitialise) {

	    System.err.println("Prix déjà initialisé.");

	} else {

	    this.prix = prix;
	    prixInitialise = true;
	    comptable.comptabilise(this);

	}
	
    }

    public void afficheToi() {

	System.out.println("[Auteur : "+getAuteur()+"; Titre : "+getTitre()+"; Nombre de pages : "+getNbPages()+"; prix : "+
			   (prixInitialise ? prix : "\"Prix pas encore fixé\"")+"]");

    }

    public String toString() {

	return "[Auteur : "+getAuteur()+"; Titre : "+getTitre()+"; Nombre de pages : "+getNbPages()+"; prix : "+
			   (prixInitialise ? prix : "\"Prix pas encore fixé\"")+"]";

    }

    public int compare(Livre autre) {

	if(nbPages== autre.getNbPages())
	    return 0;
	else if(nbPages > autre.getNbPages())
	    return 1;
	else
	    return -1;

    }

}
