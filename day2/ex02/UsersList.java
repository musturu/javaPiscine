interface UsersList {

    public User getUserById(int id);
    public void addUser(User toAdd);
    public User getUserbyIndex(int index);
    public int  getUserCount();

    public class UserNotFoundException extends RuntimeException {
        public UserNotFoundException(String message) {

            super(message);

        }
    }
}