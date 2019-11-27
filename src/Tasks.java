import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Tasks {
	
	Map <LocalDate, String> todayTask = new LinkedHashMap<>();
	LocalDate local = LocalDate.now();
	Scanner scan = new Scanner(System.in);
	Menu menu = new Menu();
	
	public void textMenuGoals() {
		System.out.println("1. Przejdź do dzisiejszych celi");
		System.out.println("2. Przejdź do tygodniowych celi");
		System.out.println("3. Przejdź do kategorii");	
		System.out.println("4. Wróć");
	}
	
	public void choice_goals() {
		textMenuGoals();
		int choice = 0;
		do {
			choice = scan.nextInt();
			switch(choice) {
				case 1: showTodayTasks();
					break;
				case 2: 
					break;
				case 3: 
					break;
				case 4: menu.show_menu();
					break;
			}
		}while(choice!='x');
	}

	public void addTaskForToday() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wpisz nowe zadanie: ");
		String newTask = scan.nextLine();
		todayTask.put(local, newTask);
	}
	public void nextTask()
	{
		System.out.println("1. Dodaj kolejne zadanie \n2. Wróć");
	}
	
	public void showTodayTasks() {
		
	}

}
