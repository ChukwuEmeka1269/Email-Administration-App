package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("John", "Doe");
        String info = email.showInfo();
        System.out.println(info);

    }
}
