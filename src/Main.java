public class Main {
    public static void main(String[] args) {
        Novice no = new Novice();
        no.name = "2";
        no.hp = 100;

        Wizard wi = new Wizard();
        wi.name = "3";
        wi.hp = 120;
        wi.mp = 100;

        no.punch();
        wi.punch();

        wi.fireball();


    }
}
class Novice {
    String name;
    int hp;

    public void punch(){
        System.out.printf("[%s]의 펀치!\n", name);
    }

}
class Wizard extends Novice {
    int mp;

    public void fireball(){
        System.out.printf("[%s]의 파이어볼!",name);
    }
}