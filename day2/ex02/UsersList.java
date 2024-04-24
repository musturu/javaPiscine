interface UsersList {
    public User getUserById(int id);
    public void AddUser(User toAdd);
    public User getUserbyIndex(int index);
    public int  getUserCount();
}