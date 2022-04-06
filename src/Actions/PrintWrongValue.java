package Actions;

public class PrintWrongValue implements IDoForToDoList {
    @Override
    public void doAction() {
        System.out.println("Неверное значение, введите снова");
    }
}
