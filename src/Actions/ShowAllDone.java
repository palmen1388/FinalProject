package Actions;

import Deal.Deal;

public class ShowAllDone implements IDoForToDoList {

    private int taskNumber;

    @Override
    public void doAction() {
        taskNumber = 1;
        for (Deal deal : IDoForToDoList.dealList) {
            String myDeal = deal.toString();
            if ("[✔]".equalsIgnoreCase(deal.getIsDone())) {
                System.out.println(taskNumber + " - " + myDeal);
                taskNumber++;
            }
        }
    }
}
