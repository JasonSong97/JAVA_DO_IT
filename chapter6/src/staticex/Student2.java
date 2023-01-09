package staticex;

public class Student2 {
   // 멤버변수
   private static int serialNum = 1000;// private 변수로 변경
   int studentID;
   String studentName;
   int grade;
   String address;

   // 생성자
   public Student2(){
      serialNum++;
      studentID = serialNum;
   }

   //메소드
   public String getStudentName(){
      return studentName;
   }
   public void setStudentName(String name){
      studentName = name;
   }
   public static int getSerialNum(){// serialNum 의 get 메소드
      int i = 10;
      return serialNum;
   }
   public static void setSerialNum(int serialNum){// serialNum 의 set 메소드
      Student2.serialNum = serialNum;
   }
}
