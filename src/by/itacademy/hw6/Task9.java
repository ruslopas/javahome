package by.itacademy.hw6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*  Email. Общий вид — логин@поддомен.домен. Логин, как и поддомен — слова из букв, цифр, подчеркиваний,
    дефисов и точек. А домен (имеется в виду 1го уровня) — это от 2 до 6 букв.
    Пример:
    •  myemail@gmail.com 
    •  a.petrov@gmail.com.au
    •  coder4575@yandex.ru     */

public class Task9 {

	public static void main(String[] args) {

		System.out.println("Enter your e-mail :");

		String email = inputFromScanner();
		validateEmail(email);

		System.out
				.println("Entered e-mail \"" + email + (validateEmail(email) ? "\" is correct." : "\" is incorrect."));

	}

	public static boolean validateEmail(String email) {

		Pattern pattern = Pattern.compile("^([a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+\\.[a-zA-Z0-9]{3,6})$");
		Matcher matcher = pattern.matcher(email);

		return matcher.matches();
	}

	public static String inputFromScanner() {

		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

}
