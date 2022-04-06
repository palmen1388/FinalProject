package Actions;

import java.util.Scanner;

public class TagIsDone extends ShowAll implements IDoForToDoList {

    private int taskNumber;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void doAction() {
        super.doAction();
        System.out.println("Введите номер задачи которую хотите пометить как выполненную");
        taskNumber = scanner.nextInt();
        while (taskNumber < 1 || taskNumber > IDoForToDoList.dealList.size()) {
            System.out.println("Неверное значение, выберите снова");
            taskNumber = scanner.nextInt();
        }
        IDoForToDoList.dealList.get(taskNumber - 1).setIsDone("[✔]");
    }
}
