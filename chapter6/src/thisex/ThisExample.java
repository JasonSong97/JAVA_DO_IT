package thisex;

class Birthday{
   int day;
   int month;
   int year;

   public void setYear(int year){
      this.year = year;
   }
   public void printThis(){
      System.out.println(this);// this 출력 메소드
   }
}
public class ThisExample {
   public static void main(String[] args) {
      Birthday bDay = new Birthday();
      bDay.setYear(2000);
      System.out.println(bDay);// 참조 변수 출력
      bDay.printThis();// this 출력 메소드 호출
   }
}
