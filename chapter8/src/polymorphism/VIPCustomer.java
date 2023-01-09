package polymorphism;

public class VIPCustomer extends Customer{
   // 멤버변수
   private int agentID;
   double saleRatio;

   // 생성자
   public VIPCustomer(int customerID, String customerName, int agentID){
      super(customerID, customerName);
      customerGrade = "VIP";// 상위 클래스에서 proteced 변수여서 가능!
      bonusRatio = 0.05;
      saleRatio = 0.1;
      this.agentID = agentID;
   }

   // 메소드
   @Override
   public int calcPrice(int price){
      bonusPoint += price * bonusRatio;// 보너스 포인트 적립
      return price - (int)(price * saleRatio);// 할인된 가격을 계산하여 반환
   }
   @Override
   public String showCustomerInfo(){
      return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
   }
   public int getAgentID(){
      return agentID;
   }
}
