public class Comptable {

    private double somme = 0d;

    
    public void comptabilise(Livre l) {

	if(l.isPrixInitialise())
	    somme += l.getPrix();

    }

    public double getSomme() {

	return somme;

    }

}
