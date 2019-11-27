import java.util.Scanner;

public class Planner {

	Scanner scan = new Scanner(System.in);
	Menu menu = new Menu();
	Tasks task = new Tasks();
	
	public void textMenuPlanning() {
		System.out.println("1. Zaplanuj zadania na dziś");
		System.out.println("2. Zaplanuj zadania na kolejne 7 dni");
		System.out.println("3. Dodaj kategorię zadań");
		System.out.println("4. Wróć");	
	}
	public void choice_plan() {
		textMenuPlanning();
		int choice = 0;
		do {
			choice = scan.nextInt();
			switch(choice) {
				case 1: task.addTaskForToday();
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
	
}
