package Actions;

import Deal.Deal;

public class ShowAll implements IDoForToDoList {

    private int taskNumber;

    @Override
    public void doAction() {
        taskNumber = 1;
        for (Deal deal : IDoForToDoList.dealList) {
            String myDeal = deal.toString();
            System.out.println(taskNumber + " - " + myDeal);
            taskNumber++;
        }
    }
}
