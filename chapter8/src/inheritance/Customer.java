package inheritance;

public class Customer {
   // 멤버변수
   protected int customerID;
   protected String customerName;
   protected String customerGrade;
   int bonusPoint;
   double bonusRatio;

   // 생성자
   public Customer(int customerID, String customerName){// 디폴트 생성자!
      this.customerID = customerID;
      this.customerName = customerName;
      customerGrade = "SILVER";// 기본 등급!
      bonusRatio = 0.01;// 보너스 포인트 기본 적립 비율!
      System.out.println("Customer() 생성자 호출!!!!!!!!!");
   }

   // 메소드
   public int calcPrice(int price){// 보너스 포인트 적립, 지불 가격 계산 메소드
      bonusPoint += price * bonusRatio;// 보너스 포인트 계산 후 적립 그리고 할인 안되는 제품은 그래도 반환!
      return price;
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
   public String showCustomerInfo(){// 고객 정보를 반환 하는 메소드
      return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
   }
}
