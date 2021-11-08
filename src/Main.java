
public class Main {
    public static void main(String[] args) {
        Person park = new Person("팍");

        Develop dev = park;
        Teacher tea = park;
        Back bac = park;

        dev.programing("java");
        tea.teach("과학");
        bac.play("게임");
    }
}
interface Develop{
    public void programing(String lang);

}

interface Teacher {
    public void teach(String subject);
}

interface Back {
    public void play(String playball);

}

class Person implements Develop, Teacher, Back {
    private String name;

    public Person(String name) {
        this.name = name;


    }

    public void programing(String lang) {
        System.out.printf("%s >> %s 프로그램중 \n", name, lang);

    }

    public void teach(String subject){
        System.out.printf("%s >> %s 가르치는 중 \n", name, subject);

    }

    public void play(String playball) {
        System.out.printf("%s >> %s 노는 중 \n", name, playball);

    }


}


