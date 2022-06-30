import java.util.Random;
import java.util.Scanner;

public class InterfejsUzytkownika {

	public static int losowanie() {
		Random random = new Random();
		int liczba = random.nextInt(11);
		return liczba;
	}
	public static boolean pytanie() {
		System.out.println("Czy chcesz wylosować kolejną liczbę? (True/False)");
		Scanner scanner = new Scanner(System.in);
		boolean odpowiedz = scanner.nextBoolean();
		return odpowiedz;
	}
}
