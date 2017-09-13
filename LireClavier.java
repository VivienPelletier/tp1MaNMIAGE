import java.util.Scanner;

public class LireClavier {

    public int lireEntier() {

	try{
	    
	    Scanner sc = new Scanner(System.in);
	    return sc.nextInt();
	    
	} catch (Exception e) {

	    System.err.println("Vous êtes sur d'avoir saisi un entier ?");
	    System.err.print("Recommencez : ");
	    return lireEntier();

	}

    }

}
