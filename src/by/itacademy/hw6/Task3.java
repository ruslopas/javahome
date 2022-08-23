package by.itacademy.hw6;
/*
 * Поменяйте местами первое самое длинное слово с последним самым коротким.
 */

import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) {

		String line = "The procedures recommended and described in this manual are "
				+ "effective methods of performing service and repair";

		System.out.println("Source sentence :\n\n" + line + "\n");

		System.out.println("Swap sentence :\n\n" + replaceFirstLongWithLastShort(line));
	}

	public static StringBuilder replaceFirstLongWithLastShort(String line) {

		Pattern pattern = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
		String[] words = pattern.split(line);

		StringBuilder swapLine = new StringBuilder();
		String max = "";
		String min = words[0];

		int indexMax = 0;
		int indexMin = 0;

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() >= max.length()) {
				max = words[i];// самое длинное слово
				indexMax = i;
			}
			if (words[i].length() <= min.length()) {
				min = words[i];// самое короткое слово
				indexMin = i;
			}
		}
		words[indexMax] = min;
		words[indexMin] = max;

		for (int i = 0; i < words.length; i++) {
			swapLine.append(words[i] + " ");
		}

		return swapLine;
	}
}
