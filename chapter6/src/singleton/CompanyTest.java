package singleton;

public class CompanyTest {
   public static void main(String[] args) {
      Company myCompany1 = Company.getInstance();// 클래스 이름으로 getInstance() 호출하여 참조 변수 대입
      Company myCompany2 = Company.getInstance();// 클래스 이름으로 getInstance() 호출하여 참조 변수 대입

      System.out.println(myCompany1 == myCompany2);// 두 주소가 같은 주소 인지 확인!
   }
}
