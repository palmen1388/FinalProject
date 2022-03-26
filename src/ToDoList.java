public class ToDoList {

    private Deal deal;
    private String userValue;


    public void addDeal() {
        Deal newDeal = new Deal();
        if (deal == null) {
            deal = newDeal;
        } else {
            Deal currentDeal = deal;
            while (currentDeal.getNext() != null) {
                currentDeal = currentDeal.getNext();
            }
            currentDeal.setNext(newDeal);
        }

    }
    public void deleteDeal() {

    }
    public void designateAsIsDone() {

    }
    public void showAllDeals() {

    }
    public void showAllDoneDeals() {

    }
}
