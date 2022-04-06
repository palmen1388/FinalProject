import ChoosingMenuItem.ToDoList;
import ChoosingMenuItem.ToDoListActionFactory;
import ChoosingMenuItem.UserMenu;
import ChoosingMenuItem.UserValue;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValue userValue = new UserValue();
        ToDoList toDoList1 = new ToDoList(new ToDoListActionFactory());
        toDoList1.readFromFile();
        UserMenu.printMenuItems();
        do {
            userValue.setUserValue(scanner.nextLine());
            toDoList1.doChoosingMenuAction(userValue.getUserValue());
            if (userValue.getUserValue().equals(UserMenu.EXIT)) {
                System.out.println("Список сохранен, до встречи");
            }else {
                UserMenu.printMenuItems();
            }
        } while (!userValue.getUserValue().equals(UserMenu.EXIT));
    }
}

