package thisex;

class Person{
   // 멤버변수
   String name;
   int age;
   // 생성자
   public Person(){
      this("이름 없음", -1);// this를 사용해 Person(String, int) 생성자 호출!
   }
   public Person(String name, int age){// 요기로 오게 됩니다.!!
      this.name = name;
      this.age = age;
   }
   Person returnItSelf(){
      return this;// this 반환
   }
}
public class CallAnotherConst {
   public static void main(String[] args) {
      Person noName = new Person();
      System.out.println(noName.name);
      System.out.println(noName.age);
      
      Person p = noName.returnItSelf();// this 값을 클래스 변수에 대입
      System.out.println(p);// noName.returnIfSelf()의 반환 값 출력
      System.out.println(noName);// 참조 변수 출력
   }
}
