package ChoosingMenuItem;

import Actions.IDoForToDoList;
import Deal.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ToDoList {


    private final ToDoListActionFactory actionFactory;
    private Deal deal;

    public ToDoList(ToDoListActionFactory actionFactory) {
        this.actionFactory = actionFactory;

    }


    public void doChoosingMenuAction(UserMenu value) {
        IDoForToDoList action = actionFactory.createAction(value);
        action.doAction();
    }

    public void readFromFile() {
        try (BufferedReader in = new BufferedReader(new FileReader("ToDoList.txt"))) {
            String value = in.readLine();
            while (value != null) {
                deal = new Deal();
                String[] fields = value.split(",");
                deal.setDealName(fields[0]);
                deal.setDealDescription(fields[1]);
                deal.setDealPriority(DealPriority.valueOf(fields[2]));
                deal.setIsDone(fields[3]);
                IDoForToDoList.dealList.add(deal);
                value = in.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
