public class Main {
    public static void main(String[] args) {
        Users users = new Users();

        users.addUser(new User("uno", 23));
        users.addUser(new User("dos", 32));
        users.addUser(new User("tres", 77));

        while (users.hasMore()) {
            User user = users.next();
            System.out.println(user.getName()
                    + " tiene "
                    + user.getAge()
                    + " años.")
            ;
        }

        users.addUser(new User("cuatro", 12));
        users.addUser(new User("cinco", 99));
        System.out.println();
        users.reset();

        while (users.hasMore()) {
            User user = users.next();
            System.out.println(user.getName()
                    + " tiene "
                    + user.getAge()
                    + " años.")
            ;
        }

    }
}
