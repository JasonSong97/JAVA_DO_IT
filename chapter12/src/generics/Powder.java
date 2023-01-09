package generics;

public class Powder extends Material{
   // 메소드
   @Override
   public void doPrinting(){
      System.out.println("Powder 재료로 출력합니다.");
   }
   @Override
   public String toString(){
      return "재료는 Podwer입니다.";
   }
}
