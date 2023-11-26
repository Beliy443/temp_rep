package hotel;

import java.util.Scanner;

// /getFreeRooms - кол-во свободных комнат
public class Main {
    static Hotel hotel = new Hotel(
            "Отель у Зины!",
            new Room[]{
                    new Room(11, 4, true, true, true),
                    new Room(12, 2, true, true, false),
                    new Room(13, 2, false, false, false),
                    new Room(21, 1, true, true, true),
                    new Room(22, 1, false, false, false),
                    new Room(23, 3, true, false, true),
                    new Room(31, 3, true, true, true),
                    new Room(32, 4, false, false, false),
                    new Room(33, 2, false, true, false)
            }
    );
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите команду: ");
            String command = scanner.nextLine();
            if (command.indexOf("/getFreeRooms") == 0){
                if(command.indexOf("-full") != -1){
                    hotel.getRoomsList(false, "full");
                }else{
                    hotel.getRoomsList(false);
                }
            }else if (command.equals("/filter")) {
                hotel.filter();
            } else if(command.equals("/getReservedRooms")){
                hotel.getRoomsList(true);
            }else if(command.equals("/reserve")){
                hotel.reserve();
            }else if (command.equals("/deReserve")) {
                hotel.deReserve();
            } else if (command.equals("/quit")) {
                break;
            }
            System.out.println("");
        }
    }
}
