package Actions;

import Deal.Deal;
import Deal.DealPriority;

import java.util.Scanner;

public class Add implements IDoForToDoList {

    private Scanner scanner = new Scanner(System.in);
    private Deal deal;
    private int priorityNumber;
    private DealPriority[] dealPriorities = DealPriority.values();

    @Override
    public void doAction() {
        deal = new Deal();
        System.out.println("Добавьте название задачи");
        deal.setDealName(scanner.nextLine());
        System.out.println("Добавьте описание задачи");
        deal.setDealDescription(scanner.nextLine());
        System.out.println("Выберите приоритет задачи");
        DealPriority.printPriority();
        priorityNumber = scanner.nextInt();
        while (priorityNumber < 1 || priorityNumber > dealPriorities.length) {
            System.out.println("Неверное значение, выберите снова");
            priorityNumber = scanner.nextInt();
        }
        deal.setDealPriority(dealPriorities[priorityNumber - 1]);
        IDoForToDoList.dealList.add(deal);
    }
}
