package object;

class Student{
   // 멤버변수
   int studentID;
   String studentName;

   // 생성자
   public Student(int studentID, String studentName){
      this.studentID = studentID;
      this.studentName = studentName;
   }

   // 메소드
   @Override
   public String toString(){
      return studentID + "," + studentName;
   }
   @Override
   public boolean equals(Object obj){// equals 재정의
      if(obj instanceof Student){
         Student std = (Student) obj;
         if(this.studentID == std.studentID){// 재정의한 equals() 메소드는 학생의 학번이 같으면 true 반환
            return true;
         }else{
            return false;
         }
      }
      return false;
   }
   @Override
   public int hashCode(){// 해시 코드 값으로 학번을 반환하도록 메소드 재정의
      return studentID;
   }
}
public class EqualsTest {
   public static void main(String[] args) {
      Student studentLee = new Student(100, "이상원");
      Student studentLee2 = studentLee;// 주소값 복사
      Student studentSang = new Student(100, "이상원");

      System.out.println("=== 비교1 ===");
      if(studentLee == studentLee2){
         System.out.println("studentLee 와 studentLee2의 주소는 같습니다.");
      }else{
         System.out.println("studentLee 와 studentLee2의 주소는 다릅니다.");
      }
      if(studentLee.equals(studentLee2)){
         System.out.println("studentLee 와 studentLee2는 동일합니다.");
      }else{
         System.out.println("StudentLee 와 studentLee2는 동일하지 않습니다.");
      }

      System.out.println("=== 비교2 ===");
      if(studentLee == studentSang){
         System.out.println("studentLee 와 studentSang의 주소는 같습니다.");
      }else{
         System.out.println("studentLee 와 studentSang의 주소는 다릅니다.");
      }
      if(studentLee.equals(studentSang)){
         System.out.println("studentLee 와 studentSang는 동일합니다.");
      }else{
         System.out.println("StudentLee 와 studentSang는 동일하지 않습니다.");
      }

      System.out.println("=== 비교3 ===");
      System.out.println("studentLee 의 hashCode :" + studentLee.hashCode());
      System.out.println("studentSang 의 hashCode :" + studentSang.hashCode());

      System.out.println("studentLee 의 실제 주소 값 :" + System.identityHashCode(studentLee));
      System.out.println("studentSang 의 실제 주소 값 :" + System.identityHashCode(studentSang));
   }
}
