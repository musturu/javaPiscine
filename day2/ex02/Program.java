public class Program {
    public static void main(String[] args) {
        UsersArrayList list = new UsersArrayList();

        list.addUser(new User("test1", 150f));
        list.addUser(new User("test1", 150f));
        list.addUser(new User("test1", 150f));
        list.addUser(new User("test1", 150f));
        list.addUser(new User("test1", 150f));
        list.addUser(new User("test1", 150f));
        list.addUser(new User("test1", 150f));
        list.addUser(new User("test1", 150f));
        list.addUser(new User("test1", 150f));
        list.addUser(new User("test1", 150f));
        System.out.println("size list: " + list.getUserCount());
        list.addUser(new User("test1", 150f));
        list.addUser(new User("test1", 150f));
        list.addUser(new User("test1", 150f));
        list.addUser(new User("test1", 150f));
        System.out.println("size list: " + list.getUserCount());
    }
}