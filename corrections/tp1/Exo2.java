public class Exo2 {

    public static void main(String [] args) {

	System.out.println("Test factorielle(5) : " + factorielle(5));
	System.out.println("Test 2 parmi 4 : " + aParmiB(2, 4));
	System.out.println("Test triangle de Pascal 25 lignes : ");
	trianglePascal(25);

    }

    public static long factorielle(int a) {
	
	long r = 1;
	
	for(int i = a; i > 1; i--) {
	    r *= i;
	}

	return r;

    }

    public static long aParmiB(int a, int b) {

	return factorielle(b)/(factorielle(a)*factorielle(b-a));

    }

    public static void trianglePascal(int n) {

	for(int i = 0; i < n; i++) {
	    for(int j = 0; j <= i; j++) {

		System.out.print(aParmiB(j,i) + " ");

	    }

	    System.out.println();

	}


    }

}
