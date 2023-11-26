package hotel;

public class Room {
    private int number;
    private int place;
    private boolean conditioner;
    private boolean wc;
    private boolean tv;
    private boolean reserved;

    public Room(int number, int place, boolean conditioner, boolean wc, boolean tv) {
        this.number = number;
        this.place = place;
        this.conditioner = conditioner;
        this.wc = wc;
        this.tv = tv;
        this.reserved = false;
    }

    public int getNumber() {
        return number;
    }

    public int getPlace() {
        return place;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public boolean isWc() {
        return wc;
    }

    public boolean isTv() {
        return tv;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
    public void getProperties(String param){
        if(param.equals("full")){
            System.out.println( "*----------*\n"+
                    "Номер: "+this.getNumber()+"\n" +
                    "Спальных мест: "+this.getPlace()+"\n" +
                    "Наличие кондиционера: "+(this.isConditioner()?"Да":"Нет")+"\n" +
                    "Наличие санузла: "+(this.isWc()?"Да":"Нет")+"\n" +
                    "Наличие ТВ: "+(this.isTv()?"Да":"Нет"));
        }else{
            System.out.print(this.getNumber()+" ");
        }
    }
}
