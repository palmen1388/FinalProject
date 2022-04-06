package Deal;

public class Deal {

    private String dealName;
    private String dealDescription;
    private DealPriority dealPriority;
    private String isDone = "[ ]";

    public String getIsDone() {
        return isDone;
    }

    public void setIsDone(String isDone) {
        this.isDone = isDone;
    }

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public String getDealDescription() {
        return dealDescription;
    }

    public void setDealDescription(String dealDescription) {
        this.dealDescription = dealDescription;
    }

    public DealPriority getDealPriority() {
        return dealPriority;
    }

    public void setDealPriority(DealPriority dealPriority) {
        this.dealPriority = dealPriority;
    }

    @Override
    public String toString() {
        return "Название: " + dealName + "\n" + "Описание задачи: " +
                dealDescription + "\n" + "Важность задачи: " +
                dealPriority.priority + "\n" + "Выполнение: " + isDone;
    }

    public String toStringForFile() {
        return dealName + "," + dealDescription + "," + dealPriority + "," + isDone + "\n";
    }
}
