package test;

public class SwitchCase {
	void display(int index) {
		switch(index) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		default:
			System.out.println("Invalid input");
		}
	}
   int display1(String str) {
		switch(str) {
		case "Atos":
			System.out.println("ATOS");
			return 1;
		case "Info":
			System.out.println("Info");
			return 2;
		default :
			return 3;
			
		}
	}
	public static void main(String[] args) {
		SwitchCase Swi=new SwitchCase();
		Swi.display(4);
		Swi.display1("Atos");
	}

}
