package staticex;

public class Student1 {
   // 멤버변수
   public static int serialNum = 1000;
   public int studentID;
   public String studentName;
   public int grade;
   public String address;

   // 생성자
   public Student1(){
      serialNum++;// 학생이 생성될 때마다 증가
      studentID = serialNum;// 증가된 값을 학번 인스턴스 변수에 부여
   }

   // 메소드
   public String getStudentName(){
      return studentName;
   }
   public void setStudentName(String name){
      studentName = name;
   }
}
