

public class Main {
    public static void main(String[] args) { // 여기 스코어와
        Knight don = new Knight("돈키호테", 30);
        System.out.printf("%s\n", don.toString());


        don.setHp(don.getHp() + 30) ;
        System.out.printf("%s\n", don.toString());
    }
}
class Knight {
    private String name;
    private int hp;

    public Knight(String name, int hp) {
        this.name = name;
        this.hp = hp;

    }

    public int getHp(){
        return this.hp;

    }

    public void setHp(int hp) {
        this.hp = hp;

    }

    public String toString() {
        return String.format("Knight { 나이트 이름 : %s, 체력 : %d }", name, hp);
    }

}



