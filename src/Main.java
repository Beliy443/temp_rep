import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person4 = new Person("Nina", "Petrova", 60);
        Person person3 = new Person("Igor", "Ivanov", 32);
        Person person2 = new Person("Olga", "Ivanova", 32, person4, null);
        Person person1 = new Person("Ivan",  "Ivanov", 10, person2, person3);
        person1.getInfo();
    }
}