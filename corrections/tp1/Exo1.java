public class Exo1 {

    public static void main(String [] args) {

	int a = 11, b = 4;
	
	division(a, b);

    }

    public static void division(int a, int b) {

	int q = 0, r = a;

	while(r > b) {

	    System.out.println(b + " = " + a + " * " + q + " + " + r);

	    q = q+1;
	    r = r-b;

	}

	System.out.println(b + " = " + a + " * " + q + " + " + r);

    }

}
