package generics;

public class Point<T, V> {
   // 멤버변수
   T x;
   V y;

   // 생성자
   Point(T x, V y){
      this.x = x;
      this.y =y;
   }

   // 제네릭 메소드
   public T getX(){
      return x;
   }
   public V getY(){
      return y;
   }
}
