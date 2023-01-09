package object;

class Point{// 원점을 의미하는 Point 클래스
   // 멤버변수
   int x;
   int y;

   // 생성자
   public Point(int x, int y){
      this.x = x;
      this.y = y;
   }

   // 메소드
   @Override
   public String toString(){
      return "x = " + x + "," + "y = " + y;
   }
}
class Circle implements Cloneable{// 객체를 복제해도 된다는 의미로 Clonnable 인터페이스를 함께 선언
   // 멤버 변수
   Point point;
   int radius;

   // 생성자
   Circle(int x, int y, int radius){
      this.radius = radius;
      point = new Point(x, y);
   }

   // 메소드
   @Override
   public String toString(){
      return "원점은 " + point + "이고, 반지름은" + radius + "입니다.";
   }
   @Override
   public Object clone() throws CloneNotSupportedException{// clone() 메소드를 사용할 때 발생할 수 있는 오류를 예외 처리함
      return super.clone();
   }
}
public class ObjectCloneTest {
   public static void main(String[] args) throws CloneNotSupportedException{
      Circle circle = new Circle(10, 20, 30);
      Circle copyCircle = (Circle) circle.clone();// clone() 메소드를 사용해 circle 인스턴스를 copyCircle에 복제함

      System.out.println(circle);
      System.out.println(copyCircle);
      System.out.println(System.identityHashCode(circle));
      System.out.println(System.identityHashCode(copyCircle));

   }
}
