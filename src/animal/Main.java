package animal;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", "Дворняга", 4);
        //Animal kecha = new Animal("Кеша", "Волнистый", 6);
        barsik.animalRun();
    }
}

//общий абстрактный класс животных. экземпляр класса по абстрактному классу создать не можем
abstract class Animal{
    private String nickname;
    private String breed;
    private int age;

    public Animal(String nickname, String breed, int age) {
        this.nickname = nickname;
        this.breed = breed;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}

/*тут уже класс кошек. Мы наследуем то что было в классе животных (оператор extends)
плюс добавляем свои методы*/
class Cat extends Animal{
    public Cat(String nickname, String breed, int age) {
        super(nickname, breed, age);
    }
    public void animalRun(){
        System.out.println(this.getNickname()+" побежал");
    }
}

class Horse extends Animal{
    public Horse(String nickname, String breed, int age) {
        super(nickname, breed, age);
    }
    public void animalRun(){
        System.out.println(this.getNickname()+" побежал");
    }
}

class Pegasus extends Horse{
    public Pegasus(String nickname, String breed, int age) {
        super(nickname, breed, age);
    }
    public void animalFly(){
        System.out.println(this.getNickname()+" полетел");
    }
}