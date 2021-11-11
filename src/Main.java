import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
class StudentInfo {
        public int grade;
        StudentInfo(int grade) {
            this.grade = grade;
}
}
class EmployeeInfo {
    public int rank;
    EmployeeInfo(int rank) {
        this.rank = rank;
    }
}

class Person {
        public Object info;
        Person(Object info) {
            this.info = info; // 여기 object는 공통적인 언어로 모든곳에 쓰임
}
}

public class Main {
       public static void main(String[] args) { // 여기 스코어와
                Person p1 = new Person("부장");  // object를 썼기때문에ㅐ 여기 어떠한 말을 써도 되는 오류가 나타남
                EmployeeInfo ei = (EmployeeInfo)p1.info; // object 타입이라 괄호안에 형변화 시키는 변수를 넣는다 타입을 맞추기위해
           System.out.println(ei.rank);

            }

        }





