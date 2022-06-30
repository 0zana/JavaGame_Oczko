
public class PrzebiegGry {
	public static void start() {
		int suma=0;
		do {
			int twojLos = InterfejsUzytkownika.losowanie();
			suma+=twojLos;
			System.out.println(suma);
			if (suma>21) {
				System.out.println("Oj! Twoja liczba to już " + suma);
				break;
			}
		}while(InterfejsUzytkownika.pytanie());
		int twojLos=InterfejsUzytkownika.losowanie();
		int kolejne = suma+twojLos;
		if(suma<=21) {
			if (kolejne>21) {
				System.out.println("Brawo! Po następnym losowaniu suma byłaby równa " + kolejne);
			} else {
				System.out.println("Niestety! Po następnym losowaniu suma byłaby równa " + kolejne);
			}
		}
	}
}
