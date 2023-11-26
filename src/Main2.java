import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.nextLine(); // Это ввёл пользователь
        System.out.println("Введите пароль: ");
        String pass =  scanner.nextLine(); // Это ввёл пользователь
        login = login.toLowerCase();
        //System.out.println(login.equals("admin") && pass.equals("123")?"Доступ разрешен для ADMIN":login.equals("user") && pass.equals("321")?"Доступ разрешен для USER":"Доступ запрещен");
        if (login.equals("admin") && pass.equals("123")) { // Проверяем, что login == "admin"
            System.out.println("Доступ разрешен для ADMIN");
        }else if(login.equals("user") && pass.equals("321")){
            System.out.println("Доступ разрешен для USER");
        }else {
            System.out.println("Доступ запрещен");
        }
    }
}
