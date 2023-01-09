package polymorphism;

public class Customer {
   // 멤버변수
   protected int customerID;
   protected String customerName;
   protected String customerGrade;
   int bonusPoint;
   double bonusRatio;

   // 생성자
   public Customer(){
      initCustomer();// 고객 등급과 보너스 포인트 적립률 지정 함수 호출
   }
   public Customer(int customerID, String customerName){// 디폴트 생성자!
      this.customerID = customerID;
      this.customerName = customerName;
      initCustomer();// 고객 등급과 보너스 포인트 적립률 지정 함수 호출
   }

   // 메소드
   private void initCustomer(){// 생성자에서만 호출하는 메서드이므로 private + 멤버 변수의 초기화 부분
      customerGrade = "SILVER";
      bonusRatio = 0.01;
   }
   public int calcPrice(int price){// 보너스 포인트 적립, 지불 가격 계산 메소드
      bonusPoint += price * bonusRatio;// 보너스 포인트 계산 후 적립 그리고 할인 안되는 제품은 그래도 반환!
      return price;
   }
   public String showCustomerInfo(){// 고객 정보를 반환 하는 메소드
      return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint +  " 입니다.";
   }
   public int getCustomerID(){
      return customerID;
   }
   public void setCustomerID(int customerID){
      this.customerID = customerID;
   }
   public String getCustomerName(){
      return customerName;
   }
   public void setCustomerName(String customerName){
      this.customerName = customerName;
   }
   public String getCustomerGrade(){
      return customerGrade;
   }
   public void setCustomerGrade(String customerGrade){
      this.customerGrade = customerGrade;
   }
}
