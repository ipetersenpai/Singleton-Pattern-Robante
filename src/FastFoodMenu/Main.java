package FastFoodMenu;
import  java.util.Scanner;
import java.util.List;

public class Main {
    
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        Menu obj = Menu.getInstance();

        List<String> FastfoodMenu = obj.getFastfoodMenu();

        boolean condition = true;

        while (condition) {
            System.out.println("=====Welcome to the Jollibeee Here's the Menu!=====\n");
            for (String item : FastfoodMenu) {
                System.out.println("-" + item);
            }
            System.out.println("\n======================MENU=========================");
            System.out.print("\nWould you like to add item in menu? (Y/N):");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.print("Enter the item that you want to add:");
                String newITem = input.nextLine();
                obj.addFastfoodMenu(newITem);
            }
            else if(answer.equalsIgnoreCase("N")){
                condition = false;
            }
            System.out.println("\n");

        }
    }
}
