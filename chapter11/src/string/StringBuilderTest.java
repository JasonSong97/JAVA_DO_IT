package string;

public class StringBuilderTest {
   public static void main(String[] args) {
      String javaStr = new String("java");
      System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));// 인스턴스가 처음 생성됬을 때 메모리 주소

      StringBuilder builder = new StringBuilder(javaStr);// String 으로 부터 StringBuiler 생성
      System.out.println("연산 전 builder 메모리 주소 : " + System.identityHashCode(builder));

      builder.append(" and");// 문자열 추가
      builder.append(" android");// 문자열 추가
      builder.append(" programming is fun!!");// 문자열 추가
      System.out.println("연산 후 builder 메모리 주소 : " + System.identityHashCode(builder));

      javaStr = builder.toString();// String 클래스로 반환
      System.out.println(javaStr);
      System.out.println("새로 만들어진 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));

   }
}
