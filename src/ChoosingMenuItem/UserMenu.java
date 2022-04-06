package ChoosingMenuItem;

public enum UserMenu {

    ADD("Добавить задачу"),
    DELETE("Удалить задачу"),
    TAGISDONE("Пометить как выполненное"),
    SHOWALL("Показать весь список дел"),
    SHOWALLDONE("Показать все выполненные задачи"),
    EXIT("Выйти"),
    EXECUTE("Wrong value");

    private String item;

    UserMenu(String item) {
        this.item = item;
    }

    public static void printMenuItems() {
        UserMenu[] values = UserMenu.values();
        for (int i = 0; i < UserMenu.values().length - 1; i++) {
            System.out.println((i + 1) + "." + values[i].item);
        }
    }
}
