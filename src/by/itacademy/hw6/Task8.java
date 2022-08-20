package by.itacademy.hw6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Шестнадцатеричный цвет. 
 * Символ # (необязательно), затем слово, состоящее из букв от a до f или цифр, длиной 3 или 6: 
    Пример: 
    • FFFFFF
    •  #000 
    • 101011*/

public class Task8 {

	public static void main(String[] args) {

		System.out.println("Enter hex color code :");

		String hexColor = inputFromScanner();
		validateHexColorCode(hexColor);

		System.out.println("Entered Hex color code \"" + hexColor
				+ (validateHexColorCode(hexColor) ? "\" is correct." : "\" is incorrect."));

	}

	public static boolean validateHexColorCode(String hexColor) {

		Pattern pattern = Pattern.compile("^(#?([a-fA-F0-9]{3})|(#?[a-fA-F0-9]{6}))$");
		Matcher matcher = pattern.matcher(hexColor);

		return matcher.matches();
	}

	public static String inputFromScanner() {

		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
}
