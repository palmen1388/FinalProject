package Actions;

import java.util.Scanner;

public class Delete extends ShowAll implements IDoForToDoList {

    private int taskNumber;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void doAction() {
        super.doAction();
        System.out.println("Введите номер задачи которую хотите удалить");
        taskNumber = scanner.nextInt();
        IDoForToDoList.dealList.remove(taskNumber - 1);
    }
}
