package by.itacademy.hw6;
/*
 * Поменяйте местами первое самое длинное слово с последним самым коротким.
 */

public class Task3 {

	public static void main(String[] args) {
		String line = "The procedures recommended and described in this manual are "
				+ "effective methods of performing service and repair";
		System.out.println("Source sentence :\n" + line);
		replaceFirstLongWithLastShort(line);
	}

	public static void replaceFirstLongWithLastShort(String line) {
		String[] words = line.split(" ");
		int firstLongWord = 0;
		int lastShortWord = 0;
		String max = "";
		String min = words[0];
		for (int i = 0; i < words.length; i++) {// самое длинное слово
			if (words[i].length() >= max.length()) {
				max = words[i];

			}
		}

		for (int i = 0; i < words.length; i++) {// самое короткое слово
			if (words[i].length() <= min.length()) {
				min = words[i];

			}//Не успеваю,доделать припервой возможности
		}

	}
}
