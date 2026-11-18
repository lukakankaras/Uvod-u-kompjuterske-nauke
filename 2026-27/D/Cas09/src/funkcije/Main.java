package funkcije;

public class Main {

	public static void helloWorld() {
		System.out.println("Hello world");
	}
	
	public static int sabiranje(int a, int b) {
		int rezultat = a + b;
		
		if(3 < 5) {
			return rezultat;	
		} else {
			System.out.println("adsa");
			return rezultat * 2;
		}
	}
	
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		System.out.println(sabiranje(x, y));
	}

}
