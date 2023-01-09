package inheritance;

public class VIPCustomer extends Customer{
   // 멤버변수
   private int agentID;
   double salesRatio;

   // 생성자
   public VIPCustomer(int customerID, String customerName, int agentID){
      super(customerID, customerName);
      this.agentID = agentID;
      customerGrade = "VIP";// 상위 클래스에서 proteced 변수여서 가능!
      bonusRatio = 0.05;
      salesRatio = 0.1;
      System.out.println("VIPCustomer() 생성자 호출!!!!!!!!!!");
   }

   // 메소드
   @Override
   public int calcPrice(int price){
      bonusPoint += price * bonusPoint;// 보너스 포인트 적립
      return price - (int)(price * salesRatio);// 할인된 가격을 계산하여 반환
   }
   public int getAgentID(){
      return agentID;
   }
}
