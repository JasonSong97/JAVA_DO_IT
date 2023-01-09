package cooperation;

public class Bus {
   // 멤버변수
   int busNumber;
   int passengerCount;
   int money;

   // 생성자
   public Bus(int busNumber){
      this.busNumber = busNumber;
   }

   // 메소드
   public void take(int money){// 승객이 버스에 탄 경우를 구현한 메서드
      this.money += money;// 버스 수입 증가!
      passengerCount++;// 승객 수 증가
   }
   public void showInfo(){// 버스 정보를 출력하는 메서드
      System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
   }
}
