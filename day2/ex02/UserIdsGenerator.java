public class UserIdsGenerator {

    private static UserIdsGenerator instance = null;
    private int                     lastId;

    private UserIdsGenerator() {
        lastId = 0;
    }

    public int  generateId() {
        lastId = lastId + 1;
        return (lastId);
    }

    public static UserIdsGenerator getInstance() {
        if (instance == null) {
            instance = new UserIdsGenerator();
        }
        return instance;
    }
}