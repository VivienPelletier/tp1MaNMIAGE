public class TestLivre {

    public static void main(String [] args) {

	System.out.println("=== Exo4 ===");
	
	Livre l1 = new Livre("Emile Zola", "Germinal");
	Livre l2 = new Livre("Karl Marx", "Le Capital");

	System.out.println("L'auteur du premier livre est " + l1.getAuteur());
	System.out.println("L'auteur du second livre est "+l2.getAuteur());

	System.out.println("=== Exo5 ===");
	
	l1.setNbPages(230);
	l2.setNbPages(995);

	System.out.println("Le nombre de page cumulé est de "+ (l1.getNbPages() + l2.getNbPages()));

	System.out.println("=== Exo7 ===");

	l1.afficheToi();
	System.out.println(l1);

	System.out.println("=== Exo8 ===");

	Livre l3 = new Livre();
	l3.setAuteur("Jeau-Jacques Rousseau");
	l3.setNbPages(256);
	l3.setTitre("Du contrat social");

	Livre l4 = new Livre("Thomas More", "Utopia", 125);
	Livre l5 = new Livre("Voltaire", "Traité sur la tolérance", 192);

	System.out.println(l3);
	System.out.println(l4);
	System.out.println(l5);

	System.out.println("=== Exo9 ===");

	l5.setPrix(5.40);
	System.out.println(l5);

	l5.setPrix(0);
	System.out.println(l5);

	System.out.println("=== Exo10 ===");

	if(l5.compare(l4) > 0)

	    System.out.println("Le livre de "+l5.getAuteur()+" contient plus de page que le livre de "+l4.getAuteur()+".");

	else

	    System.out.println("Le livre de "+l5.getAuteur()+" ne contient pas plus de page que le livre de "+l4.getAuteur()+".");

	System.out.println("=== Exo11 ===");

	l4.setPrix(2);
	l3.setPrix(3.90);
	l2.setPrix(26);
	l1.setPrix(3.5);

	Comptable comptable1 = new Comptable();
	Comptable comptable2 = new Comptable();

	comptable1.comptabilise(l3);
	comptable1.comptabilise(l4);

	comptable2.comptabilise(l1);
	comptable2.comptabilise(l2);
	comptable2.comptabilise(l3);
	comptable2.comptabilise(l4);
	comptable2.comptabilise(l5);

	System.out.println("La somme du prix des livres \""+l3.getTitre()+"\" et \""+l4.getTitre()+"\" est de "+comptable1.getSomme()+"€.");
	System.out.println("La somme du prix de tous les livres est de "+comptable2.getSomme()+"€.");

	System.out.println("La somme du prix des livres enregistrés est de "+Livre.getPrixTotal()+"€.");

    }

}
