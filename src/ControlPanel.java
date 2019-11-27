import java.util.Scanner;

public class ControlPanel {
	
	Scanner scan = new Scanner(System.in);
	Menu menu = new Menu();
	int choice = 0;
	Planner planner = new Planner();
	Tasks taks = new Tasks();
	
	
	public void control() {
		menu.show_menu();
		do {
			choice = scan.nextInt();
			switch(choice) {
				case 1: planner.choice_plan();
					break;			
				case 2: taks.choice_goals();
					break;
				case 3: System.out.println("Koniec");
					break;
			}
		}while(choice!='x');
		
	}
	
}
