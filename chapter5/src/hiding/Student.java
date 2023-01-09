package hiding;

public class Student {
   int studentID;
   private String studentName;
   int grade;
   String address;
   // get 메소드
   public String getStudentName(){
      return studentName;
   }
   // set 메소드
   public void setStudentName(String studentName){
      this.studentName = studentName;
   }
}
