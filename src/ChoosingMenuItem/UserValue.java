package ChoosingMenuItem;

public class UserValue {

    protected String userValue;


    public UserMenu getUserValue() {
        if (userValue.equalsIgnoreCase(String.valueOf(UserMenu.ADD.ordinal() + 1))) {
            return UserMenu.ADD;
        }
        if (userValue.equalsIgnoreCase(String.valueOf(UserMenu.DELETE.ordinal() + 1))) {
            return UserMenu.DELETE;
        }
        if (userValue.equalsIgnoreCase(String.valueOf(UserMenu.TAGISDONE.ordinal() + 1))) {
            return UserMenu.TAGISDONE;
        }
        if (userValue.equalsIgnoreCase(String.valueOf(UserMenu.SHOWALL.ordinal() + 1))) {
            return UserMenu.SHOWALL;
        }
        if (userValue.equalsIgnoreCase(String.valueOf(UserMenu.SHOWALLDONE.ordinal() + 1))) {
            return UserMenu.SHOWALLDONE;
        }
        if (userValue.equalsIgnoreCase(String.valueOf(UserMenu.EXIT.ordinal() + 1))) {
            return UserMenu.EXIT;
        }
        return UserMenu.EXECUTE;
    }

    public void setUserValue(String userValue) {
        this.userValue = userValue;
    }
}
