package by.itacademy.hw14.task1;

/*
 * Создать служебный поток, который будет каждые n секунд выводить системное время.
 *  n задается через конструктор потока и вводится пользователем с клавиатуры.
 */
public class Main {

    public static void main(String[] args) {
	
	System.out.println("Добро пожаловать в программу проверки работы потока-демона.");
	
	Thread daemon = new Thread(new ClockDaemon(ScannerService.getCount()));
	
	System.out.println("*Стартуем ClockDaemon*");
	daemon.setDaemon(true);
	daemon.start();

	System.out.println("Для выхода из основной программы введите [Q] или [q].");
	String quit = "";

	while (!quit.equalsIgnoreCase("q")) {
	    quit = ScannerService.getQuit();
	}

	System.out.println("Спасибо.До свидания.");
    }

}
