package ChoosingMenuItem;

import Actions.*;

public class ToDoListActionFactory {
    public IDoForToDoList createAction (UserMenu value) {
        IDoForToDoList action = null;

        switch  (value) {
            case ADD:
                return action = new Add();
            case DELETE:
                return action = new Delete();
            case TAGISDONE:
                return action = new TagIsDone();
            case SHOWALL:
                return action = new ShowAll();
            case SHOWALLDONE:
                return action = new ShowAllDone();
            case EXIT:
                return action = new Exit();
            case EXECUTE:
                return action = new PrintWrongValue();
        }
        return null;
    }
}
