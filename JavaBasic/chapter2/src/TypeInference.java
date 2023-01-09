public class TypeInference {
   public static void main(String[] args) {
      var i = 10;// int로 컴파일
      var j = 10.0;// double로 컴파일
      var str = "hello";// String로 컴파일

      System.out.println(i);
      System.out.println(j);
      System.out.println(str);

      str = "test";// 다른 문자열 대입 가능
      //str = 3;// 다른 형태 불가능
   }
}