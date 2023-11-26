public class Main4 {
    static int count =0;
    public static void main(String[] args) {
        //getChange(38);
        System.out.println(f(6));
    }

    /*static int f(int x){
        return x*x;
    }*/

    /*
    * Имеется кофемашина, необходимо запрограммировать (написать функцию) контроллер выдачи сдачи
    * Сдача выдаётся монетами номиналом рублей РФ.
    * 1 2 5 10
    * На вход функции мы даём сумму которую нужно выдать на сдачу
    * Пример: 38
    * Сдача: 10 10 10 5 2 1
    * Кол-во монет в аппарате считаем бесконечным
    * */
    /*static void getChange(int num){
        //int coin = num>=10 ? 10 : num>= 5 ? 5 : num>=2 ? 2 : num>=1 ? 1 : 0;
        int coin = 0;
        if(num >= 10) coin = 10;
        else if(num >= 5) coin = 5;
        else if (num >= 2) coin = 2;
        else if (num >= 1) coin = 1;

        if(coin != 0){
            System.out.println(coin);
            getChange(num - coin);
        }
    }*/


    static int f(int n){
        if(n>2){
            return g(n-1)+f(n/2);
        }else{
            return n;
        }
    }

    static int g(int n){
        if(n>2){
            return g(n-1)+f(n-2);
        }else{
            return 1;
        }
    }

    // Что будет выведено на экран, если запустить f(6)

    // f(6) = g(5)+f(3) = 6+2 = 8
    // g(5) = g(4)+f(3) = 4+2=6
    // g(4) = g(3)+f(2) = 2+2=4
    // g(3) = g(2)+f(1) = 1+1=2
    // f(3) = g(2)+f(1) = 1+1=2

}
