package by.itacademy.hw16.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Создать список строк
 *   List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
 *   Используя stream и lambda выполнить следующие действия:
 *   Удалить все содержащие “3”
 *   Отсортировать сперва по числу (по возрастанию), потом по букве (по убыванию)
 *   Отбросить первый и последний элемент
 *   Привести в uppercase
 *   Выдать на печать результат
 *   Напечатать количество оставшихся элементов
 */
public class Main {

    public static void main(String[] args) {
	
	List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
	
	System.out.printf("Заданый массив элементов : %s\n",myList.toString());
	System.out.print("Результат : ");
	
	long result = myList.stream()
	                    .filter(a -> a.matches("\\w[^3]"))
	                    .sorted(Comparator.comparingInt(a -> Integer.parseInt(a.substring(1))))   //a1,b1,c1,a2,c2,c5	      
	                    .sorted((a1,a2) -> -a1.compareTo(a2))   // c5, c2, c1, b1, a2, a1,	     
	                    .skip(1)    //c2, c1, b1, a2, a1,	      
	                    .sorted()   // a1, a2, b1, c1, c2,	      
	                    .skip(1)    //a2, b1, c1, c2,	      
	                    .sorted(Comparator.reverseOrder())   //c2, c1, b1, a2,	      
	                    .map(a -> System.out.printf(" %s",a.toUpperCase()))   // C2 C1 B1 A2	      
	                    .count();
             
	     System.out.printf("\nОсталось %s элемента", result); 
    }

}
