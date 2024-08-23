class Computer{
    public void playmusic(){
        System.out.println("PlayingMusic..");

    }

    public String pen(int cost){
        if(cost >=10)
            return "Pen";
        else
            return "Nothing";

    }

}
public class Main {
    public static void main(String[] args) {

        Computer obj = new Computer();
        obj.playmusic();
        String str = obj.pen(9);
        System.out.println(str);

    }
}