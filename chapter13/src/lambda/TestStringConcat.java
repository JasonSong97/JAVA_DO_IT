package lambda;

public class TestStringConcat {
   public static void main(String[] args) {
      String s1 = "Hello";
      String s2 = "World";
      StringConcat concat1 = new StringConcatImpl();
      concat1.makeString(s1, s2);

      System.out.println("=== 람다식으로 구현 ===");
      String s3 = "Hi!";
      String s4 = "Good Morning~";
      StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
      concat2.makeString(s3, s4);

   }
}
