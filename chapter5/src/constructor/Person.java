package constructor;

public class Person {
   // 멤버변수
   String name;
   float height;
   float weight;
   // 생성자
   public Person(){}// 디폴트 생성자
   public Person(String pname){// 사람 이름을 매개변수로 받는 생성자
      name = pname;
   }
   public Person(String pname, float pheight, float pweight){// 이름 키 몸무게를 매개변수로 받는 생성자
      name = pname;
      height = pheight;
      weight = pweight;
   }
}
