package kodilla;

public class User {
    private int age;
    private String name;
    int size;

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {


        User kmail = new User("Kamil", 20);
        User artur = new User("Artur", 31);
        User maciek = new User("Maciek", 17);
        User jacek = new User("Jacek", 53);
        User mikolaj = new User("Mikołaj", 28);

        User[] users = {kmail, artur, maciek, jacek, mikolaj};
        System.out.println(users.length);

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
            System.out.println(result);
        }
        int srednia = result / users.length;
        System.out.println(srednia);

        //double poniezejSredni = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < srednia) {
                System.out.println(users[i].name);
            }

        }


    }
}


