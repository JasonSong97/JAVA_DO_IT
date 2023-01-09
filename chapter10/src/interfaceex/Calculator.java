package interfaceex;

public abstract class Calculator implements Calc{// 추상 클래스: times()와 divide()를 구현 하지 않아서
   @Override
   public int add(int num1, int num2){
      return num1 + num2;
   }
   @Override
   public int substract(int num1, int num2){
      return num1 - num2;
   }
}
