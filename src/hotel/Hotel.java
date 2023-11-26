package hotel;

import java.util.Arrays;
import java.util.Scanner;

public class Hotel {
    private String name;
    private Room[] rooms;
    public Hotel(String name, Room[] rooms) {
        this.rooms = rooms;
    }
    private int getRoomNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите номер комнаты:");
        return scanner.nextInt();
    }
    public void getRoomsList(boolean reserved){
        this.getRoomsList(reserved, "");
    }
    public void getRoomsList(boolean reserved, String param){
        for (Room room : rooms) {
            if (room.isReserved() == reserved){
                room.getProperties(param);
            }
        }
    }
    public void reserve(){
        System.out.println("Дотсупные для бронирования комнаты:");
        this.getRoomsList(false);
        int number = this.getRoomNumber();
        /*Arrays.stream(rooms).forEach(room -> {
            if(room.getNumber() == number && !room.isReserved()){
                room.setReserved(true);
                System.out.println("Комната успешно забронирована");
            }
        });*/
        for (Room room : rooms){
            if(room.getNumber() == number && !room.isReserved()){
                room.setReserved(true);
                System.out.println("Комната успешно забронирована");
                return;
            }
        }
        System.out.println("Выбранная комната недоступна!");
    }
    public void deReserve(){
        int number = this.getRoomNumber();
        for (Room room : rooms){
            if(room.getNumber() == number && room.isReserved()){
                room.setReserved(false);
                System.out.println("Комната теперь доступна для бронирования");
                return;
            }
        }
        System.out.println("Выбранная комната недоступна!");
    }
    public void filter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кол-во спальных мест: ");
        int place = Integer.parseInt(scanner.nextLine());
        System.out.println("Наличие кондиционера: ");
        String conditioner = (scanner.nextLine());
        System.out.println("Наличие ТВ: ");
        String tv = (scanner.nextLine());
        System.out.println("Наличие санузла: ");
        String wc = (scanner.nextLine());
        int countParam = 1;
        if(!conditioner.equals("")) countParam++;
        if(!wc.equals("")) countParam++;
        if(!tv.equals("")) countParam++;
        int mark = 0;
        for (Room room : rooms) {
            if(room.isConditioner() && conditioner.equals("да")) mark++;
            if(room.isTv() && tv.equals("да")) mark++;
            if(room.isWc() && wc.equals("да")) mark++;
            if(room.getPlace() >= place) mark++;
            if(mark == countParam){
                System.out.print(room.getNumber()+" ");
            }
            mark = 0;
        }
    }
}
