package classex;

public class ClassTest {
   public static void main(String[] args) throws ClassNotFoundException{// forName() 메소드에서 발생하는 예외를 처리함, 이름과 일치하는 클래스가 없는 경우 발생
      Person person = new Person();
      Class pClass1 = person.getClass();// Object 의 getClass() 메소드 사용하기
      System.out.println(pClass1.getName());

      Class pClass2 = Person.class;// 직접 class 파일 대입하기
      System.out.println(pClass2.getName());

      Class pClass3 = Class.forName("classex.Person");// 클래스 이름으로 가져오기
      System.out.println(pClass3.getName());
   }
}
