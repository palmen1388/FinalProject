package Deal;

public enum DealPriority {

    CRITICAL("Критическая"),
    MEDIUM("Средняя"),
    UNIMPORTANT("Неважная");

    protected String priority;

    DealPriority(String priority) {
        this.priority = priority;
    }

    public static void printPriority() {
        DealPriority[] priorities = DealPriority.values();
        for (int i = 0; i < DealPriority.values().length; i++) {
            System.out.println((i + 1) + "." + priorities[i].priority);
        }
    }
}
