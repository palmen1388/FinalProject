package Actions;

import Deal.Deal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exit  implements IDoForToDoList{

    private int taskNumber;

    @Override
    public void doAction() {
        StringBuilder allTasks = new StringBuilder();
        taskNumber = 1;
        for (Deal deal : IDoForToDoList.dealList) {
            String myDeal = deal.toStringForFile();
            allTasks.append(myDeal);
            try (BufferedWriter out = new BufferedWriter(new FileWriter("ToDoList.txt"))) {
                out.write(String.valueOf(allTasks));
            } catch (IOException e) {
                e.printStackTrace();
            }
            taskNumber++;
        }
    }
}
