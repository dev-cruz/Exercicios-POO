import java.util.ArrayList;

public class DataBase {
    private ArrayList<User> users;

    public DataBase() {
        // load users from database...
        this.users = new ArrayList<User>();
    }

    public ArrayList<User> getUsers(){
        return users; 
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public User loginUser(Login login) {
        for(User user: users) {
            if(login.equals(user.getLogin())) {
                System.out.println("user founded");
                return user;
            }
        }
        return null;
    }
}