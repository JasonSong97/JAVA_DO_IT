package constructor;

public class PersonTest {
   public static void main(String[] args) {
      Person personKim = new Person();// 디폴트 생성자 후 인스턴스 변수 값 따로 초기화
      personKim.name = "김유신";
      personKim.height = 85.5F;
      personKim.weight = 180.0F;

      Person personLee = new Person("이순신", 175, 75);// 인스턴스 변수 초기화와 동시에 클래스 생성
   }
}
