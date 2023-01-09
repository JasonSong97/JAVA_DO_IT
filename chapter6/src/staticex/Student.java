package staticex;

public class Student {
   // 멤버변수
   public static int serialNum = 1000;// static 변수는 인스턴스 생성과 상관없이 먼저 생성됨!!
   public int studentID;
   public String studentName;
   public int grade;
   public String address;

   // 메소드
   public String getStudentName(){
      return studentName;
   }
   public void setStudentName(String name){
      studentName = name;
   }
}
