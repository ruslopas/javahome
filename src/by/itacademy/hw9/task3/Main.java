package by.itacademy.hw9.task3;

public class Main {
	/*
	 * Машина и мотоцикл являются средствами передвижения. В гараже могут находится
	 * только средства передвижения. Разработать программу, позволяющую ставить
	 * средства передвижения в гараж, доставать их оттуда и осматривать содержимое
	 * гаража.
	 */
	public static void main(String[] args) {

		Garage garage = new Garage();
		garage.observeGarage();

		System.out.println("Put 2 vehicles to garage:\n");
		garage.putToGarage();
		garage.observeGarage();

		System.out.println("\nPut away 1 vehicle\nRemained:");
		garage.putAwayFromGarage();
		garage.observeGarage();

		System.out.println("\nPut away the last one");
		garage.putAwayFromGarage();
		garage.observeGarage();
	}

}
