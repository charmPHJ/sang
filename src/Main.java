
public class Main {
    public static void main(String[] args) {
        Elf elf = new Elf("엘프", 100);
        System.out.println(elf.toString());

        HighElf hi = new HighElf("하이엘프", 120, 200);
        System.out.println(hi.toString());

        LoadElf lo = new LoadElf("로드엘프", 100, 140, 220);
        System.out.println(lo.toString());


    }
}
class Elf{
    protected String name;
    protected int hp;

    public Elf(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    public String toString() {
        return String.format("[%s]의 체력 : %d",this.name, this.hp);
    }
}
class HighElf extends Elf{
    protected int mp;

    public HighElf(String name, int hp, int mp){
        super(name,hp);
        this.mp = mp; // 이걸할려면 메소드 오버라이딩해야됨.
    }
    public String toString(){
        return String.format("[%s]의 체력 : %d   마나: %s", super.name, super.hp, this.mp);
    }

}
class LoadElf extends HighElf{
    protected int sh;

    public LoadElf(String name, int hp, int mp, int sh){
        super(name,hp,mp);
        this.sh = sh;
    }
    public String toString(){
        return String.format("[%s]의 체력 : %d   마나: %s, 쉴드: %s", super.name, super.hp, super.mp,this.sh);
    }

}
//rmt

