import java.util.ArrayList;

public class Users implements UserIterator {
    private int index = 0;
    private ArrayList<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User next() {
        index++;
        return users.get(index-1);
    }

    @Override
    public void reset() {
        index = 0;
    }

    @Override
    public boolean hasMore() {
        return index < users.size();
    }
}
