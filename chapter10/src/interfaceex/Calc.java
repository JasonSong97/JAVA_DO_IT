package interfaceex;

public interface Calc {
   // 변수 -> 상수
   double PI = 3.14;// 인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
   int ERROR = -999999999;// 인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨

   // 디폴트 메소드
   default void description(){
      System.out.println("정수 계산기를 요구합니다.");
      //myMethod();// 디폴트 메소드에서 private 메소드 호출
   }

   // 정적 메소드
   static int total(int[] arr){// 인터페이스에 정적메소드 total() 구현
      int total = 0;

      for(int i: arr){
         total += i;
      }
      //myStaticMethod();// 정적 메소드에서 private static 메소드 호출
      return total;
   }
   /*private void myMethod(){// private 메소드
      System.out.println("private 메소드입니다.");
   }
   private static void myStaticMethod(){// private static 메소드
      System.out.println("private static 메소드 입니다.");
   }*/


   // 메소드 -> 추상 메소드
   int add(int num1, int num2);// 인터페이스에서 선언한 메소드는 컴파일 과정에서 추상메소드로 변환!
   int substract(int num1, int num2);// 인터페이스에서 선언한 메소드는 컴파일 과정에서 추상메소드로 변환!
   int times(int num1, int num2);// 인터페이스에서 선언한 메소드는 컴파일 과정에서 추상메소드로 변환!
   int divide(int num1, int num2);// 인터페이스에서 선언한 메소드는 컴파일 과정에서 추상메소드로 변환!

}
