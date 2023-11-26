import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        String[] cars = {"audi", "bmw","kia","Vaz"};
        /*System.out.println(cars[0]); // audi
        System.out.println(cars[1]); // bmw
        System.out.println(cars[2]); // kia
        System.out.println(cars.length); // кол-во элементов массива*/
        /*int i = 0;
        while(i<cars.length){
            System.out.println(cars[i]);
            i = i + 1;
        }
        System.out.println(i); // 4*/

        /*do{
            System.out.println(cars[i]);
            i = i + 1;
        }while (i<cars.length);*/
        /*for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }*/
        /*int i = 4;
        i = i + 1;
        i += 1;
        System.out.println(i); // 6
        System.out.println(++i); // 7
        System.out.println(i++); // 7
        System.out.println(i); // 8
        System.out.println(--i); // 7
        System.out.println(i--); // 7
        System.out.println(i); // 6*/


        /*for (String car : cars) {
            System.out.println(car);
        }*/

        // Узнать оценку в четверти
        // 1) Узнать сумму всех чисел в массиве
        // 2) Поделить сумму на кол-во элементов массива
        /*int[] nums = {4,5,5,5,5,5,4,5,4};
        int sum = 0;
        for (int num : nums) {
            sum += num; // sum = sum + num;
        }
        System.out.println(Math.round((double) sum/nums.length));*/
        /* Найти максимальное нечётное число */
        /*int[] nums = {-2300,-12,-3,-654,-435,-134,-345,-234};
        int max = Integer.MIN_VALUE; //(int) -(1/0.0);
        for (int num : nums) {
            if(max < num && num%2 != 0){
                max = num;
            }
        }
        System.out.println(max);*/

        /*
        * Имеется массив символов String[] chars = {"К","Л","М","Н"}
        * Необходимо вывести на экран все возможные 4х символьные комбинации символов
        * в алфавитном порядке
        * Строки должны быть пронумерованы, узнать на какой позиции находится слово ЛКМН
        * КККК
        * КККЛ
        * КККМ
        * КККН
        * ККЛК
        * ККЛЛ
        * ....
        * */
        String[] chars = {"К","Л","М","Н"};
        int position = 0;
        int count = 1;
        String word;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                for (int k = 0; k < chars.length; k++) {
                    for (int l = 0; l < chars.length; l++) {
                        word = chars[i]+chars[j]+chars[k]+chars[l];
                        if(word.equals("ЛКМН"))
                            position = count;
                        System.out.println((count++)+") "+word);
                    }
                }
            }
        }
        System.out.println("Слово ЛКМН находится на позиции "+position);
    }
}
