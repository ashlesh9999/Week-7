package CoffeeShop;

import java.util.Scanner;

public class CoffeeFactory{
	public void chooseMenu() {

		Scanner usrInpt = new Scanner(System.in);
		
		System.out.println("\n\n-------------SELECT MENU----------------\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) Cold Beverages Menu\n"+
		"2) Hot Beverages\n");
		
		
		int menuChoice = usrInpt.nextInt();
		
		
		if(menuChoice ==1) {
			ColdBeveragesMenu coldBeveragesMenu = new ColdBeveragesMenu();
			PrintColdBeveragesMenu printColdBeveragesMenu = new PrintColdBeveragesMenu(coldBeveragesMenu);
			printColdBeveragesMenu.printMenu();
		}
		
		else if(menuChoice ==2) {
			HotBeveragesMenu hotBeveragesMenu = new HotBeveragesMenu();
			PrintHotBeveragesMenu printHotBeveragesMenu = new PrintHotBeveragesMenu(hotBeveragesMenu);
			printHotBeveragesMenu.printMenu();
		}
		
	}
	
	

}
