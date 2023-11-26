/*hp не может превышать 100ед.*/
public class Person {
    public String name;
    public String lastname;
    public int age;
    private int hp;
    private Person mother;
    private Person father;

    public Person(String name, String lastname, int age, Person mother, Person father) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.hp = 100;
        this.mother = mother;
        this.father = father;
    }
    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.hp = 100;
        this.mother = null;
        this.father = null;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp += hp;
        if (this.hp>=100) this.hp=100;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }
    public void getInfo(){
        String result = ("Имя: "+this.name+"\n" +
                            "Фамилия: "+this.lastname+"\n" +
                            "Возраст: "+this.age+"\n");
        if(this.mother != null){
            result += "Имя мамы: "+this.mother.name+"\n";
            if(this.mother.mother != null){
                result += "Имя бабушки по маминой линии: "+this.mother.mother.name+"\n";
            }
            if(this.mother.father != null){
                result += "Имя дедушки по маминой линии: "+this.mother.father.name+"\n";
            }
        }
        if(this.father != null){
            result += "Имя папы: "+this.father.name+"\n";
            if(this.father.mother != null){
                result += "Имя бабушки по папиной линии: "+this.father.mother.name+"\n";
            }
            if(this.father.father != null){
                result += "Имя дедушки по папиной линии: "+this.father.father.name+"\n";
            }
        }
        System.out.println(result);
    }
}