package exception;

import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class ExceptionHandling1 {
   public static void main(String[] args) {
      try{
         FileInputStream fis = new FileInputStream("a.txt");
      }catch (FileNotFoundException e){
         System.out.println(e);// 예외 클래스의 toString() 메소드 호출
      }
      System.out.println("여기도 수행됩니다.");// 정상 출력
   }
}
