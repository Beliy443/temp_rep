package multiThread;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Задача AAA выполнена на "+i+"%");
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println("Задача БББ выполнена на "+i+"%");
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println("Задача ВВВ выполнена на "+i+"%");
        }
    }
}

class MyThread extends Thread{


}