package laboration3;

public class Program3g {

	public void country() {
		System.out.println("Land: Sverige");
	}

	public void residents() {
		System.out.println("Ca 9 miljoner invånare");
	}

	public void bigCities() {
		System.out.println("Tre stora städer:");
		System.out.println("Stockholm");
		System.out.println("Göteborg");
		System.out.println("Malmö");
	}

	public static void main(String[] args) {
		Program3g prog = new Program3g();
		
		prog.country();
		prog.residents();
		prog.bigCities();
	}
}
