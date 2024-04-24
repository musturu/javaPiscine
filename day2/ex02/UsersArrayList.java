public class UsersArrayList  implements UsersList {

    public User[] users;

    public UsersArrayList() {
        users = new User[10];
    }

    private void    expandArray() {
        User[] newArr;

        if (users[users.length - 1] != null) {
            newArr = new User[users.length + (users.length / 2)];
            for (int i = 0; i < users.length; i++) {
                newArr[i] = user[i];
            }
            users = newArr;
        }
    }

    public void addUser(User toAdd) {
        int i = 0;

        while(users[i] != null) {
            i++;
        }
        users[i] = toAdd;
        expandArray();
    }

    public User getUserById(int id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].identifier == id)
                return (users[i]);
        }
        return (null);
    }

    public User getUserbyIndex(int index) {
       if (users.length > index)
           return (users[index]);
       return (null);
    }

    public int  getUserCount() {
        int i = 0;

        while(users[i] != null) {
            i++;
        }
        return (i);
    }
}